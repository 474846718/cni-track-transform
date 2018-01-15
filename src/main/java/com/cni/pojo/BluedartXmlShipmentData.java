package com.cni.pojo;

import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Bluedart公司原生API对应POJO
 * <p>
 * Created by CNI on 2018/1/15.
 */
@Root(name = "ShipmentData")
public class BluedartXmlShipmentData {

    private List<ShipmentBean> Shipment;

    public List<ShipmentBean> getShipment() {
        return Shipment;
    }

    public void setShipment(List<ShipmentBean> Shipment) {
        this.Shipment = Shipment;
    }

    @Root(name = "Shipment")
    public static class ShipmentBean {
        private String Prodcode;
        private String Service;
        private String PickUpDate;
        private String PickUpTime;
        private String Origin;
        private String OriginAreaCode;
        private String Destination;
        private String DestinationAreaCode;
        private String ProductType;
        private String CustomerCode;
        private String CustomerName;
        private String SenderName;
        private String ToAttention;
        private String Consignee;
        private String ConsigneeAddress1;
        private String ConsigneeAddress2;
        private String ConsigneeAddress3;
        private String ConsigneePincode;
        private String ConsigneeTelNo;
        private String Weight;
        private String Status;
        private String StatusType;
        private String ExpectedDeliveryDate;
        private String StatusDate;
        private String StatusTime;
        private String NewWaybillNo;
        private List<ScanDetailBean> Scans;

        public String getProdcode() {
            return Prodcode;
        }

        public void setProdcode(String Prodcode) {
            this.Prodcode = Prodcode;
        }

        public String getService() {
            return Service;
        }

        public void setService(String Service) {
            this.Service = Service;
        }

        public String getPickUpDate() {
            return PickUpDate;
        }

        public void setPickUpDate(String PickUpDate) {
            this.PickUpDate = PickUpDate;
        }

        public String getPickUpTime() {
            return PickUpTime;
        }

        public void setPickUpTime(String PickUpTime) {
            this.PickUpTime = PickUpTime;
        }

        public String getOrigin() {
            return Origin;
        }

        public void setOrigin(String Origin) {
            this.Origin = Origin;
        }

        public String getOriginAreaCode() {
            return OriginAreaCode;
        }

        public void setOriginAreaCode(String OriginAreaCode) {
            this.OriginAreaCode = OriginAreaCode;
        }

        public String getDestination() {
            return Destination;
        }

        public void setDestination(String Destination) {
            this.Destination = Destination;
        }

        public String getDestinationAreaCode() {
            return DestinationAreaCode;
        }

        public void setDestinationAreaCode(String DestinationAreaCode) {
            this.DestinationAreaCode = DestinationAreaCode;
        }

        public String getProductType() {
            return ProductType;
        }

        public void setProductType(String ProductType) {
            this.ProductType = ProductType;
        }

        public String getCustomerCode() {
            return CustomerCode;
        }

        public void setCustomerCode(String CustomerCode) {
            this.CustomerCode = CustomerCode;
        }

        public String getCustomerName() {
            return CustomerName;
        }

        public void setCustomerName(String CustomerName) {
            this.CustomerName = CustomerName;
        }

        public String getSenderName() {
            return SenderName;
        }

        public void setSenderName(String SenderName) {
            this.SenderName = SenderName;
        }

        public String getToAttention() {
            return ToAttention;
        }

        public void setToAttention(String ToAttention) {
            this.ToAttention = ToAttention;
        }

        public String getConsignee() {
            return Consignee;
        }

        public void setConsignee(String Consignee) {
            this.Consignee = Consignee;
        }

        public String getConsigneeAddress1() {
            return ConsigneeAddress1;
        }

        public void setConsigneeAddress1(String ConsigneeAddress1) {
            this.ConsigneeAddress1 = ConsigneeAddress1;
        }

        public String getConsigneeAddress2() {
            return ConsigneeAddress2;
        }

        public void setConsigneeAddress2(String ConsigneeAddress2) {
            this.ConsigneeAddress2 = ConsigneeAddress2;
        }

        public String getConsigneeAddress3() {
            return ConsigneeAddress3;
        }

        public void setConsigneeAddress3(String ConsigneeAddress3) {
            this.ConsigneeAddress3 = ConsigneeAddress3;
        }

        public String getConsigneePincode() {
            return ConsigneePincode;
        }

        public void setConsigneePincode(String ConsigneePincode) {
            this.ConsigneePincode = ConsigneePincode;
        }

        public String getConsigneeTelNo() {
            return ConsigneeTelNo;
        }

        public void setConsigneeTelNo(String ConsigneeTelNo) {
            this.ConsigneeTelNo = ConsigneeTelNo;
        }

        public String getWeight() {
            return Weight;
        }

        public void setWeight(String Weight) {
            this.Weight = Weight;
        }

        public String getStatus() {
            return Status;
        }

        public void setStatus(String Status) {
            this.Status = Status;
        }

        public String getStatusType() {
            return StatusType;
        }

        public void setStatusType(String StatusType) {
            this.StatusType = StatusType;
        }

        public String getExpectedDeliveryDate() {
            return ExpectedDeliveryDate;
        }

        public void setExpectedDeliveryDate(String ExpectedDeliveryDate) {
            this.ExpectedDeliveryDate = ExpectedDeliveryDate;
        }

        public String getStatusDate() {
            return StatusDate;
        }

        public void setStatusDate(String StatusDate) {
            this.StatusDate = StatusDate;
        }

        public String getStatusTime() {
            return StatusTime;
        }

        public void setStatusTime(String StatusTime) {
            this.StatusTime = StatusTime;
        }

        public String getNewWaybillNo() {
            return NewWaybillNo;
        }

        public void setNewWaybillNo(String NewWaybillNo) {
            this.NewWaybillNo = NewWaybillNo;
        }

        public List<ScanDetailBean> getScans() {
            return Scans;
        }

        public void setScans(List<ScanDetailBean> Scans) {
            this.Scans = Scans;
        }

        @Root(name = "ScanDetail")
        public static class ScanDetailBean {
            private String Scan;
            private String ScanCode;
            private String ScanType;
            private String ScanGroupType;
            private String ScanDate;
            private String ScanTime;
            private String ScannedLocation;
            private String ScannedLocationCode;

            public String getScan() {
                return Scan;
            }

            public void setScan(String Scan) {
                this.Scan = Scan;
            }

            public String getScanCode() {
                return ScanCode;
            }

            public void setScanCode(String ScanCode) {
                this.ScanCode = ScanCode;
            }

            public String getScanType() {
                return ScanType;
            }

            public void setScanType(String ScanType) {
                this.ScanType = ScanType;
            }

            public String getScanGroupType() {
                return ScanGroupType;
            }

            public void setScanGroupType(String ScanGroupType) {
                this.ScanGroupType = ScanGroupType;
            }

            public String getScanDate() {
                return ScanDate;
            }

            public void setScanDate(String ScanDate) {
                this.ScanDate = ScanDate;
            }

            public String getScanTime() {
                return ScanTime;
            }

            public void setScanTime(String ScanTime) {
                this.ScanTime = ScanTime;
            }

            public String getScannedLocation() {
                return ScannedLocation;
            }

            public void setScannedLocation(String ScannedLocation) {
                this.ScannedLocation = ScannedLocation;
            }

            public String getScannedLocationCode() {
                return ScannedLocationCode;
            }

            public void setScannedLocationCode(String ScannedLocationCode) {
                this.ScannedLocationCode = ScannedLocationCode;
            }
        }
    }
}
