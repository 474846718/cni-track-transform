package com.cni.convert;

import com.cni.pojo.NeomanInvalidXmlPojo;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import retrofit2.Converter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 将相应体信息转成NeomanInvalidXmlPojo类对象
 * <p>
 * Created by CNI on 2018/1/16.
 */
public class NeomanResponseBodyConverter implements Converter<ResponseBody, NeomanInvalidXmlPojo> {

    private static final String EMS_INFO_END_TAG = "</EMS_INFO>";

    private static class ObjectHolder {
        static Unmarshaller emsUnmarshaller;

        static {
            try {
                emsUnmarshaller = JAXBContext.newInstance(NeomanInvalidXmlPojo.EmsInfoBean.class).createUnmarshaller();
            } catch (JAXBException e) {
                e.printStackTrace();
            }
        }

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
    public NeomanInvalidXmlPojo convert(ResponseBody body) throws IOException {
        BufferedSource source = body.source();
        NeomanInvalidXmlPojo pojo = new NeomanInvalidXmlPojo();
        try {
            int status = Integer.parseInt(source.readUtf8Line());
            pojo.setStatusCode(status);
            if (status < 0) return pojo;
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
        String remain = source.readUtf8();

        /*
         * <EMS_INFO>
         * <TRCKING_NBR>1521512744980</TRCKING_NBR>
         * <NUMBER>1521512744980</NUMBER>
         * <FROM></FROM>
         * <DES>India</DES>
         * <REFER_NBR>215662201</REFER_NBR>
         * <ITEM>1</ITEM>
         * <WEIGHT>0.383</WEIGHT>
         * <STATE>3</STATE>
         * <ADATE>2018.01.10 10:22</ADATE>
         * <SIGN>OK.</SIGN>
         * </EMS_INFO>
         */
        int tagPos = remain.indexOf(EMS_INFO_END_TAG);
        int emsInfoEndPos = tagPos + EMS_INFO_END_TAG.length();
        String strEmsInfo = remain.substring(0, emsInfoEndPos);
        try {
            NeomanInvalidXmlPojo.EmsInfoBean emsInfo = (NeomanInvalidXmlPojo.EmsInfoBean) ObjectHolder.emsUnmarshaller.unmarshal(new StringReader(strEmsInfo));
            pojo.setEmsInfo(emsInfo);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        /*
         * <TRACK_DATA>
         * <DATETIME>2018-01-07 07:52</DATETIME><PLACE>International Fulfillment Center</PLACE><INFO>Check In Scan</INFO>
         * <DATETIME>2018-01-07 14:06</DATETIME><PLACE>International Fulfillment Center</PLACE><INFO>Package Dispatched</INFO>
         * <DATETIME>2018-01-06 12:31</DATETIME><PLACE>Mumbai_Chndivli_PC (Maharashtra)</PLACE><INFO>Consignment Manifested[WAITING_PICKUP]</INFO>
         * <DATETIME>2018-01-07 04:45</DATETIME><PLACE>Mumbai_Chndivli_PC (Maharashtra)</PLACE><INFO>Out for Pickup[WAITING_PICKUP]</INFO>
         * <DATETIME>2018-01-09 04:57</DATETIME><PLACE>Mumbai_Chndivli_PC (Maharashtra)</PLACE><INFO>Out for Pickup[WAITING_PICKUP]</INFO>
         * <DATETIME>2018-01-09 05:26</DATETIME><PLACE>Mumbai_Chndivli_PC (Maharashtra)</PLACE><INFO>Shipment Picked Up from Client Location[PICKUP]</INFO>
         * <DATETIME>2018-01-09 06:07</DATETIME><PLACE>Mumbai_Chndivli_PC (Maharashtra)</PLACE><INFO>Shipment Recieved at Origin Center[IN_TRANSIT]</INFO>
         * <DATETIME>2018-01-09 11:04</DATETIME><PLACE>Mumbai Hub (Maharashtra)</PLACE><INFO>Consignment received[IN_TRANSIT]</INFO>
         * <DATETIME>2018-01-09 11:32</DATETIME><PLACE>Mumbai Hub (Maharashtra)</PLACE><INFO>Consignment dispatched from origin city[IN_TRANSIT]</INFO>
         * <DATETIME>2018-01-10 01:31</DATETIME><PLACE>Delhi_Gateway_HB (Delhi)</PLACE><INFO>Consignment received at destination city[IN_TRANSIT]</INFO>
         * <DATETIME>2018-01-10 08:51</DATETIME><PLACE>Delhi_Timarpur (Delhi)</PLACE><INFO>Received at destination city[REACHED_DEST_CITY]</INFO>
         * <DATETIME>2018-01-10 09:09</DATETIME><PLACE>Delhi_Timarpur (Delhi)</PLACE><INFO>Bulk update[REACHED_DEST_CITY]</INFO>
         * <DATETIME>2018-01-10 09:19</DATETIME><PLACE>Delhi_Timarpur (Delhi)</PLACE><INFO>Out for delivery[OUT_DELIVERY]</INFO>
         * <DATETIME>2018-01-10 10:22</DATETIME><PLACE>Delhi_Timarpur (Delhi)</PLACE><INFO>Delivered[DELIVERED]</INFO>
         * </TRACK_DATA>
         */
        remain = remain.substring(emsInfoEndPos + 1).trim();
        try {
            final List<NeomanInvalidXmlPojo.TrackDataBean> list = new ArrayList<>();
            pojo.setTrackData(list);
            ObjectHolder.saxParser.parse(new InputSource(new StringReader(remain)), new DefaultHandler() {
                NeomanInvalidXmlPojo.TrackDataBean trackData;
                String currentTag;

                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    currentTag = qName;
                    if ("DATETIME".equals(currentTag)) {
                        trackData = new NeomanInvalidXmlPojo.TrackDataBean();
                        list.add(trackData);
                    }
                }

                @Override
                public void endElement(String uri, String localName, String qName) throws SAXException {
                    if ("INFO".equals(qName)) {
                        currentTag = "";
                    }
                }

                @Override
                public void characters(char[] ch, int start, int length) throws SAXException {
                    switch (currentTag) {
                        case "DATETIME":
                            trackData.setDateTime(new String(ch, start, length));
                            break;
                        case "PLACE":
                            trackData.setPlace(new String(ch, start, length));
                            break;
                        case "INFO":
                            trackData.setInfo(new String(ch, start, length));
                            break;
                    }
                }
            });
        } catch (SAXException e) {
            e.printStackTrace();
        }
        return pojo;
    }
}
