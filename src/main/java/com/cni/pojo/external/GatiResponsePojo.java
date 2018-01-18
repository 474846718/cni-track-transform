package com.cni.pojo.external;

import java.util.List;

/**
 * Created by CNI on 2018/1/17.
 */
public class GatiResponsePojo {


    /**
     * dktinfo : {"SERVICE_NAME":"AI GATI ZIPP","POD":"-","TRANSIT_DTLS":{"ROW":[{"INTRANSIT_DATE":"17-OCT-2017","INTRANSIT_STATUS":"Delivered","INTRANSIT_TIME":"17:37","INTRANSIT_LOCATION":""},{"INTRANSIT_DATE":"17-OCT-2017","INTRANSIT_STATUS":"Arrived","INTRANSIT_TIME":"11:37","INTRANSIT_LOCATION":"Baroda"},{"INTRANSIT_DATE":"17-OCT-2017","INTRANSIT_STATUS":"Out for next station","INTRANSIT_TIME":"11:07","INTRANSIT_LOCATION":"Baroda"},{"INTRANSIT_DATE":"17-OCT-2017","INTRANSIT_STATUS":"Arrived","INTRANSIT_TIME":"08:39","INTRANSIT_LOCATION":"Baroda"},{"INTRANSIT_DATE":"17-OCT-2017","INTRANSIT_STATUS":"Out for next station","INTRANSIT_TIME":"05:18","INTRANSIT_LOCATION":"Ahmedabad Stc"},{"INTRANSIT_DATE":"16-OCT-2017","INTRANSIT_STATUS":"Arrived","INTRANSIT_TIME":"22:02","INTRANSIT_LOCATION":"Ahmedabad Stc"},{"INTRANSIT_DATE":"16-OCT-2017","INTRANSIT_STATUS":"Out for next station","INTRANSIT_TIME":"20:36","INTRANSIT_LOCATION":"Ahmedabad"},{"INTRANSIT_DATE":"16-OCT-2017","INTRANSIT_STATUS":"Arrived","INTRANSIT_TIME":"12:16","INTRANSIT_LOCATION":"Ahmedabad"},{"INTRANSIT_DATE":"16-OCT-2017","INTRANSIT_STATUS":"Out for next station","INTRANSIT_TIME":"06:48","INTRANSIT_LOCATION":"Delhi"},{"INTRANSIT_DATE":"16-OCT-2017","INTRANSIT_STATUS":"Out for next station","INTRANSIT_TIME":"06:47","INTRANSIT_LOCATION":"Delhi"},{"INTRANSIT_DATE":"16-OCT-2017","INTRANSIT_STATUS":"Arrived","INTRANSIT_TIME":"05:37","INTRANSIT_LOCATION":"Delhi"},{"INTRANSIT_DATE":"16-OCT-2017","INTRANSIT_STATUS":"Out for next station","INTRANSIT_TIME":"05:36","INTRANSIT_LOCATION":"Delhi Gateway"},{"INTRANSIT_DATE":"14-OCT-2017","INTRANSIT_STATUS":"Arrived","INTRANSIT_TIME":"17:11","INTRANSIT_LOCATION":"Delhi Gateway"},{"INTRANSIT_DATE":"09-OCT-2017","INTRANSIT_STATUS":"Out for next station","INTRANSIT_TIME":"08:04","INTRANSIT_LOCATION":"Shangai"}]},"DELIVERY_STATION":"Baroda","DOCKET_NUMBER":"661125807","CONSIGNOR_NAME":"GATI CHINA PROCESSING CENTER","BOOKED_DATETIME":"08-OCT-2017 15:49","DOCKET_STATUS":"Delivered","ASSURED_DELIVERY_DATE":"16-OCT-2017","result":"successful","DELIVERY_DATETIME":"17-OCT-2017 17:37","REF_NUMBER":"","ACTUAL_WEIGHT":"0.5","BOOKING_STATION":"Shangai","RECEIVER_NAME":"JORAL","dktno":"661125807","CONSIGNEE_NAME":"JORAL","NO_OF_PKGS":"1"}
     * requid : 661125807
     */

    private DktinfoBean dktinfo;
    private String requid;

    public DktinfoBean getDktinfo() {
        return dktinfo;
    }

    public void setDktinfo(DktinfoBean dktinfo) {
        this.dktinfo = dktinfo;
    }

    public String getRequid() {
        return requid;
    }

    public void setRequid(String requid) {
        this.requid = requid;
    }

    public static class DktinfoBean {
        /**
         * SERVICE_NAME : AI GATI ZIPP
         * POD : -
         * TRANSIT_DTLS : {"ROW":[{"INTRANSIT_DATE":"17-OCT-2017","INTRANSIT_STATUS":"Delivered","INTRANSIT_TIME":"17:37","INTRANSIT_LOCATION":""},{"INTRANSIT_DATE":"17-OCT-2017","INTRANSIT_STATUS":"Arrived","INTRANSIT_TIME":"11:37","INTRANSIT_LOCATION":"Baroda"},{"INTRANSIT_DATE":"17-OCT-2017","INTRANSIT_STATUS":"Out for next station","INTRANSIT_TIME":"11:07","INTRANSIT_LOCATION":"Baroda"},{"INTRANSIT_DATE":"17-OCT-2017","INTRANSIT_STATUS":"Arrived","INTRANSIT_TIME":"08:39","INTRANSIT_LOCATION":"Baroda"},{"INTRANSIT_DATE":"17-OCT-2017","INTRANSIT_STATUS":"Out for next station","INTRANSIT_TIME":"05:18","INTRANSIT_LOCATION":"Ahmedabad Stc"},{"INTRANSIT_DATE":"16-OCT-2017","INTRANSIT_STATUS":"Arrived","INTRANSIT_TIME":"22:02","INTRANSIT_LOCATION":"Ahmedabad Stc"},{"INTRANSIT_DATE":"16-OCT-2017","INTRANSIT_STATUS":"Out for next station","INTRANSIT_TIME":"20:36","INTRANSIT_LOCATION":"Ahmedabad"},{"INTRANSIT_DATE":"16-OCT-2017","INTRANSIT_STATUS":"Arrived","INTRANSIT_TIME":"12:16","INTRANSIT_LOCATION":"Ahmedabad"},{"INTRANSIT_DATE":"16-OCT-2017","INTRANSIT_STATUS":"Out for next station","INTRANSIT_TIME":"06:48","INTRANSIT_LOCATION":"Delhi"},{"INTRANSIT_DATE":"16-OCT-2017","INTRANSIT_STATUS":"Out for next station","INTRANSIT_TIME":"06:47","INTRANSIT_LOCATION":"Delhi"},{"INTRANSIT_DATE":"16-OCT-2017","INTRANSIT_STATUS":"Arrived","INTRANSIT_TIME":"05:37","INTRANSIT_LOCATION":"Delhi"},{"INTRANSIT_DATE":"16-OCT-2017","INTRANSIT_STATUS":"Out for next station","INTRANSIT_TIME":"05:36","INTRANSIT_LOCATION":"Delhi Gateway"},{"INTRANSIT_DATE":"14-OCT-2017","INTRANSIT_STATUS":"Arrived","INTRANSIT_TIME":"17:11","INTRANSIT_LOCATION":"Delhi Gateway"},{"INTRANSIT_DATE":"09-OCT-2017","INTRANSIT_STATUS":"Out for next station","INTRANSIT_TIME":"08:04","INTRANSIT_LOCATION":"Shangai"}]}
         * DELIVERY_STATION : Baroda
         * DOCKET_NUMBER : 661125807
         * CONSIGNOR_NAME : GATI CHINA PROCESSING CENTER
         * BOOKED_DATETIME : 08-OCT-2017 15:49
         * DOCKET_STATUS : Delivered
         * ASSURED_DELIVERY_DATE : 16-OCT-2017
         * result : successful
         * DELIVERY_DATETIME : 17-OCT-2017 17:37
         * REF_NUMBER :
         * ACTUAL_WEIGHT : 0.5
         * BOOKING_STATION : Shangai
         * RECEIVER_NAME : JORAL
         * dktno : 661125807
         * CONSIGNEE_NAME : JORAL
         * NO_OF_PKGS : 1
         */

        private String SERVICE_NAME;
        private String POD;
        private TRANSITDTLSBean TRANSIT_DTLS;
        private String DELIVERY_STATION;
        private String DOCKET_NUMBER;
        private String CONSIGNOR_NAME;
        private String BOOKED_DATETIME;
        private String DOCKET_STATUS;
        private String ASSURED_DELIVERY_DATE;
        private String result;
        private String DELIVERY_DATETIME;
        private String REF_NUMBER;
        private String ACTUAL_WEIGHT;
        private String BOOKING_STATION;
        private String RECEIVER_NAME;
        private String dktno;
        private String CONSIGNEE_NAME;
        private String NO_OF_PKGS;

        public String getSERVICE_NAME() {
            return SERVICE_NAME;
        }

        public void setSERVICE_NAME(String SERVICE_NAME) {
            this.SERVICE_NAME = SERVICE_NAME;
        }

        public String getPOD() {
            return POD;
        }

        public void setPOD(String POD) {
            this.POD = POD;
        }

        public TRANSITDTLSBean getTRANSIT_DTLS() {
            return TRANSIT_DTLS;
        }

        public void setTRANSIT_DTLS(TRANSITDTLSBean TRANSIT_DTLS) {
            this.TRANSIT_DTLS = TRANSIT_DTLS;
        }

        public String getDELIVERY_STATION() {
            return DELIVERY_STATION;
        }

        public void setDELIVERY_STATION(String DELIVERY_STATION) {
            this.DELIVERY_STATION = DELIVERY_STATION;
        }

        public String getDOCKET_NUMBER() {
            return DOCKET_NUMBER;
        }

        public void setDOCKET_NUMBER(String DOCKET_NUMBER) {
            this.DOCKET_NUMBER = DOCKET_NUMBER;
        }

        public String getCONSIGNOR_NAME() {
            return CONSIGNOR_NAME;
        }

        public void setCONSIGNOR_NAME(String CONSIGNOR_NAME) {
            this.CONSIGNOR_NAME = CONSIGNOR_NAME;
        }

        public String getBOOKED_DATETIME() {
            return BOOKED_DATETIME;
        }

        public void setBOOKED_DATETIME(String BOOKED_DATETIME) {
            this.BOOKED_DATETIME = BOOKED_DATETIME;
        }

        public String getDOCKET_STATUS() {
            return DOCKET_STATUS;
        }

        public void setDOCKET_STATUS(String DOCKET_STATUS) {
            this.DOCKET_STATUS = DOCKET_STATUS;
        }

        public String getASSURED_DELIVERY_DATE() {
            return ASSURED_DELIVERY_DATE;
        }

        public void setASSURED_DELIVERY_DATE(String ASSURED_DELIVERY_DATE) {
            this.ASSURED_DELIVERY_DATE = ASSURED_DELIVERY_DATE;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public String getDELIVERY_DATETIME() {
            return DELIVERY_DATETIME;
        }

        public void setDELIVERY_DATETIME(String DELIVERY_DATETIME) {
            this.DELIVERY_DATETIME = DELIVERY_DATETIME;
        }

        public String getREF_NUMBER() {
            return REF_NUMBER;
        }

        public void setREF_NUMBER(String REF_NUMBER) {
            this.REF_NUMBER = REF_NUMBER;
        }

        public String getACTUAL_WEIGHT() {
            return ACTUAL_WEIGHT;
        }

        public void setACTUAL_WEIGHT(String ACTUAL_WEIGHT) {
            this.ACTUAL_WEIGHT = ACTUAL_WEIGHT;
        }

        public String getBOOKING_STATION() {
            return BOOKING_STATION;
        }

        public void setBOOKING_STATION(String BOOKING_STATION) {
            this.BOOKING_STATION = BOOKING_STATION;
        }

        public String getRECEIVER_NAME() {
            return RECEIVER_NAME;
        }

        public void setRECEIVER_NAME(String RECEIVER_NAME) {
            this.RECEIVER_NAME = RECEIVER_NAME;
        }

        public String getDktno() {
            return dktno;
        }

        public void setDktno(String dktno) {
            this.dktno = dktno;
        }

        public String getCONSIGNEE_NAME() {
            return CONSIGNEE_NAME;
        }

        public void setCONSIGNEE_NAME(String CONSIGNEE_NAME) {
            this.CONSIGNEE_NAME = CONSIGNEE_NAME;
        }

        public String getNO_OF_PKGS() {
            return NO_OF_PKGS;
        }

        public void setNO_OF_PKGS(String NO_OF_PKGS) {
            this.NO_OF_PKGS = NO_OF_PKGS;
        }

        public static class TRANSITDTLSBean {
            private List<ROWBean> ROW;

            public List<ROWBean> getROW() {
                return ROW;
            }

            public void setROW(List<ROWBean> ROW) {
                this.ROW = ROW;
            }

            public static class ROWBean {
                /**
                 * INTRANSIT_DATE : 17-OCT-2017
                 * INTRANSIT_STATUS : Delivered
                 * INTRANSIT_TIME : 17:37
                 * INTRANSIT_LOCATION :
                 */

                private String INTRANSIT_DATE;
                private String INTRANSIT_STATUS;
                private String INTRANSIT_TIME;
                private String INTRANSIT_LOCATION;

                public String getINTRANSIT_DATE() {
                    return INTRANSIT_DATE;
                }

                public void setINTRANSIT_DATE(String INTRANSIT_DATE) {
                    this.INTRANSIT_DATE = INTRANSIT_DATE;
                }

                public String getINTRANSIT_STATUS() {
                    return INTRANSIT_STATUS;
                }

                public void setINTRANSIT_STATUS(String INTRANSIT_STATUS) {
                    this.INTRANSIT_STATUS = INTRANSIT_STATUS;
                }

                public String getINTRANSIT_TIME() {
                    return INTRANSIT_TIME;
                }

                public void setINTRANSIT_TIME(String INTRANSIT_TIME) {
                    this.INTRANSIT_TIME = INTRANSIT_TIME;
                }

                public String getINTRANSIT_LOCATION() {
                    return INTRANSIT_LOCATION;
                }

                public void setINTRANSIT_LOCATION(String INTRANSIT_LOCATION) {
                    this.INTRANSIT_LOCATION = INTRANSIT_LOCATION;
                }
            }
        }
    }
}
