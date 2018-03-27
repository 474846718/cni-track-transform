package com.cni.convert;

import com.cni.pojo.EcomXmlPojo;
import okhttp3.ResponseBody;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.util.StringUtils;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import retrofit2.Converter;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * 将请求的数据转换成EcomExpressXmlPojo
 * <p>
 * Created by CNI on 2018/1/16.
 */
public class EcomExpressResponseBodyConverter implements Converter<ResponseBody, EcomXmlPojo> {

    private static class ObjectHolder {

        static SAXParser saxParser;

        static {
            try {
                saxParser = SAXParserFactory.newInstance().newSAXParser();
            } catch (ParserConfigurationException | SAXException e) {
                e.printStackTrace();
            }
        }

        /*static DateTimeFormatter dateTimeFormatter;

        static {
            Map<Long, String> moy = new HashMap<>();
            moy.put(1L, "Jan");
            moy.put(2L, "Feb");
            moy.put(3L, "Mar");
            moy.put(4L, "Apr");
            moy.put(5L, "May");
            moy.put(6L, "Jun");
            moy.put(7L, "Jul");
            moy.put(8L, "Aug");
            moy.put(9L, "Sep");
            moy.put(10L, "Oct");
            moy.put(11L, "Nov");
            moy.put(12L, "Dec");
            dateTimeFormatter = new DateTimeFormatterBuilder()
                    .parseCaseInsensitive()
                    .parseLenient()
                    .appendValue(DAY_OF_MONTH, 1, 2, SignStyle.NOT_NEGATIVE)
                    .appendLiteral(' ')
                    .appendText(MONTH_OF_YEAR, moy)
                    .appendLiteral(", ")
                    .appendValue(YEAR, 4)  // 2 digit year not handled
                    .appendLiteral(", ")
                    .appendValue(HOUR_OF_DAY, 2)
                    .appendLiteral(':')
                    .appendValue(MINUTE_OF_HOUR, 2)
                    .toFormatter();
        }*/

        static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM, yyyy, HH:mm", Locale.ENGLISH);

    }

    @Override
    public EcomXmlPojo convert(ResponseBody value) throws IOException {
        EcomXmlPojo pojo = new EcomXmlPojo();
        final List<EcomXmlPojo.EcomExpressBean> list = new ArrayList<>();
        pojo.setList(list);
        try {
            synchronized (this) {
                ObjectHolder.saxParser.parse(value.byteStream(), new DefaultHandler() {
                    EcomXmlPojo.EcomExpressBean ecomExpressBean;
                    EcomXmlPojo.EcomExpressBean.ScanBean scanBean;
                    Object currentObject;
                    String currentTag;
                    String currentFieldName;
                    String fieldType;

                    @Override
                    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                        currentTag = qName;
                        if ("object".equals(qName)) {
                            String model = attributes.getValue("model");
                            if ("awb".equals(model)) {
                                ecomExpressBean = new EcomXmlPojo.EcomExpressBean();
                                list.add(ecomExpressBean);
                                currentObject = ecomExpressBean;
                            } else if ("scan_stages".equals(model)) {
                                if (ecomExpressBean != null) {
                                    List<EcomXmlPojo.EcomExpressBean.ScanBean> list;
                                    if (null == (list = ecomExpressBean.getScans())) {
                                        list = new ArrayList<>();
                                    }
                                    scanBean = new EcomXmlPojo.EcomExpressBean.ScanBean();
                                    list.add(scanBean);
                                    ecomExpressBean.setScans(list);
                                }
                                currentObject = scanBean;
                            }
                        } else if ("field".equals(qName)) {
                            currentFieldName = attributes.getValue("name");
                            fieldType = attributes.getValue("type");
                        }
                    }

                    @Override
                    public void endElement(String uri, String localName, String qName) throws SAXException {
                        currentTag = null;
                    }

                    @Override
                    public void characters(char[] ch, int start, int length) throws SAXException {
                        if ("field".equals(currentTag) && currentObject != null &&
                                !StringUtils.isEmpty(currentFieldName) && !StringUtils.isEmpty(fieldType)) {
                            String strValue = new String(ch, start, length).trim();
                            Object value = strValue;
                            if ("DateTimeField".equals(fieldType)) {
                                try {
                                    value = ObjectHolder.simpleDateFormat.parse(strValue);
                                } catch (ParseException e) {
                                    e.printStackTrace();
                                }
                            }
                            try {
                                BeanUtils.setProperty(currentObject, currentFieldName, value);
                            } catch (IllegalAccessException | InvocationTargetException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                });
            }
        } catch (SAXException e) {
            e.printStackTrace();
        }
        return pojo;
    }
}
