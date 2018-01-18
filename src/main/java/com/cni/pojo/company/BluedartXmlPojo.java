package com.cni.pojo.company;


import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Bluedart公司原生API对应POJO
 * 使用JAPX进行解析
 * <p>
 * Created by CNI on 2018/1/15.
 * <p>anonymous complex type的 Java 类。
 * <p>
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Shipment" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Prodcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Service" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PickUpDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PickUpTime" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OriginAreaCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DestinationAreaCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CustomerCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SenderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ToAttention" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Consignee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ConsigneeAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ConsigneeAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ConsigneeAddress3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ConsigneePincode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="ConsigneeTelNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="StatusType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ExpectedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="StatusDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="StatusTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NewWaybillNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="ReceivedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Instructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Scans">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ScanDetail" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Scan" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ScanCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                                       &lt;element name="ScanType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ScanGroupType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ScanDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ScanTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ScannedLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ScannedLocationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="WaybillNo" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                 &lt;attribute name="RefNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "shipment"
})
@XmlRootElement(name = "ShipmentData")
public class BluedartXmlPojo {

    @XmlElement(name = "Shipment")
    protected List<Shipment> shipment;

    /**
     * Gets the value of the shipment property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipment property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipment().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Shipment }
     */
    public List<Shipment> getShipment() {
        if (shipment == null) {
            shipment = new ArrayList<Shipment>();
        }
        return this.shipment;
    }

    @Override
    public String toString() {
        return "BluedartXmlPojo{" +
                "shipment=" + shipment +
                '}';
    }

    /**
     * <p>anonymous complex type的 Java 类。
     * <p>
     * <p>以下模式片段指定包含在此类中的预期内容。
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Prodcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Service" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PickUpDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PickUpTime" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OriginAreaCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DestinationAreaCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CustomerCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SenderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ToAttention" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Consignee" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ConsigneeAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ConsigneeAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ConsigneeAddress3" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ConsigneePincode" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="ConsigneeTelNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="StatusType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ExpectedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="StatusDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="StatusTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="NewWaybillNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="ReceivedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Instructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Scans">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ScanDetail" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Scan" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ScanCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                             &lt;element name="ScanType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ScanGroupType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ScanDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ScanTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ScannedLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ScannedLocationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="WaybillNo" type="{http://www.w3.org/2001/XMLSchema}long" />
     *       &lt;attribute name="RefNo" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "prodcode",
            "service",
            "pickUpDate",
            "pickUpTime",
            "origin",
            "originAreaCode",
            "destination",
            "destinationAreaCode",
            "productType",
            "customerCode",
            "customerName",
            "senderName",
            "toAttention",
            "consignee",
            "consigneeAddress1",
            "consigneeAddress2",
            "consigneeAddress3",
            "consigneePincode",
            "consigneeTelNo",
            "weight",
            "status",
            "statusType",
            "expectedDeliveryDate",
            "statusDate",
            "statusTime",
            "newWaybillNo",
            "receivedBy",
            "instructions",
            "scans"
    })
    public static class Shipment {

        @XmlElement(name = "Prodcode", required = true)
        protected String prodcode;
        @XmlElement(name = "Service", required = true)
        protected String service;
        @XmlElement(name = "PickUpDate", required = true)
        protected String pickUpDate;
        @XmlElement(name = "PickUpTime")
        protected short pickUpTime;
        @XmlElement(name = "Origin", required = true)
        protected String origin;
        @XmlElement(name = "OriginAreaCode", required = true)
        protected String originAreaCode;
        @XmlElement(name = "Destination", required = true)
        protected String destination;
        @XmlElement(name = "DestinationAreaCode", required = true)
        protected String destinationAreaCode;
        @XmlElement(name = "ProductType", required = true)
        protected String productType;
        @XmlElement(name = "CustomerCode")
        protected int customerCode;
        @XmlElement(name = "CustomerName", required = true)
        protected String customerName;
        @XmlElement(name = "SenderName", required = true)
        protected String senderName;
        @XmlElement(name = "ToAttention", required = true)
        protected String toAttention;
        @XmlElement(name = "Consignee", required = true)
        protected String consignee;
        @XmlElement(name = "ConsigneeAddress1", required = true)
        protected String consigneeAddress1;
        @XmlElement(name = "ConsigneeAddress2", required = true)
        protected String consigneeAddress2;
        @XmlElement(name = "ConsigneeAddress3", required = true)
        protected String consigneeAddress3;
        @XmlElement(name = "ConsigneePincode")
        protected int consigneePincode;
        @XmlElement(name = "ConsigneeTelNo")
        protected Long consigneeTelNo;
        @XmlElement(name = "Weight")
        protected float weight;
        @XmlElement(name = "Status", required = true)
        protected String status;
        @XmlElement(name = "StatusType", required = true)
        protected String statusType;
        @XmlElement(name = "ExpectedDeliveryDate", required = true)
        protected String expectedDeliveryDate;
        @XmlElement(name = "StatusDate", required = true)
        protected String statusDate;
        @XmlElement(name = "StatusTime", required = true)
        protected String statusTime;
        @XmlElement(name = "NewWaybillNo")
        protected Long newWaybillNo;
        @XmlElement(name = "ReceivedBy")
        protected String receivedBy;
        @XmlElement(name = "Instructions")
        protected String instructions;
        @XmlElement(name = "Scans", required = true)
        protected Shipment.Scans scans;
        @XmlAttribute(name = "WaybillNo")
        protected Long waybillNo;
        @XmlAttribute(name = "RefNo")
        protected String refNo;

        /**
         * 获取prodcode属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getProdcode() {
            return prodcode;
        }

        /**
         * 设置prodcode属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setProdcode(String value) {
            this.prodcode = value;
        }

        /**
         * 获取service属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getService() {
            return service;
        }

        /**
         * 设置service属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setService(String value) {
            this.service = value;
        }

        /**
         * 获取pickUpDate属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getPickUpDate() {
            return pickUpDate;
        }

        /**
         * 设置pickUpDate属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPickUpDate(String value) {
            this.pickUpDate = value;
        }

        /**
         * 获取pickUpTime属性的值。
         */
        public short getPickUpTime() {
            return pickUpTime;
        }

        /**
         * 设置pickUpTime属性的值。
         */
        public void setPickUpTime(short value) {
            this.pickUpTime = value;
        }

        /**
         * 获取origin属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getOrigin() {
            return origin;
        }

        /**
         * 设置origin属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setOrigin(String value) {
            this.origin = value;
        }

        /**
         * 获取originAreaCode属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getOriginAreaCode() {
            return originAreaCode;
        }

        /**
         * 设置originAreaCode属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setOriginAreaCode(String value) {
            this.originAreaCode = value;
        }

        /**
         * 获取destination属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getDestination() {
            return destination;
        }

        /**
         * 设置destination属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDestination(String value) {
            this.destination = value;
        }

        /**
         * 获取destinationAreaCode属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getDestinationAreaCode() {
            return destinationAreaCode;
        }

        /**
         * 设置destinationAreaCode属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDestinationAreaCode(String value) {
            this.destinationAreaCode = value;
        }

        /**
         * 获取productType属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getProductType() {
            return productType;
        }

        /**
         * 设置productType属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setProductType(String value) {
            this.productType = value;
        }

        /**
         * 获取customerCode属性的值。
         */
        public int getCustomerCode() {
            return customerCode;
        }

        /**
         * 设置customerCode属性的值。
         */
        public void setCustomerCode(int value) {
            this.customerCode = value;
        }

        /**
         * 获取customerName属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getCustomerName() {
            return customerName;
        }

        /**
         * 设置customerName属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCustomerName(String value) {
            this.customerName = value;
        }

        /**
         * 获取senderName属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getSenderName() {
            return senderName;
        }

        /**
         * 设置senderName属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSenderName(String value) {
            this.senderName = value;
        }

        /**
         * 获取toAttention属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getToAttention() {
            return toAttention;
        }

        /**
         * 设置toAttention属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setToAttention(String value) {
            this.toAttention = value;
        }

        /**
         * 获取consignee属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getConsignee() {
            return consignee;
        }

        /**
         * 设置consignee属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setConsignee(String value) {
            this.consignee = value;
        }

        /**
         * 获取consigneeAddress1属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getConsigneeAddress1() {
            return consigneeAddress1;
        }

        /**
         * 设置consigneeAddress1属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setConsigneeAddress1(String value) {
            this.consigneeAddress1 = value;
        }

        /**
         * 获取consigneeAddress2属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getConsigneeAddress2() {
            return consigneeAddress2;
        }

        /**
         * 设置consigneeAddress2属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setConsigneeAddress2(String value) {
            this.consigneeAddress2 = value;
        }

        /**
         * 获取consigneeAddress3属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getConsigneeAddress3() {
            return consigneeAddress3;
        }

        /**
         * 设置consigneeAddress3属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setConsigneeAddress3(String value) {
            this.consigneeAddress3 = value;
        }

        /**
         * 获取consigneePincode属性的值。
         */
        public int getConsigneePincode() {
            return consigneePincode;
        }

        /**
         * 设置consigneePincode属性的值。
         */
        public void setConsigneePincode(int value) {
            this.consigneePincode = value;
        }

        /**
         * 获取consigneeTelNo属性的值。
         *
         * @return possible object is
         * {@link Long }
         */
        public Long getConsigneeTelNo() {
            return consigneeTelNo;
        }

        /**
         * 设置consigneeTelNo属性的值。
         *
         * @param value allowed object is
         *              {@link Long }
         */
        public void setConsigneeTelNo(Long value) {
            this.consigneeTelNo = value;
        }

        /**
         * 获取weight属性的值。
         */
        public float getWeight() {
            return weight;
        }

        /**
         * 设置weight属性的值。
         */
        public void setWeight(float value) {
            this.weight = value;
        }

        /**
         * 获取status属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getStatus() {
            return status;
        }

        /**
         * 设置status属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * 获取statusType属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getStatusType() {
            return statusType;
        }

        /**
         * 设置statusType属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setStatusType(String value) {
            this.statusType = value;
        }

        /**
         * 获取expectedDeliveryDate属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getExpectedDeliveryDate() {
            return expectedDeliveryDate;
        }

        /**
         * 设置expectedDeliveryDate属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setExpectedDeliveryDate(String value) {
            this.expectedDeliveryDate = value;
        }

        /**
         * 获取statusDate属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getStatusDate() {
            return statusDate;
        }

        /**
         * 设置statusDate属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setStatusDate(String value) {
            this.statusDate = value;
        }

        /**
         * 获取statusTime属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getStatusTime() {
            return statusTime;
        }

        /**
         * 设置statusTime属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setStatusTime(String value) {
            this.statusTime = value;
        }

        /**
         * 获取newWaybillNo属性的值。
         *
         * @return possible object is
         * {@link Long }
         */
        public Long getNewWaybillNo() {
            return newWaybillNo;
        }

        /**
         * 设置newWaybillNo属性的值。
         *
         * @param value allowed object is
         *              {@link Long }
         */
        public void setNewWaybillNo(Long value) {
            this.newWaybillNo = value;
        }

        /**
         * 获取receivedBy属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getReceivedBy() {
            return receivedBy;
        }

        /**
         * 设置receivedBy属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setReceivedBy(String value) {
            this.receivedBy = value;
        }

        /**
         * 获取instructions属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getInstructions() {
            return instructions;
        }

        /**
         * 设置instructions属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setInstructions(String value) {
            this.instructions = value;
        }

        /**
         * 获取scans属性的值。
         *
         * @return possible object is
         * {@link Shipment.Scans }
         */
        public Shipment.Scans getScans() {
            return scans;
        }

        /**
         * 设置scans属性的值。
         *
         * @param value allowed object is
         *              {@link Shipment.Scans }
         */
        public void setScans(Shipment.Scans value) {
            this.scans = value;
        }

        /**
         * 获取waybillNo属性的值。
         *
         * @return possible object is
         * {@link Long }
         */
        public Long getWaybillNo() {
            return waybillNo;
        }

        /**
         * 设置waybillNo属性的值。
         *
         * @param value allowed object is
         *              {@link Long }
         */
        public void setWaybillNo(Long value) {
            this.waybillNo = value;
        }

        /**
         * 获取refNo属性的值。
         *
         * @return possible object is
         * {@link String }
         */
        public String getRefNo() {
            return refNo;
        }

        /**
         * 设置refNo属性的值。
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRefNo(String value) {
            this.refNo = value;
        }

        @Override
        public String toString() {
            return "Shipment{" +
                    "prodcode='" + prodcode + '\'' +
                    ", service='" + service + '\'' +
                    ", pickUpDate='" + pickUpDate + '\'' +
                    ", pickUpTime=" + pickUpTime +
                    ", origin='" + origin + '\'' +
                    ", originAreaCode='" + originAreaCode + '\'' +
                    ", destination='" + destination + '\'' +
                    ", destinationAreaCode='" + destinationAreaCode + '\'' +
                    ", productType='" + productType + '\'' +
                    ", customerCode=" + customerCode +
                    ", customerName='" + customerName + '\'' +
                    ", senderName='" + senderName + '\'' +
                    ", toAttention='" + toAttention + '\'' +
                    ", consignee='" + consignee + '\'' +
                    ", consigneeAddress1='" + consigneeAddress1 + '\'' +
                    ", consigneeAddress2='" + consigneeAddress2 + '\'' +
                    ", consigneeAddress3='" + consigneeAddress3 + '\'' +
                    ", consigneePincode=" + consigneePincode +
                    ", consigneeTelNo=" + consigneeTelNo +
                    ", weight=" + weight +
                    ", status='" + status + '\'' +
                    ", statusType='" + statusType + '\'' +
                    ", expectedDeliveryDate='" + expectedDeliveryDate + '\'' +
                    ", statusDate='" + statusDate + '\'' +
                    ", statusTime='" + statusTime + '\'' +
                    ", newWaybillNo=" + newWaybillNo +
                    ", receivedBy='" + receivedBy + '\'' +
                    ", instructions='" + instructions + '\'' +
                    ", scans=" + scans +
                    ", waybillNo=" + waybillNo +
                    ", refNo='" + refNo + '\'' +
                    '}';
        }

        /**
         * <p>anonymous complex type的 Java 类。
         * <p>
         * <p>以下模式片段指定包含在此类中的预期内容。
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ScanDetail" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Scan" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ScanCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *                   &lt;element name="ScanType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ScanGroupType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ScanDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ScanTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ScannedLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ScannedLocationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "scanDetail"
        })
        public static class Scans {

            @XmlElement(name = "ScanDetail")
            protected List<Shipment.Scans.ScanDetail> scanDetail;

            /**
             * Gets the value of the scanDetail property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the scanDetail property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getScanDetail().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Shipment.Scans.ScanDetail }
             */
            public List<Shipment.Scans.ScanDetail> getScanDetail() {
                if (scanDetail == null) {
                    scanDetail = new ArrayList<Shipment.Scans.ScanDetail>();
                }
                return this.scanDetail;
            }

            @Override
            public String toString() {
                return "Scans{" +
                        "scanDetail=" + scanDetail +
                        '}';
            }

            /**
             * <p>anonymous complex type的 Java 类。
             * <p>
             * <p>以下模式片段指定包含在此类中的预期内容。
             * <p>
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Scan" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ScanCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
             *         &lt;element name="ScanType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ScanGroupType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ScanDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ScanTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ScannedLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ScannedLocationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "scan",
                    "scanCode",
                    "scanType",
                    "scanGroupType",
                    "scanDate",
                    "scanTime",
                    "scannedLocation",
                    "scannedLocationCode"
            })
            public static class ScanDetail {

                @XmlElement(name = "Scan", required = true)
                protected String scan;
                @XmlElement(name = "ScanCode")
                protected short scanCode;
                @XmlElement(name = "ScanType", required = true)
                protected String scanType;
                @XmlElement(name = "ScanGroupType", required = true)
                protected String scanGroupType;
                @XmlElement(name = "ScanDate", required = true)
                protected String scanDate;
                @XmlElement(name = "ScanTime", required = true)
                protected String scanTime;
                @XmlElement(name = "ScannedLocation", required = true)
                protected String scannedLocation;
                @XmlElement(name = "ScannedLocationCode", required = true)
                protected String scannedLocationCode;

                /**
                 * 获取scan属性的值。
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getScan() {
                    return scan;
                }

                /**
                 * 设置scan属性的值。
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setScan(String value) {
                    this.scan = value;
                }

                /**
                 * 获取scanCode属性的值。
                 */
                public short getScanCode() {
                    return scanCode;
                }

                /**
                 * 设置scanCode属性的值。
                 */
                public void setScanCode(short value) {
                    this.scanCode = value;
                }

                /**
                 * 获取scanType属性的值。
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getScanType() {
                    return scanType;
                }

                /**
                 * 设置scanType属性的值。
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setScanType(String value) {
                    this.scanType = value;
                }

                /**
                 * 获取scanGroupType属性的值。
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getScanGroupType() {
                    return scanGroupType;
                }

                /**
                 * 设置scanGroupType属性的值。
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setScanGroupType(String value) {
                    this.scanGroupType = value;
                }

                /**
                 * 获取scanDate属性的值。
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getScanDate() {
                    return scanDate;
                }

                /**
                 * 设置scanDate属性的值。
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setScanDate(String value) {
                    this.scanDate = value;
                }

                /**
                 * 获取scanTime属性的值。
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getScanTime() {
                    return scanTime;
                }

                /**
                 * 设置scanTime属性的值。
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setScanTime(String value) {
                    this.scanTime = value;
                }

                /**
                 * 获取scannedLocation属性的值。
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getScannedLocation() {
                    return scannedLocation;
                }

                /**
                 * 设置scannedLocation属性的值。
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setScannedLocation(String value) {
                    this.scannedLocation = value;
                }

                /**
                 * 获取scannedLocationCode属性的值。
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getScannedLocationCode() {
                    return scannedLocationCode;
                }

                /**
                 * 设置scannedLocationCode属性的值。
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setScannedLocationCode(String value) {
                    this.scannedLocationCode = value;
                }

                @Override
                public String toString() {
                    return "ScanDetail{" +
                            "scan='" + scan + '\'' +
                            ", scanCode=" + scanCode +
                            ", scanType='" + scanType + '\'' +
                            ", scanGroupType='" + scanGroupType + '\'' +
                            ", scanDate='" + scanDate + '\'' +
                            ", scanTime='" + scanTime + '\'' +
                            ", scannedLocation='" + scannedLocation + '\'' +
                            ", scannedLocationCode='" + scannedLocationCode + '\'' +
                            '}';
                }
            }

        }

    }

}
