package com.cni.pojo.company;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

/**
 * Neoman钮门公司提供的格式超差的XML接口
 * <p>
 * Created by CNI on 2018/1/16.
 */
public class NeomanInvalidXmlPojo {

    private int statusCode;

    private EmsInfoBean emsInfo;

    private List<TrackDataBean> trackData;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public EmsInfoBean getEmsInfo() {
        return emsInfo;
    }

    public void setEmsInfo(EmsInfoBean emsInfo) {
        this.emsInfo = emsInfo;
    }

    public List<TrackDataBean> getTrackData() {
        return trackData;
    }

    public void setTrackData(List<TrackDataBean> trackData) {
        this.trackData = trackData;
    }

    public boolean isSuccess() {
        return statusCode > 0;
    }


    @Override
    public String toString() {
        return "NeomanInvalidXmlPojo{" +
                "statusCode=" + statusCode +
                ", emsInfo=" + emsInfo +
                ", trackData=" + trackData +
                '}';
    }

    /**
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
    @XmlRootElement(name = "EMS_INFO")
    public static class EmsInfoBean {
        private String referNumber;
        private String item;
        private String number;
        private String from;
        private String destination;
        private String state;
        private String sign;
        private String trackingNumber;
        private String weight;
        private String date;

        @XmlElement(name = "REFER_NBR")
        public String getReferNumber() {
            return referNumber;
        }

        public void setReferNumber(String referNumber) {
            this.referNumber = referNumber;
        }

        @XmlElement(name = "ITEM")
        public String getItem() {
            return item;
        }

        public void setItem(String item) {
            this.item = item;
        }

        @XmlElement(name = "NUMBER")
        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        @XmlElement(name = "FROM")
        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        @XmlElement(name = "DES")
        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        @XmlElement(name = "STATE")
        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        @XmlElement(name = "SIGN")
        public String getSign() {
            return sign;
        }

        public void setSign(String sign) {
            this.sign = sign;
        }

        @XmlElement(name = "TRCKING_NBR")
        public String getTrackingNumber() {
            return trackingNumber;
        }

        public void setTrackingNumber(String trckingNumber) {
            this.trackingNumber = trckingNumber;
        }

        @XmlElement(name = "WEIGHT")
        public String getWeight() {
            return weight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }

        @XmlElement(name = "ADATE")
        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        @Override
        public String toString() {
            return "EmsInfoBean{" +
                    "referNumber='" + referNumber + '\'' +
                    ", item='" + item + '\'' +
                    ", number='" + number + '\'' +
                    ", from='" + from + '\'' +
                    ", destination='" + destination + '\'' +
                    ", state='" + state + '\'' +
                    ", sign='" + sign + '\'' +
                    ", trckingNumber='" + trackingNumber + '\'' +
                    ", weight='" + weight + '\'' +
                    ", date='" + date + '\'' +
                    '}';
        }
    }

    /**
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
    public static class TrackDataBean {
        private String dateTime;
        private String place;
        private String info;

        public String getDateTime() {
            return dateTime;
        }

        public void setDateTime(String dateTime) {
            this.dateTime = dateTime;
        }

        public String getPlace() {
            return place;
        }

        public void setPlace(String place) {
            this.place = place;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        @Override
        public String toString() {
            return "TrackDataBean{" +
                    "dateTime='" + dateTime + '\'' +
                    ", place='" + place + '\'' +
                    ", info='" + info + '\'' +
                    '}';
        }
    }
}
