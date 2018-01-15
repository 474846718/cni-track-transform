package com.cni.pojo.external;

import java.util.List;

/**
 * Bluedart公司返回数据
 * <p>
 * 示例：
 * {
 * "waybill": "59638108526",
 * "refNo": "199644521E12010250",
 * "statusScans": [
 * {
 * "location": "Mahadevapura Indus. Area",
 * "details": "Returned To Origin At Shipper'S Request",
 * "date": "14-Dec-2017",
 * "time": "17:45"
 * },
 * {
 * "location": "Mahadevapura Indus. Area",
 * "details": "Undelivered Shipment Held At Location",
 * "date": "14-Dec-2017",
 * "time": "10:44"
 * },
 * {
 * "location": "Mahadevapura Indus. Area",
 * "details": "Need Department Name/Extention Number",
 * "date": "13-Dec-2017",
 * "time": "17:03"
 * },
 * {
 * "location": "Mahadevapura Indus. Area",
 * "details": "Shipment Out For Delivery",
 * "date": "13-Dec-2017",
 * "time": "09:31"
 * },
 * {
 * "location": "Mahadevapura Indus. Area",
 * "details": "Need Department Name/Extention Number",
 * "date": "12-Dec-2017",
 * "time": "12:36"
 * },
 * {
 * "location": "Mahadevapura Indus. Area",
 * "details": "Shipment Out For Delivery",
 * "date": "12-Dec-2017",
 * "time": "09:37"
 * },
 * {
 * "location": "Mahadevapura Indus. Area",
 * "details": "Need Department Name/Extention Number",
 * "date": "11-Dec-2017",
 * "time": "15:10"
 * },
 * {
 * "location": "Mahadevapura Indus. Area",
 * "details": "Shipment Out For Delivery",
 * "date": "11-Dec-2017",
 * "time": "09:40"
 * },
 * {
 * "location": "Mahadevapura Indus. Area",
 * "details": "Holiday, Delivery On Next Business Day",
 * "date": "09-Dec-2017",
 * "time": "10:42"
 * },
 * {
 * "location": "Mahadevapura Indus. Area",
 * "details": "Need Department Name/Extention Number",
 * "date": "08-Dec-2017",
 * "time": "15:41"
 * },
 * {
 * "location": "Mahadevapura Indus. Area",
 * "details": "Shipment Out For Delivery",
 * "date": "08-Dec-2017",
 * "time": "13:00"
 * },
 * {
 * "location": "Mahadevapura Indus. Area",
 * "details": "Shipment Arrived",
 * "date": "08-Dec-2017",
 * "time": "11:54"
 * },
 * {
 * "location": "Bial Hub",
 * "details": "Shipment Further Connected",
 * "date": "08-Dec-2017",
 * "time": "09:30"
 * },
 * {
 * "location": "Bial Hub",
 * "details": "Shipment Arrived At Hub",
 * "date": "08-Dec-2017",
 * "time": "08:06"
 * },
 * {
 * "location": "Mumbai Etail Warehou",
 * "details": "Shipment Further Connected",
 * "date": "08-Dec-2017",
 * "time": "05:08"
 * },
 * {
 * "location": "Mumbai Etail Warehou",
 * "details": "Shipment Arrived At Hub",
 * "date": "07-Dec-2017",
 * "time": "18:51"
 * },
 * {
 * "location": "Mumbai Etail Centre",
 * "details": "Shipment Further Connected",
 * "date": "07-Dec-2017",
 * "time": "17:53"
 * },
 * {
 * "location": "Mumbai Etail Centre",
 * "details": "Shipment Arrived",
 * "date": "07-Dec-2017",
 * "time": "12:58"
 * }
 * ],
 * "newWaybill": "42057026524"
 * }
 * <p>
 * Created by CNI on 2018/1/9.
 * <p>
 * Author:胡飞飞
 */
public class BluedartPojo {


    /**
     * waybill : 59638108526
     * refNo : 199644521E12010250
     * statusScans : [{"location":"Mahadevapura Indus. Area","details":"Returned To Origin At Shipper'S Request","date":"14-Dec-2017","time":"17:45"},{"location":"Mahadevapura Indus. Area","details":"Undelivered Shipment Held At Location","date":"14-Dec-2017","time":"10:44"},{"location":"Mahadevapura Indus. Area","details":"Need Department Name/Extention Number","date":"13-Dec-2017","time":"17:03"},{"location":"Mahadevapura Indus. Area","details":"Shipment Out For Delivery","date":"13-Dec-2017","time":"09:31"},{"location":"Mahadevapura Indus. Area","details":"Need Department Name/Extention Number","date":"12-Dec-2017","time":"12:36"},{"location":"Mahadevapura Indus. Area","details":"Shipment Out For Delivery","date":"12-Dec-2017","time":"09:37"},{"location":"Mahadevapura Indus. Area","details":"Need Department Name/Extention Number","date":"11-Dec-2017","time":"15:10"},{"location":"Mahadevapura Indus. Area","details":"Shipment Out For Delivery","date":"11-Dec-2017","time":"09:40"},{"location":"Mahadevapura Indus. Area","details":"Holiday, Delivery On Next Business Day","date":"09-Dec-2017","time":"10:42"},{"location":"Mahadevapura Indus. Area","details":"Need Department Name/Extention Number","date":"08-Dec-2017","time":"15:41"},{"location":"Mahadevapura Indus. Area","details":"Shipment Out For Delivery","date":"08-Dec-2017","time":"13:00"},{"location":"Mahadevapura Indus. Area","details":"Shipment Arrived","date":"08-Dec-2017","time":"11:54"},{"location":"Bial Hub","details":"Shipment Further Connected","date":"08-Dec-2017","time":"09:30"},{"location":"Bial Hub","details":"Shipment Arrived At Hub","date":"08-Dec-2017","time":"08:06"},{"location":"Mumbai Etail Warehou","details":"Shipment Further Connected","date":"08-Dec-2017","time":"05:08"},{"location":"Mumbai Etail Warehou","details":"Shipment Arrived At Hub","date":"07-Dec-2017","time":"18:51"},{"location":"Mumbai Etail Centre","details":"Shipment Further Connected","date":"07-Dec-2017","time":"17:53"},{"location":"Mumbai Etail Centre","details":"Shipment Arrived","date":"07-Dec-2017","time":"12:58"}]
     * newWaybill : 42057026524
     */

    private String waybill;
    private String refNo;
    private String newWaybill;
    private List<StatusScansBean> statusScans;

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    public String getNewWaybill() {
        return newWaybill;
    }

    public void setNewWaybill(String newWaybill) {
        this.newWaybill = newWaybill;
    }

    public List<StatusScansBean> getStatusScans() {
        return statusScans;
    }

    public void setStatusScans(List<StatusScansBean> statusScans) {
        this.statusScans = statusScans;
    }

    public static class StatusScansBean {
        /**
         * location : Mahadevapura Indus. Area
         * details : Returned To Origin At Shipper'S Request
         * date : 14-Dec-2017
         * time : 17:45
         */

        private String location;
        private String details;
        private String date;
        private String time;

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getDetails() {
            return details;
        }

        public void setDetails(String details) {
            this.details = details;
        }

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
    }
}
