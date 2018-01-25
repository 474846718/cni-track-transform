package com.cni.http.impl;

import com.cni.http.IndiapostService;
import com.cni.pojo.IndiapostHtmlPojo;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

/**
 * 实现类
 * <p>
 * Created by CNI on 2018/1/24.
 */
@Service
public class IndiapostServiceImpl implements IndiapostService {

    @Autowired
    private OkHttpClient httpClient;

    // Indiapost使用ASP.NET编写，参数中包含了VIEW_STATE，验证码等所有信息都包含在内
    private static final String HOME_PAGE_URL = "https://www.indiapost.gov.in/vas/Pages/IndiaPostHome.aspx";
    private static final String TRACK_PAGE_URL = "https://www.indiapost.gov.in/VAS/Pages/trackconsignment.aspx?t=";

    private static final String PARAM_START = "ctl00%24ScriptManager=ctl00%24SPWebPartManager1%24g_87566c95_41af_48d6_b8e3_c8bdba22523e%24ctl00%24upcaptcha%7Cctl00%24SPWebPartManager1%24g_87566c95_41af_48d6_b8e3_c8bdba22523e%24ctl00%24imgSearch1&_wpcmWpid=&wpcmVal=&MSOWebPartPage_PostbackSource=&MSOTlPn_SelectedWpId=&MSOTlPn_View=0&MSOTlPn_ShowSettings=False&MSOGallery_SelectedLibrary=&MSOGallery_FilterString=&MSOTlPn_Button=none&__EVENTTARGET=&__EVENTARGUMENT=&__REQUESTDIGEST=0x2B9B420C9AFE1536248070BDE8FFCD687E5426D409214D0364D9595E453FCA5DE9B159D214D411C2368E676E74BFB013FC91717529AF1EDA532CB8877304BD2C%2C24%20Jan%202018%2007%3A40%3A51%20-0000&MSOSPWebPartManager_DisplayModeName=Browse&MSOSPWebPartManager_ExitingDesignMode=false&MSOWebPartPage_Shared=&MSOLayout_LayoutChanges=&MSOLayout_InDesignMode=&_wpSelected=&_wzSelected=&MSOSPWebPartManager_OldDisplayModeName=Browse&MSOSPWebPartManager_StartWebPartEditingName=false&MSOSPWebPartManager_EndWebPartEditing=false&__VIEWSTATE=g6vjjHM5usMLGp%2FnjBftWTIusQoVjpnvowOJo2VKZbOSEmvYkjOZNwzQP1FAJOfcePrR%2B42AyUdheQ4%2Bxaq5js8LBN6H4tx%2BsAMGlMM1pVoIT0kC2OcT%2B0oaqhiDPUUB9ZP7Mrg6trzL4XtFf12q1AKgOjD4Wz0CmZQis4zpA3IjSks%2BCwLXpIvm9N6cptJkLcT6wV3UuhpI8kRGWdxMb%2BvV%2BZrJoLd8DZYBqFdhrX2iCO%2BZVRrbDrxSxvhHEWoCW1obKZhhMBU1lgh0fq%2FJayVEoGUlaabnGL2FNnYo%2BP64PbsLUXlslfLM8yJ%2F2kMRA%2FyEXp7Fd%2BvnkkVL%2BgjzNqTA%2FSG%2BgQge0erdHo7%2F4l30QX2o%2FL5%2FV6b7sOb90Av9HfqpHkEykSlec9sHZzH9qE%2FftMC4kPoqVhSi6Jv0%2BNkKtlKCSTyJO6gB7BXOilAZHhElR3lOTlL5pzphSSLRnZQb0VTx9u35PyU2frVhBY1IeHIkOq6tckrLryVme%2B%2B6eOxkhN4R%2Bk1E3VNQYtKKPEx6MdgOnJTCWp9o2fDjUPOQFQsdIcva38%2BVZUbvzML4xMyW1TVhM%2BH8uuvjzBNqlknLAebPyiQ9fEOa6Tqg1VtCNpLetxZpfLRDNLZ3E779rVuRuOlWgPeYKonJztGA3bmyqkRMRYdfUgPCAfHQuj7tj47PU12Kd3xsxE%2BFYk6W5VJ%2Fdx9hZPETTp7UbKg7MHnkhzg7eRwx4%2FL5t6fdsgHq6LVxcOv35xwHOC%2FvwBk%2B%2BwOhhecGeLIz7p5Htuo3wOZ9VhN40HMauB5HkGlE%2B%2B1O4Mkz%2Bc1HDDSPvv01C9hqmirqHP6q96CjeZsVyoN4K5xsQ%2BGtKBMHzGsBxWONndeshmboohXaaWISPkftaBtUXwr8SJ4fi0iolMOij6GO%2Fmv1zuIMbZHCWsFdfeARFS%2BqZmH15LONl0Lq8uJ3byxxqJP%2F53OZVvXOl37W%2FxYD7s5rMWVJEVheXaKAF2nnsyHMnyzKFgCUCqeZRi2o6m%2F1EGWbRTKJ9XrG6zFxneBtWfZMs9rY%2BCYK75kED0jKI%2BOfoKswtVVHtRRQjDq%2FZ0ZJsNjJVDrEmsV9Hk23FBF734KQ4uQiVxFDzJKi1juWhsK1gvApDxiLqHtyuaqSBPS8GeusXnEYFy5LtQfJwTN8oqoQysg6g5DqZcqe8%2FQRaBkBVZL1kOPK%2BFbkJtUm9JPvQwVj3WXeaHXVpE%2BN7m0iQu0so%2Fp24nfrMAjHyz%2Fr91dvGLhXaQKwSPTVYehdJWSOAuR%2B3XEqLN88veNDc1v0XpEZkXtZfrxm3Or8n1nVkA5id3GyLrUFalekt%2BLi71lx3SELvN3%2Bd1K4%2B8WTcWS0e3iZ0GDwJ2OwG%2BzI0QuBQYFkrtltjRJC0UcJSn5AIVLrMhk2mgxX%2FHl53TOwHha1YOdIMqXDdDogIXHX01W1ie9N7dFAF2Mdnk5haZo1cgyuLvQA8bSWFg2ie383m99WGMOygKCj5oOrb81leRs66L0Yh%2Fks1FM%2B2ls1Dp5nCy9ySC6U%2F0bZ9Pnjy9H%2F5fDEfH5pXRxGoUO5dVj4hDDOG5k%2Bm6dHbxNJFBKTmuEogjy51x5qDRAhW2WAmPtAf%2F9SWmiHhP4odGJXzCLpOBzV415JSDJIFw6TsOMyP%2FiMcXEM4ndBUxdIQZbvIZpaFm69QUvSjSdLJf3%2FZ98PoxIOITMK7mF03mZvq63XNEF0iJ%2BqsjqK7jwjlxF%2BzqHwSPJKiC0f8NvscvUuFVFIVxYtrA4L%2FuX5%2FjG3n1I4D74Iz21wDP7Mc%2B6TfXOEVm1JUpz5ArPaUPjpRqcU0Q%2FV%2BIt8fpG4HH6UAvWNhz4%2By92K%2B8ag%2FlEj%2BCV1hLF9ICse7qtvrK4EiKzB6RoeEp9M7e8k3MF2bY3epMmsGv7Ac4qRB159JmdR6Gz6mgjT%2B%2FnSMo2lauqRlZbPZBVbdhqAeV1mKhAIC9dR%2BR8RNGIyMAmI7dEvwRJjFMRthkrYIMCz9GSRvKMkZQ8iyRWSMEnY%2B9DzSGD8Wdvdabr2R1NXnmQxHZEV%2FjZCt3Ctsun8Zyr1fHHqht98LiUO2NIvSIvDL4ruLDbwd6J3rkwFpYm41waKrQ%2BNx0l7K67SxKZRkOhzPYOjVDql3GJvpSiyi4YjpR8siFC%2FUfEoA0kvNxxwF%2BtA2tYt4lA3IA7M%2FfL0xCs1LeSsVu2YdiED30tAmAMl2jcsAOoPONQ6Una7SoKWc7SQoZi2armYLbKjKm0zaNgZ0ZmGVTugbyigoxSkUYFDVIuLg0N4Z3f%2BEg7irE3xFP%2BimAAjg82tx1GR6VOJM2BvB%2BDVkW0226iCHKGxuxl9IQLlY1y5mV9GouAMNyMMnMISwxjhRpy9hlTxuaKPJ4m1OPFZrUUusHrZS5UjFRQzv%2BtErNBywbOu8gVa0PKCBH%2F2yA2t85YbhAm2lGwZDAuP%2BFKV%2BQWJLdsmzBqYDh%2FSXDLhCWpp9iSNVGIFWApJstz1aeNNUGats17s0ewyjdUzthVr%2BNyhkf3OrzcFHfUSa0fKG9fQbR0OKNWxdqsBwi1BX8AV2MVwVuVYq7pgGnHJCGrxqDuKyYHEZ1kmJvLZWuFylT3U8VEWLn%2B4g16PJnAdqUA%2Fut9nMCZu9gSb%2FxiMa7%2Bq1IE50X31UMFH8ayyqnxQDZgweiisop3gKp9ce3ay5ra3Z9I%2FgMQRHWWx29hm4DiHkw7dhRBW7KY1rZvJ3UJty%2FBTT0sOIiPzCI473quaz5DQGigg%2BMCXtKitRqhrUS9TZP9Y7x9cPyBZpxyS0qh9KlCwK%2FWdjyibzgfdR23hGBS04UaRUfTwOuHpvWSHf47E7cKpTaXqi4%2FeWikfQMVNeokaEyqCa%2FkZj%2Bmd8tInP9zNdbk%2BI6fztM4l9sgHGZXCajqCDkl914maEayv9Hv%2FxbX5jfCOqpXnnpwBgMl68XQ6TKPv3esp4KNRUq2xghVu8V%2FbZpn%2F9h2SnwzxExPGpUBP3O%2BcHVXxkgzsyqL7CoySAoSm1yb3e%2BtT7lUsaa2I1pInQjT8zudjywZ5q5KiTQwmvweUY4sMZ1Cto7d%2FqwXaSiVm9BDQH%2FGjy0ppaoB0JrYkI7m9hKM0IMjLUx1hTR2ZcXjqz8PWAhLEhZqOIgEaOc7t43K0RDFDGkBKdGXMEsDRlUOz8CJ%2FQf7fglnO9OWf9XFnxiXbjPaZsc981kri8Eo3n7U8qw8SJLiudoDQYkiu6YPOxQSWFzP5sYenDHR4B16HckTPPdTfUn37GPE3uQg7bpA19n9%2FmYz8KNTfktAF307CK9SfODF22i9rGxBEfxT1tfH7YO0oWMHb7BTprtx%2FEoFtG%2BQQ0PtHupzKIbmdz78YUjn35g2OMNskfURDxNvGqDSxwsmLlhZPZs4swXKe0BmNagET3Qk6Sq%2BveWIGTByC4ktEOoCO0JZ8MzhcV8mhZUnqfKeG4U%2FawLb1DyZATU5CDW8LbSAiQNbDlJXysTgr1AQHeWMuPOGy37zITifaYIqwzPicnozJlluyC7tI4Zx8MsFVDhBC3RSklYa6MXy6SMoaLaUrOhP95Qd2CBWw5ciIPakMal09iW37KiEUbVPMV7V%2F4edf6im%2BWzTb5PLIN3AAJDpHgiOgcH9knXMtZelxDVzJ3oewDiyofea%2Fv25QVhibL5%2BjOd8GutWgXcJ2UH40ossXIdt9vNR%2BrKq5UehGSdRg%2Bzizj1uBymcWXyEXsMHF%2FKjhZ3HkTLlAQzhTO1m2pg2RvKAuWWowrq1JXYj0SVKeGxAB3Mm356NZ%2B4Bx7n5BwE%2BbUENIgLBqWLnIguc0bBqchDzB%2FoguxdKjxn0ibfZH2uaVEXpD8Yex45wpqV%2BF%2BpaRLrrqW7Z%2BiTVlEd5i%2B4MiZoPLhJZi%2BRw1ieh1PUPFKaBLLUu2GC4DKwdXBxQVDp1ns1ILVaz7FI7KNnyWJ2ebPSoRrjqYs97mX0EgXGVzToY5kLKWEGcFs3ixVhVo21xc6w7sQGMKPVY6xRc5OGK5xYgxoICk%2FJay9rjcIPBdTA7%2BjK6vcV17tZKdyYhSFmw6U96gEbbbPh2KagylniQqouYniGVYrxpzbrDIxaPQ9IQrjwvSOup7tsmLnAtrOzyQ%2BOCmBcTv7WiknZE9cZAxR%2FMntT8Vgkcv7%2FmqENbu6moBp4gSzFQuY4STeVJlKcVCx9wY6j1WU269oGG5esmGKYeHf%2Bl0dMSxwNclV8TI%2BqfOknqL32%2FOrhras2UKuMTcQcMZjSwStjFWPj8XOruC80rcsOiGgyPxO07heGmZUh%2FhzFymDhlrINQ%2BSF%2BRTmqr9EwuvGb4%2FZnQP9ttdrLXdAY72wOVlWJIekagmzbhS%2BnRHwc67TSH%2FG9214xAuT0VIXiy2w%3D%3D&__VIEWSTATEGENERATOR=BE1C93B0&__VIEWSTATEENCRYPTED=&__EVENTVALIDATION=BaJzj3tY3q3xjj6th3qtYuQZWMi6FBLtjpjAzZqDiFsFCX5ldRovkI3IxMqffyp3S413WtO2A%2BjlTcT3vHcs3eIo6xM1H56Dk6%2Bt6n8Fnt95Y5kdMCyzKvQlQ%2Bx6BQXbFkTWLN9geU22QCgYSA8Kbhx%2FCqTTwscWBJ8Dje89%2BcuDZnHsTZwcDJEtJPS9bTRzOLKIW3DbH0Sm%2Fc8cdKiL0a2xkvfIiLm6A4RiqX26WBV0yPT2YOE7u5XE5x%2FDYCxCeDq3MhRxT%2FFLEpcK10FjtP5Kdaq5KiAeKNmsD4XJZwceukBAHTbBzUoKH7aJhl8h&ctl00%24SPWebPartManager1%24g_b2ce0a1c_928c_4ecd_877f_df98cc1b2e11%24ctl00%24hdnIsPostBack=true&ctl00%24SPWebPartManager1%24g_87566c95_41af_48d6_b8e3_c8bdba22523e%24ctl00%24hdnIsPostBack=false&ctl00%24SPWebPartManager1%24g_87566c95_41af_48d6_b8e3_c8bdba22523e%24ctl00%24Track=rbTrackConsignment&ctl00%24SPWebPartManager1%24g_87566c95_41af_48d6_b8e3_c8bdba22523e%24ctl00%24txtTrackConsign=";
    private static final String PARAM_END = "&ctl00%24SPWebPartManager1%24g_87566c95_41af_48d6_b8e3_c8bdba22523e%24ctl00%24txtTrackComplaint=Enter%20N%20digit%20complaint%20number&ctl00%24SPWebPartManager1%24g_87566c95_41af_48d6_b8e3_c8bdba22523e%24ctl00%24txtCaptcha=d35be6&__ASYNCPOST=true&ctl00%24SPWebPartManager1%24g_87566c95_41af_48d6_b8e3_c8bdba22523e%24ctl00%24imgSearch1=Track%20Now";

    private static final String URL_TOKEN_START = "pageRedirect||%2fVAS%2fPages%2ftrackconsignment.aspx%3ft%3d";
    private static final String URL_TOKEN_END = "%3d%3d|";

    private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.132 Safari/537.36";

    private static final String JQUERY_MAIN_TABLE_ID = "#ctl00_SPWebPartManager1_g_d6d774b9_498e_4de6_8690_a93e944cbeed_ctl00_gvTrckMailArticleDtls";
    private static final String JQUERY_DETAIL_TABLE_ID = "#ctl00_SPWebPartManager1_g_d6d774b9_498e_4de6_8690_a93e944cbeed_ctl00_gvTrckMailArticleEvnt";

    @Override
    public String getToken(String awb) throws IOException {
        final String param = PARAM_START + awb + PARAM_END;
        RequestBody requestBody = RequestBody.create(null, param.getBytes());
        Request request = new Request.Builder()
                .url(HOME_PAGE_URL)
                .addHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_FORM_URLENCODED_VALUE)
                .addHeader(HttpHeaders.USER_AGENT, USER_AGENT)
                .post(requestBody)
                .build();
        okhttp3.Call homePage = httpClient.newCall(request);
        try (okhttp3.Response response = homePage.execute()) {
            String firstLine = response.body().source().readUtf8Line();
            int startPos = firstLine.indexOf(URL_TOKEN_START) + URL_TOKEN_START.length();
            int endPos = firstLine.indexOf(URL_TOKEN_END) + URL_TOKEN_END.length();
            String token = firstLine.substring(startPos, endPos - 1);
            return URLDecoder.decode(token);
        }
    }

    @Override
    public String getHtml(String token) throws IOException {
        Request request = new Request.Builder()
                .url(TRACK_PAGE_URL + token)
                .addHeader(HttpHeaders.CONTENT_TYPE, MediaType.TEXT_HTML_VALUE)
                .addHeader(HttpHeaders.USER_AGENT, USER_AGENT)
                .get()
                .build();
        try (ResponseBody body = httpClient.newCall(request).execute().body()) {
            return body.string();
        }
    }

    @Override
    public IndiapostHtmlPojo transform(String html) throws NotFoundException {
        IndiapostHtmlPojo pojo = new IndiapostHtmlPojo();
        Document document = Jsoup.parse(html);
        Elements mainTds = document.select(JQUERY_MAIN_TABLE_ID + " " + "tr:eq(1) td");
        if (mainTds.size() == 0) {
            throw new NotFoundException("查无此单号");
        }
        pojo.setBookAt(mainTds.eq(0).text());
        pojo.setBookOn(mainTds.eq(1).text());
        pojo.setDestinationPincode(mainTds.eq(2).text());
        pojo.setTariff(mainTds.eq(3).text());
        pojo.setArticleType(mainTds.eq(4).text());
        pojo.setDeliveredAt(mainTds.eq(5).text());
        pojo.setDeliveredOn(mainTds.eq(6).text());
        Elements trs = document.select(JQUERY_DETAIL_TABLE_ID + " " + "tr");
        int rows = trs.size();
        List<IndiapostHtmlPojo.DetailsBean> detailList = new ArrayList<>(rows);
        pojo.setDetails(detailList);
        for (int i = 1; i <= rows; i++) {
            Elements tds = trs.eq(i).select("td");
            IndiapostHtmlPojo.DetailsBean detail = new IndiapostHtmlPojo.DetailsBean();
            detailList.add(detail);
            detail.setDate(tds.eq(0).text());
            detail.setTime(tds.eq(1).text());
            detail.setOffice(tds.eq(2).text());
            detail.setEvent(tds.eq(3).text());
        }
        return pojo;
    }

}
