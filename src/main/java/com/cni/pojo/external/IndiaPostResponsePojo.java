package com.cni.pojo.external;

import java.util.List;

/**
 * Created by CNI on 2018/1/17.
 */
public class IndiaPostResponsePojo {


    /**
     * awb : EQ949047113IN
     * bookAt : S.J. SORTING
     * bookOn : 19/12/2017
     * destinationPincode : 171205
     * tariff : 71.00
     * articleType : SPA
     * deliveredAt : Jubbal S.O
     * deliveredOn : 26/12/2017
     * details : [{"date":"26/12/2017","time":"11:00:00","office":"Jubbal S.O","event":"Item delivered [To: SEEMA PIRTA ]"},{"date":"26/12/2017","time":"09:47:22","office":"Jubbal S.O","event":"Item Received"},{"date":"26/12/2017","time":"09:47:21","office":"Jubbal S.O","event":"Bag Opened"},{"date":"26/12/2017","time":"09:27:47","office":"Jubbal S.O","event":"Bag Received"},{"date":"24/12/2017","time":"16:22:49","office":"NSH SHIMLA","event":"Bag Despatched to SHIMLA RMS"},{"date":"24/12/2017","time":"13:19:06","office":"NSH SHIMLA","event":"Item Bagged for Jubbal S.O"},{"date":"24/12/2017","time":"11:18:06","office":"NSH SHIMLA","event":"Item Received"},{"date":"24/12/2017","time":"11:18:05","office":"NSH SHIMLA","event":"Bag Opened"},{"date":"24/12/2017","time":"11:17:53","office":"NSH SHIMLA","event":"Bag Received"},{"date":"23/12/2017","time":"15:04:16","office":"Hatkoti S.O","event":"Bag Despatched to NSH SHIMLA"},{"date":"22/12/2017","time":"19:14:16","office":"Hatkoti S.O","event":"Item Bagged for NSH SHIMLA"},{"date":"22/12/2017","time":"08:38:00","office":"Hatkoti S.O","event":"Item delivery attempted Missent"},{"date":"22/12/2017","time":"08:33:54","office":"Hatkoti S.O","event":"Item Received"},{"date":"22/12/2017","time":"08:33:54","office":"Hatkoti S.O","event":"Bag Opened"},{"date":"22/12/2017","time":"08:20:56","office":"Hatkoti S.O","event":"Bag Received"},{"date":"21/12/2017","time":"17:43:49","office":"NSH SHIMLA","event":"Bag Despatched to SHIMLA RMS"},{"date":"21/12/2017","time":"15:13:08","office":"NSH SHIMLA","event":"Item Bagged for Hatkoti S.O"},{"date":"21/12/2017","time":"12:20:28","office":"NSH SHIMLA","event":"Item Received"},{"date":"21/12/2017","time":"12:20:28","office":"NSH SHIMLA","event":"Bag Opened"},{"date":"21/12/2017","time":"12:20:13","office":"NSH SHIMLA","event":"Bag Received"},{"date":"20/12/2017","time":"10:16:01","office":"NEW DELHI RS TMO","event":"Bag Received"},{"date":"20/12/2017","time":"03:40:11","office":"NSH NEW DELHI","event":"Bag Despatched to NEW DELHI RS TMO"},{"date":"20/12/2017","time":"02:50:46","office":"NSH NEW DELHI","event":"Item Bagged for NSH SHIMLA"},{"date":"20/12/2017","time":"02:14:10","office":"NSH NEW DELHI","event":"Item Received"},{"date":"19/12/2017","time":"23:48:39","office":"NSH NEW DELHI","event":"Bag Received"},{"date":"19/12/2017","time":"19:47:24","office":"S.J. SORTING","event":"Bag Despatched to NSH NEW DELHI"},{"date":"19/12/2017","time":"19:10:00","office":"S.J. SORTING","event":"Item Bagged for NSH NEW DELHI"},{"date":"19/12/2017","time":"16:24:08","office":"S.J. SORTING","event":"Item Booked"}]
     * tryTimes : 0
     * pageNum : 2
     */

    private String awb;
    private String bookAt;
    private String bookOn;
    private String destinationPincode;
    private String tariff;
    private String articleType;
    private String deliveredAt;
    private String deliveredOn;
    private int tryTimes;
    private int pageNum;
    private List<DetailsBean> details;

    public String getAwb() {
        return awb;
    }

    public void setAwb(String awb) {
        this.awb = awb;
    }

    public String getBookAt() {
        return bookAt;
    }

    public void setBookAt(String bookAt) {
        this.bookAt = bookAt;
    }

    public String getBookOn() {
        return bookOn;
    }

    public void setBookOn(String bookOn) {
        this.bookOn = bookOn;
    }

    public String getDestinationPincode() {
        return destinationPincode;
    }

    public void setDestinationPincode(String destinationPincode) {
        this.destinationPincode = destinationPincode;
    }

    public String getTariff() {
        return tariff;
    }

    public void setTariff(String tariff) {
        this.tariff = tariff;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    public String getDeliveredAt() {
        return deliveredAt;
    }

    public void setDeliveredAt(String deliveredAt) {
        this.deliveredAt = deliveredAt;
    }

    public String getDeliveredOn() {
        return deliveredOn;
    }

    public void setDeliveredOn(String deliveredOn) {
        this.deliveredOn = deliveredOn;
    }

    public int getTryTimes() {
        return tryTimes;
    }

    public void setTryTimes(int tryTimes) {
        this.tryTimes = tryTimes;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public List<DetailsBean> getDetails() {
        return details;
    }

    public void setDetails(List<DetailsBean> details) {
        this.details = details;
    }

    public static class DetailsBean {
        /**
         * date : 26/12/2017
         * time : 11:00:00
         * office : Jubbal S.O
         * event : Item delivered [To: SEEMA PIRTA ]
         */

        private String date;
        private String time;
        private String office;
        private String event;

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

        public String getOffice() {
            return office;
        }

        public void setOffice(String office) {
            this.office = office;
        }

        public String getEvent() {
            return event;
        }

        public void setEvent(String event) {
            this.event = event;
        }
    }
}
