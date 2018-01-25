package com.cni;

import com.cni.http.IndiapostService;
import com.cni.http.impl.IndiapostServiceImpl;
import com.cni.http.impl.NotFoundException;
import com.cni.pojo.IndiapostHtmlPojo;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

/**
 * 测试Jsoup的功能
 * <p>
 * Created by CNI on 2018/1/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {IndiapostServiceImpl.class, CniLinkCoreApplication.BeanConfig.class})
public class JsoupTest {

    @Autowired
    private IndiapostService indiapostService;

    @Test
    public void testConnect() throws IOException {
        Document document = Jsoup.connect("https://www.indiapost.gov.in/VAS/Pages/trackconsignment.aspx")
                .data("t", "rYK8weo+4tlaFdwAc9f1yg==")
                .userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.132 Safari/537.36")
                .timeout(3000)
                .get();
        Elements select = document.select("#ctl00_SPWebPartManager1_g_d6d774b9_498e_4de6_8690_a93e944cbeed_ctl00_divTrckMailArticleDtls");
        System.out.println(select);
    }

    @Test
    public void testIndiapostService() throws IOException, NotFoundException {
        for (int i = 0; i < 1000; i++) {
            long start = System.currentTimeMillis();
            String token = indiapostService.getToken("EQ949044063IN");
            String html = indiapostService.getHtml(token);
            IndiapostHtmlPojo pojo = indiapostService.transform(html);
            long end = System.currentTimeMillis();
            long duration = end - start;
            System.out.println(pojo);
            System.out.println(duration);
        }
    }

}
