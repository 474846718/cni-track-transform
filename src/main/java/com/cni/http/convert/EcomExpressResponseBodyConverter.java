package com.cni.http.convert;

import com.cni.pojo.EcomExpressXmlPojo;
import okhttp3.ResponseBody;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import retrofit2.Converter;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 将请求的数据转换成EcomExpressXmlPojo
 * <p>
 * Created by CNI on 2018/1/16.
 */
public class EcomExpressResponseBodyConverter implements Converter<ResponseBody, EcomExpressXmlPojo> {

    private static class ObjectHolder {

        static SAXParser saxParser;

        static {
            try {
                saxParser = SAXParserFactory.newInstance().newSAXParser();
            } catch (ParserConfigurationException | SAXException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public EcomExpressXmlPojo convert(ResponseBody value) throws IOException {
        EcomExpressXmlPojo pojo = new EcomExpressXmlPojo();
        final List<EcomExpressXmlPojo.EcomExpressBean> list = new ArrayList<>();
        pojo.setList(list);
        try {
            ObjectHolder.saxParser.parse(value.byteStream(), new DefaultHandler() {
                Object currentObject;
                String currentFieldName;

                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    if ("object".equals(qName)) {
                        String model = attributes.getValue("model");
                        if ("awb".equals(model)) {
                            currentObject = new EcomExpressXmlPojo.EcomExpressBean();
                        } else if ("scan_stages".equals(model)) {
                            currentObject = new EcomExpressXmlPojo.EcomExpressBean.ScanBean();
                        }
                    } else if ("field".equals(qName)) {

                    }
                }

                @Override
                public void endElement(String uri, String localName, String qName) throws SAXException {

                }

                @Override
                public void characters(char[] ch, int start, int length) throws SAXException {
                    super.characters(ch, start, length);
                }
            });
        } catch (SAXException e) {
            e.printStackTrace();
        }
        return pojo;
    }
}
