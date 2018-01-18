package com.cni.pojo.company;

import java.util.Date;
import java.util.List;

/**
 * EcomExpress公司提供接口返回的XML内容
 * <p>
 * Created by CNI on 2018/1/16.
 */
public class EcomExpressXmlPojo {

    List<EcomExpressBean> list;

    public List<EcomExpressBean> getList() {
        return list;
    }

    public void setList(List<EcomExpressBean> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "EcomExpressXmlPojo{" +
                "list=" + list +
                '}';
    }

    /**
     * <field type="BigIntegerField" name="awb_number">221550310</field>
     * <field type="CharField" name="orderid">202724731E12071316</field>
     * <field type="FloatField" name="actual_weight">0.696</field>
     * <field type="CharField" name="origin">MUMBAI - BOP</field>
     * <field type="CharField" name="destination">IMPHAL - IPB</field>
     * <field type="CharField" name="current_location_name">IMPHAL - IPB</field>
     * <field type="CharField" name="current_location_code">IPB</field>
     * <field type="CharField" name="customer">SINO INDIA ETAIL PRIVATE LIMITED - 151328</field>
     * <field type="CharField" name="consignee">Ms. bonna kangabam</field>
     * <field type="CharField" name="pickupdate">07-Dec-2017</field>
     * <field type="CharField" name="status">Delivered / Closed</field>
     * <field type="CharField" name="tracking_status">Delivered</field>
     * <field type="CharField" name="reason_code">999 - Delivered</field>
     * <field type="CharField" name="reason_code_description">Delivered</field>
     * <field type="CharField" name="reason_code_number">999</field>
     * <field type="CharField" name="receiver">sign</field>
     * <field type="CharField" name="lat">0.0000000</field>
     * <field type="CharField" name="long">0.0000000</field>
     * <field type="CharField" name="expected_date" >12-Dec-2017</field>
     * <field type="CharField" name="last_update_date" >11-Dec-2017</field>
     * <field type="CharField" name="last_update_datetime" >11-Dec-2017 17:27</field>
     * <field type="CharField" name="delivery_date" >2017-12-11 17:00:00</field>
     * <field type="CharField" name="ref_awb" >None</field>
     * <field type="CharField" name="rts_shipment" >0</field>
     * <field type="CharField" name="system_delivery_update" >2017-12-11 17:27:37</field>
     * <field type="CharField" name="rts_system_delivery_status" ></field>
     * <field type="CharField" name="rts_reason_code_number"></field>
     * <field type="CharField" name="rts_last_update"></field>
     * <field type="CharField" name="pincode" >795001</field>
     * <field type="CharField" name="city" >IMPHAL</field>
     * <field type="CharField" name="state" >Manipurm</field>
     * <field type="CharField" name="delivery_pod_image" ></field>
     * <field type="CharField" name="delivery_pod_signature" ></field>
     * <field type="CharField" name="rev_pickup_signature" ></field>
     * <field type="CharField" name="rev_pickup_packed_image" ></field>
     * <field type="CharField" name="rev_pickup_open_image" ></field>
     * <field name="scans">
     */
    public static class EcomExpressBean {

        private long awb_number;

        private String orderid;

        private float actual_weight;

        private String origin;

        private String destination;

        private String current_location_name;

        private String current_location_code;

        private String customer;

        private String consignee;

        private String pickupdate;

        private String status;

        private String tracking_status;

        private String reason_code;

        private String reason_code_description;

        private String reason_code_number;

        private String receiver;

        private String lat;

        private String _long;

        private String expected_date;

        private String last_update_date;

        private String last_update_datetime;

        private String delivery_date;

        private String ref_awb;

        private String rts_shipment;

        private String system_delivery_update;

        private String rts_system_delivery_status;

        private String rts_reason_code_number;

        private String rts_last_update;

        private String pincode;

        private String city;

        private String state;

        private String delivery_pod_image;

        private String delivery_pod_signature;

        private String rev_pickup_signature;

        private String rev_pickup_packed_image;

        private String rev_pickup_open_image;

        private List<ScanBean> scans;

        public long getAwb_number() {
            return awb_number;
        }

        public void setAwb_number(long awb_number) {
            this.awb_number = awb_number;
        }

        public String getOrderid() {
            return orderid;
        }

        public void setOrderid(String orderid) {
            this.orderid = orderid;
        }

        public float getActual_weight() {
            return actual_weight;
        }

        public void setActual_weight(float actual_weight) {
            this.actual_weight = actual_weight;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public String getCurrent_location_name() {
            return current_location_name;
        }

        public void setCurrent_location_name(String current_location_name) {
            this.current_location_name = current_location_name;
        }

        public String getCurrent_location_code() {
            return current_location_code;
        }

        public void setCurrent_location_code(String current_location_code) {
            this.current_location_code = current_location_code;
        }

        public String getCustomer() {
            return customer;
        }

        public void setCustomer(String customer) {
            this.customer = customer;
        }

        public String getConsignee() {
            return consignee;
        }

        public void setConsignee(String consignee) {
            this.consignee = consignee;
        }

        public String getPickupdate() {
            return pickupdate;
        }

        public void setPickupdate(String pickupdate) {
            this.pickupdate = pickupdate;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getTracking_status() {
            return tracking_status;
        }

        public void setTracking_status(String tracking_status) {
            this.tracking_status = tracking_status;
        }

        public String getReason_code() {
            return reason_code;
        }

        public void setReason_code(String reason_code) {
            this.reason_code = reason_code;
        }

        public String getReason_code_description() {
            return reason_code_description;
        }

        public void setReason_code_description(String reason_code_description) {
            this.reason_code_description = reason_code_description;
        }

        public String getReason_code_number() {
            return reason_code_number;
        }

        public void setReason_code_number(String reason_code_number) {
            this.reason_code_number = reason_code_number;
        }

        public String getReceiver() {
            return receiver;
        }

        public void setReceiver(String receiver) {
            this.receiver = receiver;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLong() {
            return _long;
        }

        public void setLong(String _long) {
            this._long = _long;
        }

        public String getExpected_date() {
            return expected_date;
        }

        public void setExpected_date(String expected_date) {
            this.expected_date = expected_date;
        }

        public String getLast_update_date() {
            return last_update_date;
        }

        public void setLast_update_date(String last_update_date) {
            this.last_update_date = last_update_date;
        }

        public String getLast_update_datetime() {
            return last_update_datetime;
        }

        public void setLast_update_datetime(String last_update_datetime) {
            this.last_update_datetime = last_update_datetime;
        }

        public String getDelivery_date() {
            return delivery_date;
        }

        public void setDelivery_date(String delivery_date) {
            this.delivery_date = delivery_date;
        }

        public String getRef_awb() {
            return ref_awb;
        }

        public void setRef_awb(String ref_awb) {
            this.ref_awb = ref_awb;
        }

        public String getRts_shipment() {
            return rts_shipment;
        }

        public void setRts_shipment(String rts_shipment) {
            this.rts_shipment = rts_shipment;
        }

        public String getSystem_delivery_update() {
            return system_delivery_update;
        }

        public void setSystem_delivery_update(String system_delivery_update) {
            this.system_delivery_update = system_delivery_update;
        }

        public String getRts_system_delivery_status() {
            return rts_system_delivery_status;
        }

        public void setRts_system_delivery_status(String rts_system_delivery_status) {
            this.rts_system_delivery_status = rts_system_delivery_status;
        }

        public String getRts_reason_code_number() {
            return rts_reason_code_number;
        }

        public void setRts_reason_code_number(String rts_reason_code_number) {
            this.rts_reason_code_number = rts_reason_code_number;
        }

        public String getRts_last_update() {
            return rts_last_update;
        }

        public void setRts_last_update(String rts_last_update) {
            this.rts_last_update = rts_last_update;
        }

        public String getPincode() {
            return pincode;
        }

        public void setPincode(String pincode) {
            this.pincode = pincode;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getDelivery_pod_image() {
            return delivery_pod_image;
        }

        public void setDelivery_pod_image(String delivery_pod_image) {
            this.delivery_pod_image = delivery_pod_image;
        }

        public String getDelivery_pod_signature() {
            return delivery_pod_signature;
        }

        public void setDelivery_pod_signature(String delivery_pod_signature) {
            this.delivery_pod_signature = delivery_pod_signature;
        }

        public String getRev_pickup_signature() {
            return rev_pickup_signature;
        }

        public void setRev_pickup_signature(String rev_pickup_signature) {
            this.rev_pickup_signature = rev_pickup_signature;
        }

        public String getRev_pickup_packed_image() {
            return rev_pickup_packed_image;
        }

        public void setRev_pickup_packed_image(String rev_pickup_packed_image) {
            this.rev_pickup_packed_image = rev_pickup_packed_image;
        }

        public String getRev_pickup_open_image() {
            return rev_pickup_open_image;
        }

        public void setRev_pickup_open_image(String rev_pickup_open_image) {
            this.rev_pickup_open_image = rev_pickup_open_image;
        }

        public List<ScanBean> getScans() {
            return scans;
        }

        public void setScans(List<ScanBean> scans) {
            this.scans = scans;
        }

        @Override
        public String toString() {
            return "EcomExpressBean{" +
                    "awb_number=" + awb_number +
                    ", orderid='" + orderid + '\'' +
                    ", actual_weight=" + actual_weight +
                    ", origin='" + origin + '\'' +
                    ", destination='" + destination + '\'' +
                    ", current_location_name='" + current_location_name + '\'' +
                    ", current_location_code='" + current_location_code + '\'' +
                    ", customer='" + customer + '\'' +
                    ", consignee='" + consignee + '\'' +
                    ", pickupdate='" + pickupdate + '\'' +
                    ", status='" + status + '\'' +
                    ", tracking_status='" + tracking_status + '\'' +
                    ", reason_code='" + reason_code + '\'' +
                    ", reason_code_description='" + reason_code_description + '\'' +
                    ", reason_code_number='" + reason_code_number + '\'' +
                    ", receiver='" + receiver + '\'' +
                    ", lat='" + lat + '\'' +
                    ", _long='" + _long + '\'' +
                    ", expected_date='" + expected_date + '\'' +
                    ", last_update_date='" + last_update_date + '\'' +
                    ", last_update_datetime='" + last_update_datetime + '\'' +
                    ", delivery_date='" + delivery_date + '\'' +
                    ", ref_awb='" + ref_awb + '\'' +
                    ", rts_shipment='" + rts_shipment + '\'' +
                    ", system_delivery_update='" + system_delivery_update + '\'' +
                    ", rts_system_delivery_status='" + rts_system_delivery_status + '\'' +
                    ", rts_reason_code_number='" + rts_reason_code_number + '\'' +
                    ", rts_last_update='" + rts_last_update + '\'' +
                    ", pincode='" + pincode + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", delivery_pod_image='" + delivery_pod_image + '\'' +
                    ", delivery_pod_signature='" + delivery_pod_signature + '\'' +
                    ", rev_pickup_signature='" + rev_pickup_signature + '\'' +
                    ", rev_pickup_packed_image='" + rev_pickup_packed_image + '\'' +
                    ", rev_pickup_open_image='" + rev_pickup_open_image + '\'' +
                    ", scans=" + scans +
                    '}';
        }

        public static class ScanBean {
            private Date updated_on;
            private String status;
            private String reason_code;
            private String reason_code_number;
            private String scan_status;
            private String location;
            private String location_city;
            private String location_type;
            private String city_name;
            private String Employee;

            public Date getUpdated_on() {
                return updated_on;
            }

            public void setUpdated_on(Date updated_on) {
                this.updated_on = updated_on;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getReason_code() {
                return reason_code;
            }

            public void setReason_code(String reason_code) {
                this.reason_code = reason_code;
            }

            public String getReason_code_number() {
                return reason_code_number;
            }

            public void setReason_code_number(String reason_code_number) {
                this.reason_code_number = reason_code_number;
            }

            public String getScan_status() {
                return scan_status;
            }

            public void setScan_status(String scan_status) {
                this.scan_status = scan_status;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public String getLocation_city() {
                return location_city;
            }

            public void setLocation_city(String location_city) {
                this.location_city = location_city;
            }

            public String getLocation_type() {
                return location_type;
            }

            public void setLocation_type(String location_type) {
                this.location_type = location_type;
            }

            public String getCity_name() {
                return city_name;
            }

            public void setCity_name(String city_name) {
                this.city_name = city_name;
            }

            public String getEmployee() {
                return Employee;
            }

            public void setEmployee(String employee) {
                Employee = employee;
            }

            @Override
            public String toString() {
                return "ScanBean{" +
                        "updated_on=" + updated_on +
                        ", status='" + status + '\'' +
                        ", reason_code='" + reason_code + '\'' +
                        ", reason_code_number='" + reason_code_number + '\'' +
                        ", scan_status='" + scan_status + '\'' +
                        ", location='" + location + '\'' +
                        ", location_city='" + location_city + '\'' +
                        ", location_type='" + location_type + '\'' +
                        ", city_name='" + city_name + '\'' +
                        ", Employee='" + Employee + '\'' +
                        '}';
            }
        }
    }

}
