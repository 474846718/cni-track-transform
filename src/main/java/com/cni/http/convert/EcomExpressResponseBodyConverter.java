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
        final EcomExpressXmlPojo pojo = new EcomExpressXmlPojo();
        try {
            ObjectHolder.saxParser.parse(value.byteStream(), new DefaultHandler() {


                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

                }

                @Override
                public void endElement(String uri, String localName, String qName) throws SAXException {
                    super.endElement(uri, localName, qName);
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
