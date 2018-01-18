package com.cni.pojo.external;

import java.util.List;

/**
 * Created by CNI on 2018/1/17.
 */
public class EcomResponsePojo {


    /**
     * awb : 223740229
     * orderNumber : 402-8065871-1857962E
     * currentStatus : Delivered
     * requestTime : 03-Jan-2018 06:08
     * scans : [{"date":"10 Jan, 2018","time":"10:47 hrs","location":"DELHI","description":"Shipment delivered"},{"date":"10 Jan, 2018","time":"09:00 hrs","location":"DELHI","description":"Out for Delivery"},{"date":"10 Jan, 2018","time":"07:18 hrs","location":"DELHI","description":"Shipment in-scan at DC"},{"date":"10 Jan, 2018","time":"07:17 hrs","location":"DELHI","description":""},{"date":"10 Jan, 2018","time":"07:16 hrs","location":"DELHI","description":"Bag scanned at DC"},{"date":"10 Jan, 2018","time":"05:32 hrs","location":"DELHI","description":""},{"date":"10 Jan, 2018","time":"04:59 hrs","location":"DELHI","description":"Bag connected from HUB"},{"date":"09 Jan, 2018","time":"23:49 hrs","location":"DELHI","description":"Bag scanned at Hub"},{"date":"09 Jan, 2018","time":"23:40 hrs","location":"DELHI","description":"Shipments arrives at Processing center"},{"date":"09 Jan, 2018","time":"23:40 hrs","location":"DELHI","description":"Shipment connected to DELHI - DLB "},{"date":"09 Jan, 2018","time":"14:37 hrs","location":"MUMBAI","description":"Pickup Failed, Shipment Not Handed Over"},{"date":"09 Jan, 2018","time":"11:51 hrs","location":"MUMBAI","description":"Out for Pickup"},{"date":"09 Jan, 2018","time":"09:57 hrs","location":"MUMBAI","description":"Pickup Assigned"},{"date":"09 Jan, 2018","time":"07:06 hrs","location":"MUMBAI","description":"Pickup Rescheduled For Next Day"},{"date":"08 Jan, 2018","time":"14:43 hrs","location":"MUMBAI","description":"Pickup Failed, Shipment Not Handed Over"},{"date":"08 Jan, 2018","time":"11:57 hrs","location":"MUMBAI","description":"Out for Pickup"},{"date":"08 Jan, 2018","time":"09:34 hrs","location":"MUMBAI","description":"Pickup Assigned"},{"date":"08 Jan, 2018","time":"07:05 hrs","location":"MUMBAI","description":"Pickup Rescheduled For Next Day"},{"date":"07 Jan, 2018","time":"07:06 hrs","location":"MUMBAI","description":"Pickup Rescheduled For Next Day"},{"date":"06 Jan, 2018","time":"14:48 hrs","location":"MUMBAI","description":"Pickup Failed, Shipment Not Handed Over"},{"date":"06 Jan, 2018","time":"12:09 hrs","location":"MUMBAI","description":"Out for Pickup"},{"date":"06 Jan, 2018","time":"09:47 hrs","location":"MUMBAI","description":"Pickup Assigned"},{"date":"06 Jan, 2018","time":"07:06 hrs","location":"MUMBAI","description":"Pickup Rescheduled For Next Day"},{"date":"05 Jan, 2018","time":"17:09 hrs","location":"MUMBAI","description":"Pickup Failed, Shipment Not Handed Over"},{"date":"05 Jan, 2018","time":"09:54 hrs","location":"MUMBAI","description":"Out for Pickup"},{"date":"05 Jan, 2018","time":"09:50 hrs","location":"MUMBAI","description":"Pickup Assigned"},{"date":"05 Jan, 2018","time":"07:07 hrs","location":"MUMBAI","description":"Pickup Rescheduled For Next Day"},{"date":"04 Jan, 2018","time":"14:07 hrs","location":"MUMBAI","description":"Pickup Failed, Shipment Not Handed Over"},{"date":"04 Jan, 2018","time":"11:41 hrs","location":"MUMBAI","description":"Out for Pickup"},{"date":"04 Jan, 2018","time":"09:27 hrs","location":"MUMBAI","description":"Pickup Assigned"},{"date":"04 Jan, 2018","time":"07:05 hrs","location":"MUMBAI","description":"Pickup Rescheduled For Next Day"},{"date":"03 Jan, 2018","time":"12:51 hrs","location":"MUMBAI","description":"Pickup Failed, Road Blocked/Premise Inaccessible"},{"date":"03 Jan, 2018","time":"12:28 hrs","location":"MUMBAI","description":"Pickup Assigned"},{"date":"03 Jan, 2018","time":"07:05 hrs","location":"MUMBAI","description":"Pickup Rescheduled For Next Day"},{"date":"03 Jan, 2018","time":"06:08 hrs","location":"MUMBAI","description":"Shipment Information Received"}]
     * errorInfo : null
     */

    private String awb;
    private String orderNumber;
    private String currentStatus;
    private String requestTime;
    private Object errorInfo;
    private List<ScansBean> scans;

    public String getAwb() {
        return awb;
    }

    public void setAwb(String awb) {
        this.awb = awb;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public Object getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(Object errorInfo) {
        this.errorInfo = errorInfo;
    }

    public List<ScansBean> getScans() {
        return scans;
    }

    public void setScans(List<ScansBean> scans) {
        this.scans = scans;
    }

    public static class ScansBean {
        /**
         * date : 10 Jan, 2018
         * time : 10:47 hrs
         * location : DELHI
         * description : Shipment delivered
         */

        private String date;
        private String time;
        private String location;
        private String description;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
