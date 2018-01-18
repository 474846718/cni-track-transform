package com.cni.pojo.company;

import java.util.List;

/**
 * Delhivery公司JSON接口
 * <p>
 * Created by CNI on 2018/1/16.
 */
public class DelhiveryJsonPojo {


    /**
     * meta : {"requestId":"fd999191-fa5a-11e7-a53e-bdfb5d0ba874"}
     * data : [{"status":{"status":"DELIVERED","statusDateTime":"2017-10-11T17:16:22.002","statusType":"DL","instructions":"Delivered to consignee"},"estimatedDate":"2017-10-11T23:59:59","flow":"FORWARD","flowDirection":"ONWARD","dispatchCount":1,"referenceNo":"173651371E10061927","packageType":"PREPAID","awb":"1521510113890","destination":"Aurangabad","scans":[{"scanDateTime":"2017-10-06T16:57:15.942000","scannedLocation":"HQ (Haryana)","instructions":"Consignment Manifested","status":"WAITING_PICKUP"},{"scanDateTime":"2017-10-09T13:47:58","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Shipment Picked Up from Client Location","status":"PICKUP"},{"scanDateTime":"2017-10-09T15:50:31.607000","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Shipment Recieved at Origin Center","status":"IN_TRANSIT"},{"scanDateTime":"2017-10-09T18:12:57.694000","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Consignment dispatched from origin city","status":"IN_TRANSIT"},{"scanDateTime":"2017-10-09T21:19:50.916000","scannedLocation":"Bhiwandi_Mankoli_HB (Maharashtra)","instructions":"Consignment received","status":"IN_TRANSIT"},{"scanDateTime":"2017-10-10T03:26:36.956000","scannedLocation":"Pune_Tathawde_H (Maharashtra)","instructions":"Consignment received","status":"IN_TRANSIT"},{"scanDateTime":"2017-10-10T20:45:04.064000","scannedLocation":"Aurangabad_Shendra_H (Maharashtra)","instructions":"Consignment received at destination city","status":"IN_TRANSIT"},{"scanDateTime":"2017-10-11T08:39:27.479000","scannedLocation":"Aurangabad (Maharashtra)","instructions":"Received at destination city","status":"REACHED_DEST_CITY"},{"scanDateTime":"2017-10-11T10:57:44.041000","scannedLocation":"Aurangabad (Maharashtra)","instructions":"Out for delivery","status":"OUT_DELIVERY"},{"scanDateTime":"2017-10-11T17:16:22.002000","scannedLocation":"Aurangabad (Maharashtra)","instructions":"Delivered to consignee","status":"DELIVERED"}]},{"status":{"status":"DELIVERED_SELLER","statusDateTime":"2017-11-22T21:23:57.625","statusType":"DL","instructions":"RETURN Accepted"},"estimatedDate":"2017-11-14T23:59:59","flow":"FORWARD","flowDirection":"RETURN","dispatchCount":1,"referenceNo":"186303591E11101045","packageType":"COD","awb":"1521510525873","destination":"South Delhi","scans":[{"scanDateTime":"2017-11-10T08:15:20.403000","scannedLocation":"HQ (Haryana)","instructions":"Consignment Manifested","status":"WAITING_PICKUP"},{"scanDateTime":"2017-11-13T05:47:40","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Shipment Picked Up from Client Location","status":"PICKUP"},{"scanDateTime":"2017-11-13T06:01:29.991000","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Shipment Recieved at Origin Center","status":"IN_TRANSIT"},{"scanDateTime":"2017-11-13T08:14:34.618000","scannedLocation":"Mumbai Hub (Maharashtra)","instructions":"Consignment received","status":"IN_TRANSIT"},{"scanDateTime":"2017-11-13T11:41:08.308000","scannedLocation":"Mumbai Hub (Maharashtra)","instructions":"Consignment dispatched from origin city","status":"IN_TRANSIT"},{"scanDateTime":"2017-11-13T21:56:38.224000","scannedLocation":"Delhi_Gateway_HB (Delhi)","instructions":"Consignment received at destination city","status":"IN_TRANSIT"},{"scanDateTime":"2017-11-13T22:29:29.305000","scannedLocation":"Delhi_Gateway_HB (Delhi)","instructions":"Bulk update","status":"IN_TRANSIT"},{"scanDateTime":"2017-11-14T08:29:23.305000","scannedLocation":"Delhi_OkhlaPh1_DC (Delhi)","instructions":"Received at destination city","status":"REACHED_DEST_CITY"},{"scanDateTime":"2017-11-14T09:44:45.563000","scannedLocation":"Delhi_OkhlaPh1_DC (Delhi)","instructions":"Out for delivery","status":"OUT_DELIVERY"},{"scanDateTime":"2017-11-14T21:29:51.981000","scannedLocation":"Delhi_OkhlaPh1_DC (Delhi)","instructions":"Customer Cancelled the order","status":"REACHED_DEST_CITY"},{"scanDateTime":"2017-11-15T23:24:16.288000","scannedLocation":"Delhi_OkhlaPh1_DC (Delhi)","instructions":"No client instructions to Reattempt","status":"RETURNED"},{"scanDateTime":"2017-11-16T15:31:05.223000","scannedLocation":"Delhi_Lajpat_IP (Delhi)","instructions":"Consignment received","status":"RETURNED"},{"scanDateTime":"2017-11-16T15:31:42.783000","scannedLocation":"Delhi_Lajpat_IP (Delhi)","instructions":"Consignment received","status":"RETURNED"},{"scanDateTime":"2017-11-17T04:09:47.609000","scannedLocation":"Delhi_Lajpat_IP (Delhi)","instructions":"Consignment dispatched from destination city","status":"RETURNED"},{"scanDateTime":"2017-11-17T08:39:04.698000","scannedLocation":"Gurgaon_Bilaspur_HB (Haryana)","instructions":"Consignment received","status":"RETURNED"},{"scanDateTime":"2017-11-19T13:00:11.923000","scannedLocation":"Bangalore_Nelmngla_H (Karnataka)","instructions":"Consignment received","status":"RETURNED"},{"scanDateTime":"2017-11-21T07:03:24.339000","scannedLocation":"Bhiwandi_Mankoli_HB (Maharashtra)","instructions":"Consignment received","status":"RETURNED"},{"scanDateTime":"2017-11-21T13:49:46.748000","scannedLocation":"Mumbai Hub (Maharashtra)","instructions":"Consignment received at return city","status":"RETURNED"},{"scanDateTime":"2017-11-21T14:32:30.899000","scannedLocation":"BOM_Sakinaka_RP (Maharashtra)","instructions":"Consignment received at return city","status":"RETURNED"},{"scanDateTime":"2017-11-22T11:30:17.345000","scannedLocation":"BOM_Sakinaka_RP (Maharashtra)","instructions":"Dispatched for RTO","status":"OUT_DELIVERY_SELLER"},{"scanDateTime":"2017-11-22T21:23:57.625000","scannedLocation":"BOM_Sakinaka_RP (Maharashtra)","instructions":"RETURN Accepted","status":"DELIVERED_SELLER"}]},{"status":{"status":"LOST","statusDateTime":"2017-12-07T10:15:25.514","statusType":"LT","instructions":"Lost"},"estimatedDate":"2017-12-04T23:59:59","flow":"FORWARD","flowDirection":"ONWARD","dispatchCount":2,"referenceNo":"198092201E11281420","packageType":"COD","awb":"1521511105996","destination":"South Delhi","scans":[{"scanDateTime":"2017-11-28T11:50:12.018000","scannedLocation":"HQ (Haryana)","instructions":"Consignment Manifested","status":"WAITING_PICKUP"},{"scanDateTime":"2017-12-02T04:49:53.845000","scannedLocation":"HQ (Haryana)","instructions":"Package not picked/recieved from client","status":"NOT_PICKED"},{"scanDateTime":"2017-12-02T05:38:24","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Shipment Picked Up from Client Location","status":"PICKUP"},{"scanDateTime":"2017-12-02T06:22:41.339000","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Shipment Recieved at Origin Center","status":"IN_TRANSIT"},{"scanDateTime":"2017-12-02T09:51:31.970000","scannedLocation":"Mumbai Hub (Maharashtra)","instructions":"Consignment received","status":"IN_TRANSIT"},{"scanDateTime":"2017-12-02T11:36:59.061000","scannedLocation":"Mumbai Hub (Maharashtra)","instructions":"Consignment dispatched from origin city","status":"IN_TRANSIT"},{"scanDateTime":"2017-12-03T02:02:33.898000","scannedLocation":"Delhi_Gateway_HB (Delhi)","instructions":"Consignment received at destination city","status":"IN_TRANSIT"},{"scanDateTime":"2017-12-03T08:42:06.273000","scannedLocation":"Delhi_shahpurJat (Delhi)","instructions":"Received at destination city","status":"REACHED_DEST_CITY"},{"scanDateTime":"2017-12-03T23:51:46.724000","scannedLocation":"Delhi_shahpurJat (Delhi)","instructions":"Bulk update","status":"REACHED_DEST_CITY"},{"scanDateTime":"2017-12-04T10:36:27.564000","scannedLocation":"Delhi_shahpurJat (Delhi)","instructions":"Out for delivery","status":"OUT_DELIVERY"},{"scanDateTime":"2017-12-04T20:21:32.505000","scannedLocation":"Delhi_shahpurJat (Delhi)","instructions":"Consignee unavailable ","status":"REACHED_DEST_CITY"},{"scanDateTime":"2017-12-05T09:29:03.364000","scannedLocation":"Delhi_shahpurJat (Delhi)","instructions":"Out for delivery","status":"OUT_DELIVERY"},{"scanDateTime":"2017-12-05T19:58:35.374000","scannedLocation":"Delhi_shahpurJat (Delhi)","instructions":"Consignee unavailable ","status":"REACHED_DEST_CITY"},{"scanDateTime":"2017-12-07T10:15:25.514000","scannedLocation":"Delhi_shahpurJat (Delhi)","instructions":"Lost","status":"LOST"}]},{"status":{"status":"DELIVERED_SELLER","statusDateTime":"2017-12-19T19:50:27.611","statusType":"DL","instructions":"RETURN Accepted"},"estimatedDate":"2017-12-12T23:59:59","flow":"FORWARD","flowDirection":"RETURN","dispatchCount":1,"referenceNo":"200496031E12021850","packageType":"COD","awb":"1521511315016","destination":"Moradabad","scans":[{"scanDateTime":"2017-12-02T16:20:01.946000","scannedLocation":"HQ (Haryana)","instructions":"Consignment Manifested","status":"WAITING_PICKUP"},{"scanDateTime":"2017-12-06T04:56:22.745000","scannedLocation":"HQ (Haryana)","instructions":"Package not picked/recieved from client","status":"NOT_PICKED"},{"scanDateTime":"2017-12-09T11:05:23","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Shipment Picked Up from Client Location","status":"PICKUP"},{"scanDateTime":"2017-12-09T11:19:18.299000","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Shipment Recieved at Origin Center","status":"IN_TRANSIT"},{"scanDateTime":"2017-12-09T13:17:41.567000","scannedLocation":"Mumbai Hub (Maharashtra)","instructions":"Consignment received","status":"IN_TRANSIT"},{"scanDateTime":"2017-12-09T14:05:43.654000","scannedLocation":"Mumbai Hub (Maharashtra)","instructions":"Consignment dispatched from origin city","status":"IN_TRANSIT"},{"scanDateTime":"2017-12-10T01:45:15.900000","scannedLocation":"Delhi_Gateway_HB (Delhi)","instructions":"Consignment received","status":"IN_TRANSIT"},{"scanDateTime":"2017-12-12T12:37:36.457000","scannedLocation":"Delhi_Gateway (Delhi)","instructions":"Barcode printed","status":"IN_TRANSIT"},{"scanDateTime":"2017-12-14T08:55:15.987000","scannedLocation":"Moradabad_DC (Uttar Pradesh)","instructions":"Consignment received at destination city","status":"IN_TRANSIT"},{"scanDateTime":"2017-12-14T09:08:00.917000","scannedLocation":"Moradabad_DC (Uttar Pradesh)","instructions":"Received at destination city","status":"REACHED_DEST_CITY"},{"scanDateTime":"2017-12-14T10:50:47.501000","scannedLocation":"Moradabad_DC (Uttar Pradesh)","instructions":"Out for delivery","status":"OUT_DELIVERY"},{"scanDateTime":"2017-12-14T13:42:06.002000","scannedLocation":"Moradabad_DC (Uttar Pradesh)","instructions":"Customer Cancelled the order","status":"REACHED_DEST_CITY"},{"scanDateTime":"2017-12-15T23:07:18","scannedLocation":"Moradabad_DC (Uttar Pradesh)","instructions":"No client instructions to Reattempt","status":"RETURNED"},{"scanDateTime":"2017-12-16T19:48:58.374000","scannedLocation":"Moradabad_DC (Uttar Pradesh)","instructions":"Consignment dispatched from destination city","status":"RETURNED"},{"scanDateTime":"2017-12-17T10:12:40.520000","scannedLocation":"Delhi_Gateway_HB (Delhi)","instructions":"Consignment received","status":"RETURNED"},{"scanDateTime":"2017-12-17T16:53:40.304000","scannedLocation":"Gurgaon_Bilaspur_HB (Haryana)","instructions":"Consignment received","status":"RETURNED"},{"scanDateTime":"2017-12-19T03:39:19.220000","scannedLocation":"Bhiwandi_Mankoli_HB (Maharashtra)","instructions":"Consignment received","status":"RETURNED"},{"scanDateTime":"2017-12-19T06:31:44.668000","scannedLocation":"Mumbai Hub (Maharashtra)","instructions":"Consignment received at return city","status":"RETURNED"},{"scanDateTime":"2017-12-19T08:28:14.962000","scannedLocation":"BOM_Sakinaka_RP (Maharashtra)","instructions":"Consignment received at return city","status":"RETURNED"},{"scanDateTime":"2017-12-19T10:32:01.005000","scannedLocation":"BOM_Sakinaka_RP (Maharashtra)","instructions":"Dispatched for RTO","status":"OUT_DELIVERY_SELLER"},{"scanDateTime":"2017-12-19T19:50:27.611000","scannedLocation":"BOM_Sakinaka_RP (Maharashtra)","instructions":"RETURN Accepted","status":"DELIVERED_SELLER"}]},{"status":{"status":"DELIVERED_SELLER","statusDateTime":"2017-12-19T20:28:08.197","statusType":"DL","instructions":"RETURN Accepted"},"estimatedDate":"2017-12-14T23:59:59","flow":"FORWARD","flowDirection":"RETURN","dispatchCount":3,"referenceNo":"201853121E12070935","packageType":"PREPAID","awb":"1521511465785","destination":"Patiala","scans":[{"scanDateTime":"2017-12-07T07:05:11.157000","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Consignment Manifested","status":"WAITING_PICKUP"},{"scanDateTime":"2017-12-08T03:40:55","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Out for Pickup","status":"WAITING_PICKUP"},{"scanDateTime":"2017-12-09T03:04:43","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Out for Pickup","status":"WAITING_PICKUP"},{"scanDateTime":"2017-12-10T00:57:57","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Out for Pickup","status":"WAITING_PICKUP"},{"scanDateTime":"2017-12-10T08:40:45","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Out for Pickup","status":"WAITING_PICKUP"},{"scanDateTime":"2017-12-11T04:52:55.430000","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Package not picked/recieved from client","status":"NOT_PICKED"},{"scanDateTime":"2017-12-11T14:31:59","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Shipment Picked Up from Client Location","status":"PICKUP"},{"scanDateTime":"2017-12-11T15:26:39.480000","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Shipment Recieved at Origin Center","status":"IN_TRANSIT"},{"scanDateTime":"2017-12-11T18:03:17.287000","scannedLocation":"Mumbai Hub (Maharashtra)","instructions":"Consignment received","status":"IN_TRANSIT"},{"scanDateTime":"2017-12-12T03:23:46.847000","scannedLocation":"Mumbai Hub (Maharashtra)","instructions":"Consignment dispatched from origin city","status":"IN_TRANSIT"},{"scanDateTime":"2017-12-12T13:46:51.553000","scannedLocation":"Chandigarh_Hub (Chandigarh)","instructions":"Consignment received","status":"IN_TRANSIT"},{"scanDateTime":"2017-12-13T05:29:10.610000","scannedLocation":"Patiala_DPC (Punjab)","instructions":"Consignment received at destination city","status":"IN_TRANSIT"},{"scanDateTime":"2017-12-13T08:46:42.125000","scannedLocation":"Patiala (Punjab)","instructions":"Received at destination city","status":"REACHED_DEST_CITY"},{"scanDateTime":"2017-12-13T11:00:39.339000","scannedLocation":"Patiala (Punjab)","instructions":"Out for delivery","status":"OUT_DELIVERY"},{"scanDateTime":"2017-12-13T15:08:52.002000","scannedLocation":"Patiala (Punjab)","instructions":"Entry restricted area","status":"REACHED_DEST_CITY"},{"scanDateTime":"2017-12-14T11:01:00.940000","scannedLocation":"Patiala (Punjab)","instructions":"Out for delivery","status":"OUT_DELIVERY"},{"scanDateTime":"2017-12-14T15:56:24.002000","scannedLocation":"Patiala (Punjab)","instructions":"Entry restricted area","status":"REACHED_DEST_CITY"},{"scanDateTime":"2017-12-15T11:57:54.195000","scannedLocation":"Patiala (Punjab)","instructions":"Out for delivery","status":"OUT_DELIVERY"},{"scanDateTime":"2017-12-15T17:27:06.002000","scannedLocation":"Patiala (Punjab)","instructions":"Entry restricted area","status":"REACHED_DEST_CITY"},{"scanDateTime":"2017-12-15T20:00:19.667000","scannedLocation":"Patiala (Punjab)","instructions":"Reached maximum attempt count","status":"RETURNED"},{"scanDateTime":"2017-12-15T22:25:50.428000","scannedLocation":"Patiala_DPC (Punjab)","instructions":"Consignment received","status":"RETURNED"},{"scanDateTime":"2017-12-16T00:14:57.369000","scannedLocation":"Patiala_DPC (Punjab)","instructions":"Consignment dispatched from destination city","status":"RETURNED"},{"scanDateTime":"2017-12-16T08:24:43.557000","scannedLocation":"Chandigarh_Hub (Chandigarh)","instructions":"Consignment received","status":"RETURNED"},{"scanDateTime":"2017-12-17T09:49:51.761000","scannedLocation":"Gurgaon_Bilaspur_HB (Haryana)","instructions":"Consignment received","status":"RETURNED"},{"scanDateTime":"2017-12-18T19:32:46.297000","scannedLocation":"Bhiwandi_Mankoli_HB (Maharashtra)","instructions":"Consignment received","status":"RETURNED"},{"scanDateTime":"2017-12-18T22:20:13.377000","scannedLocation":"Mumbai Hub (Maharashtra)","instructions":"Consignment received at return city","status":"RETURNED"},{"scanDateTime":"2017-12-19T08:00:37.642000","scannedLocation":"BOM_Sakinaka_RP (Maharashtra)","instructions":"Consignment received at return city","status":"RETURNED"},{"scanDateTime":"2017-12-19T11:46:38.493000","scannedLocation":"BOM_Sakinaka_RP (Maharashtra)","instructions":"Dispatched for RTO","status":"OUT_DELIVERY_SELLER"},{"scanDateTime":"2017-12-19T20:28:08.197000","scannedLocation":"BOM_Sakinaka_RP (Maharashtra)","instructions":"RETURN Accepted","status":"DELIVERED_SELLER"}]},{"status":{"status":"DELIVERED_SELLER","statusDateTime":"2017-12-26T19:38:22.994","statusType":"DL","instructions":"RETURN Accepted"},"estimatedDate":"2017-12-25T23:59:59","flow":"REVERSE","flowDirection":"ONWARD","dispatchCount":2,"referenceNo":"764389E12152029","packageType":"PICKUP","awb":"1521511829914","destination":"Pune","scans":[{"scanDateTime":"2017-12-15T17:59:10.454000","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Received soft data for consignment.","status":"WAITING_PICKUP"},{"scanDateTime":"2017-12-23T09:54:03.903000","scannedLocation":"Pune_Pashan_DC (Maharashtra)","instructions":"Out for pickup","status":"WAITING_PICKUP"},{"scanDateTime":"2017-12-23T17:53:00.171000","scannedLocation":"Pune_Pashan_DC (Maharashtra)","instructions":"Request for delayed pickup","status":"WAITING_PICKUP"},{"scanDateTime":"2017-12-24T12:05:10.688000","scannedLocation":"Pune_Pashan_DC (Maharashtra)","instructions":"Out for pickup","status":"WAITING_PICKUP"},{"scanDateTime":"2017-12-24T12:05:31.002000","scannedLocation":"Pune_Pashan_DC (Maharashtra)","instructions":"DTO/REPL: Pick Up Completed","status":"PROD_REPLACED"},{"scanDateTime":"2017-12-25T16:55:22.677000","scannedLocation":"Pune_Tathawde_H (Maharashtra)","instructions":"Consignment received","status":"PROD_REPLACED"},{"scanDateTime":"2017-12-26T02:39:42.159000","scannedLocation":"Pune_Tathawde_H (Maharashtra)","instructions":"Consignment dispatched from destination city","status":"PROD_REPLACED"},{"scanDateTime":"2017-12-26T06:01:05.258000","scannedLocation":"Mumbai Hub (Maharashtra)","instructions":"Consignment received at return city","status":"PROD_REPLACED"},{"scanDateTime":"2017-12-26T07:37:08.005000","scannedLocation":"BOM_Sakinaka_RP (Maharashtra)","instructions":"Consignment received at return city","status":"PROD_REPLACED"},{"scanDateTime":"2017-12-26T09:42:06.459000","scannedLocation":"BOM_Sakinaka_RP (Maharashtra)","instructions":"Dispatched for RTO","status":"OUT_DELIVERY_SELLER"},{"scanDateTime":"2017-12-26T19:38:22.994000","scannedLocation":"BOM_Sakinaka_RP (Maharashtra)","instructions":"RETURN Accepted","status":"DELIVERED_SELLER"}]},{"status":{"status":"DELIVERED_SELLER","statusDateTime":"2018-01-08T17:32:06.393","statusType":"DL","instructions":"RETURN Accepted"},"estimatedDate":"2018-01-02T23:59:59","flow":"FORWARD","flowDirection":"RETURN","dispatchCount":2,"referenceNo":"212333401E12282025","packageType":"COD","awb":"1521512409816","destination":"South Delhi","scans":[{"scanDateTime":"2017-12-28T17:55:17.033000","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Consignment Manifested","status":"WAITING_PICKUP"},{"scanDateTime":"2017-12-29T12:07:38","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Out for Pickup","status":"WAITING_PICKUP"},{"scanDateTime":"2017-12-30T03:26:03","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Out for Pickup","status":"WAITING_PICKUP"},{"scanDateTime":"2017-12-31T07:44:09","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Shipment Picked Up from Client Location","status":"PICKUP"},{"scanDateTime":"2017-12-31T10:03:24.840000","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Shipment Recieved at Origin Center","status":"IN_TRANSIT"},{"scanDateTime":"2017-12-31T11:37:26.864000","scannedLocation":"Mumbai Hub (Maharashtra)","instructions":"Consignment received","status":"IN_TRANSIT"},{"scanDateTime":"2017-12-31T14:38:57.012000","scannedLocation":"Mumbai Hub (Maharashtra)","instructions":"Consignment dispatched from origin city","status":"IN_TRANSIT"},{"scanDateTime":"2018-01-01T04:24:35.782000","scannedLocation":"Mumbai Hub (Maharashtra)","instructions":"Bulk update","status":"IN_TRANSIT"},{"scanDateTime":"2018-01-01T04:46:00.084000","scannedLocation":"Delhi_Gateway_HB (Delhi)","instructions":"Consignment received at destination city","status":"IN_TRANSIT"},{"scanDateTime":"2018-01-01T13:54:06.232000","scannedLocation":"Samalkha_DC (Delhi)","instructions":"Received at destination city","status":"REACHED_DEST_CITY"},{"scanDateTime":"2018-01-02T09:16:58.004000","scannedLocation":"Samalkha_DC (Delhi)","instructions":"Out for delivery","status":"OUT_DELIVERY"},{"scanDateTime":"2018-01-02T12:28:04.002000","scannedLocation":"Samalkha_DC (Delhi)","instructions":"Bad/Incomplete Address","status":"REACHED_DEST_CITY"},{"scanDateTime":"2018-01-03T09:13:56.678000","scannedLocation":"Samalkha_DC (Delhi)","instructions":"Out for delivery","status":"OUT_DELIVERY"},{"scanDateTime":"2018-01-03T11:30:43.002000","scannedLocation":"Samalkha_DC (Delhi)","instructions":"Customer Cancelled the order","status":"REACHED_DEST_CITY"},{"scanDateTime":"2018-01-04T23:25:39.833000","scannedLocation":"Samalkha_DC (Delhi)","instructions":"No client instructions to Reattempt","status":"RETURNED"},{"scanDateTime":"2018-01-05T17:04:13.448000","scannedLocation":"Delhi_Kishangarh_DPC (Delhi)","instructions":"Consignment dispatched from destination city","status":"RETURNED"},{"scanDateTime":"2018-01-06T09:32:35.690000","scannedLocation":"Gurgaon_Bilaspur_HB (Haryana)","instructions":"Consignment received","status":"RETURNED"},{"scanDateTime":"2018-01-07T19:30:11.294000","scannedLocation":"Bhiwandi_Mankoli_HB (Maharashtra)","instructions":"Consignment received","status":"RETURNED"},{"scanDateTime":"2018-01-07T22:50:01.910000","scannedLocation":"Mumbai Hub (Maharashtra)","instructions":"Consignment received at return city","status":"RETURNED"},{"scanDateTime":"2018-01-08T07:58:30.926000","scannedLocation":"BOM_Sakinaka_RP (Maharashtra)","instructions":"Consignment received at return city","status":"RETURNED"},{"scanDateTime":"2018-01-08T09:57:08.703000","scannedLocation":"BOM_Sakinaka_RP (Maharashtra)","instructions":"Dispatched for RTO","status":"OUT_DELIVERY_SELLER"},{"scanDateTime":"2018-01-08T17:32:06.393000","scannedLocation":"BOM_Sakinaka_RP (Maharashtra)","instructions":"RETURN Accepted","status":"DELIVERED_SELLER"}]},{"status":{"status":"DELIVERED","statusDateTime":"2018-01-09T17:44:05.471","statusType":"DL","instructions":"Delivered"},"estimatedDate":"2018-01-08T23:59:59","flow":"FORWARD","flowDirection":"ONWARD","dispatchCount":2,"referenceNo":"209751781E12291326","packageType":"PREPAID","awb":"1521512421484","destination":"Port Blair","scans":[{"scanDateTime":"2017-12-29T10:56:41.560000","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Consignment Manifested","status":"WAITING_PICKUP"},{"scanDateTime":"2017-12-29T12:07:38","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Out for Pickup","status":"WAITING_PICKUP"},{"scanDateTime":"2017-12-30T03:26:03","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Out for Pickup","status":"WAITING_PICKUP"},{"scanDateTime":"2018-01-01T14:52:04","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Out for Pickup","status":"WAITING_PICKUP"},{"scanDateTime":"2018-01-01T17:57:45","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Pick up Attempted within window and shipment not ready","status":"WAITING_PICKUP"},{"scanDateTime":"2018-01-02T05:02:10.936000","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Package not picked/recieved from client","status":"NOT_PICKED"},{"scanDateTime":"2018-01-04T10:15:58","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Shipment Picked Up from Client Location","status":"PICKUP"},{"scanDateTime":"2018-01-04T12:45:26.456000","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Shipment Recieved at Origin Center","status":"IN_TRANSIT"},{"scanDateTime":"2018-01-04T16:59:23.797000","scannedLocation":"Mumbai Hub (Maharashtra)","instructions":"Consignment received","status":"IN_TRANSIT"},{"scanDateTime":"2018-01-04T17:41:45.924000","scannedLocation":"Mumbai Hub (Maharashtra)","instructions":"Consignment dispatched from origin city","status":"IN_TRANSIT"},{"scanDateTime":"2018-01-04T17:56:23.019000","scannedLocation":"Mumbai Hub (Maharashtra)","instructions":"Consignment dispatched from origin city","status":"IN_TRANSIT"},{"scanDateTime":"2018-01-05T04:16:12.478000","scannedLocation":"Chennai_Hub (Tamil Nadu)","instructions":"Consignment received","status":"IN_TRANSIT"},{"scanDateTime":"2018-01-05T07:28:24.454000","scannedLocation":"MAA_Poonamallee_HB (Tamil Nadu)","instructions":"Consignment received","status":"IN_TRANSIT"},{"scanDateTime":"2018-01-05T11:30:40.059000","scannedLocation":"Chennai_Hub (Tamil Nadu)","instructions":"Consignment received","status":"IN_TRANSIT"},{"scanDateTime":"2018-01-06T16:35:15.150000","scannedLocation":"PortBlair_Hudcocol_D (Andaman & Nicobar)","instructions":"Consignment received at destination city","status":"IN_TRANSIT"},{"scanDateTime":"2018-01-06T17:20:45.763000","scannedLocation":"PortBlair_Hudcocol_D (Andaman & Nicobar)","instructions":"Received at destination city","status":"REACHED_DEST_CITY"},{"scanDateTime":"2018-01-08T10:22:31.719000","scannedLocation":"PortBlair_Hudcocol_D (Andaman & Nicobar)","instructions":"Out for delivery","status":"OUT_DELIVERY"},{"scanDateTime":"2018-01-08T16:47:51.050000","scannedLocation":"PortBlair_Hudcocol_D (Andaman & Nicobar)","instructions":"Consignee unavailable ","status":"REACHED_DEST_CITY"},{"scanDateTime":"2018-01-09T09:38:17.695000","scannedLocation":"PortBlair_Hudcocol_D (Andaman & Nicobar)","instructions":"Out for delivery","status":"OUT_DELIVERY"},{"scanDateTime":"2018-01-09T17:44:05.471000","scannedLocation":"PortBlair_Hudcocol_D (Andaman & Nicobar)","instructions":"Delivered","status":"DELIVERED"}]},{"status":{"status":"DELIVERED_SELLER","statusDateTime":"2018-01-15T19:16:14.333","statusType":"DL","instructions":"RETURN Accepted"},"estimatedDate":"2018-01-05T23:59:59","flow":"FORWARD","flowDirection":"RETURN","dispatchCount":1,"referenceNo":"171-4570739-3212320E12310911","packageType":"PREPAID","awb":"1521512433804","destination":"FARIDABAD","scans":[{"scanDateTime":"2017-12-31T06:41:58.798000","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Consignment Manifested","status":"WAITING_PICKUP"},{"scanDateTime":"2018-01-01T14:52:04","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Out for Pickup","status":"WAITING_PICKUP"},{"scanDateTime":"2018-01-01T17:57:45","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Pick up Attempted within window and shipment not ready","status":"WAITING_PICKUP"},{"scanDateTime":"2018-01-04T04:53:42.297000","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Package not picked/recieved from client","status":"NOT_PICKED"},{"scanDateTime":"2018-01-04T06:24:46","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Shipment Picked Up from Client Location","status":"PICKUP"},{"scanDateTime":"2018-01-04T07:07:59.661000","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Shipment Recieved at Origin Center","status":"IN_TRANSIT"},{"scanDateTime":"2018-01-04T11:42:42.804000","scannedLocation":"Mumbai Hub (Maharashtra)","instructions":"Consignment received","status":"IN_TRANSIT"},{"scanDateTime":"2018-01-04T11:59:22.288000","scannedLocation":"Mumbai Hub (Maharashtra)","instructions":"Consignment dispatched from origin city","status":"IN_TRANSIT"},{"scanDateTime":"2018-01-04T22:20:15.156000","scannedLocation":"Delhi_Gateway_HB (Delhi)","instructions":"Consignment received","status":"IN_TRANSIT"},{"scanDateTime":"2018-01-05T04:04:07.528000","scannedLocation":"FBD_Balabhgarh_DPC (Haryana)","instructions":"Consignment received at destination city","status":"IN_TRANSIT"},{"scanDateTime":"2018-01-05T08:05:02.638000","scannedLocation":"Faridabad_Blbgarh_DC (Haryana)","instructions":"Received at destination city","status":"REACHED_DEST_CITY"},{"scanDateTime":"2018-01-05T08:52:06.484000","scannedLocation":"Faridabad_Blbgarh_DC (Haryana)","instructions":"Bulk update","status":"REACHED_DEST_CITY"},{"scanDateTime":"2018-01-05T09:56:23.153000","scannedLocation":"Faridabad_Blbgarh_DC (Haryana)","instructions":"Out for delivery","status":"OUT_DELIVERY"},{"scanDateTime":"2018-01-05T11:35:02.002000","scannedLocation":"Faridabad_Blbgarh_DC (Haryana)","instructions":"Bad/Incomplete Address","status":"REACHED_DEST_CITY"},{"scanDateTime":"2018-01-09T17:36:32.146000","scannedLocation":"Faridabad_Blbgarh_DC (Haryana)","instructions":"No client instructions to Reattempt","status":"RETURNED"},{"scanDateTime":"2018-01-11T13:09:11.011000","scannedLocation":"FBD_Balabhgarh_DPC (Haryana)","instructions":"Consignment dispatched from destination city","status":"RETURNED"},{"scanDateTime":"2018-01-11T17:42:00.537000","scannedLocation":"Gurgaon_Bilaspur_HB (Haryana)","instructions":"Consignment received","status":"RETURNED"},{"scanDateTime":"2018-01-13T13:28:11.291000","scannedLocation":"Bhiwandi_Mankoli_HB (Maharashtra)","instructions":"Consignment received","status":"RETURNED"},{"scanDateTime":"2018-01-13T16:30:34.724000","scannedLocation":"Mumbai Hub (Maharashtra)","instructions":"Consignment received at return city","status":"RETURNED"},{"scanDateTime":"2018-01-13T17:44:16.496000","scannedLocation":"BOM_Sakinaka_RP (Maharashtra)","instructions":"Consignment received at return city","status":"RETURNED"},{"scanDateTime":"2018-01-15T08:19:13.973000","scannedLocation":"BOM_Sakinaka_RP (Maharashtra)","instructions":"Dispatched for RTO","status":"OUT_DELIVERY_SELLER"},{"scanDateTime":"2018-01-15T19:16:14.333000","scannedLocation":"BOM_Sakinaka_RP (Maharashtra)","instructions":"RETURN Accepted","status":"DELIVERED_SELLER"}]},{"status":{"status":"DELIVERED","statusDateTime":"2018-01-10T16:03:50.002","statusType":"DL","instructions":"Delivered"},"estimatedDate":"2018-01-11T23:59:59","flow":"FORWARD","flowDirection":"ONWARD","dispatchCount":1,"referenceNo":"213133721E01021027","packageType":"PREPAID","awb":"1521512516124","destination":"Shimla","scans":[{"scanDateTime":"2018-01-02T07:57:54.068000","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Consignment Manifested","status":"WAITING_PICKUP"},{"scanDateTime":"2018-01-02T16:41:13","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Out for Pickup","status":"WAITING_PICKUP"},{"scanDateTime":"2018-01-05T15:06:01","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Out for Pickup","status":"WAITING_PICKUP"},{"scanDateTime":"2018-01-05T21:09:27","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Pick up Attempted within window and shipment not ready","status":"WAITING_PICKUP"},{"scanDateTime":"2018-01-06T04:55:34.949000","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Package not picked/recieved from client","status":"NOT_PICKED"},{"scanDateTime":"2018-01-07T08:41:52","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Shipment Picked Up from Client Location","status":"PICKUP"},{"scanDateTime":"2018-01-07T08:56:48.303000","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Shipment Recieved at Origin Center","status":"IN_TRANSIT"},{"scanDateTime":"2018-01-07T12:04:39.306000","scannedLocation":"Mumbai Hub (Maharashtra)","instructions":"Consignment received","status":"IN_TRANSIT"},{"scanDateTime":"2018-01-08T03:32:16.867000","scannedLocation":"Mumbai Hub (Maharashtra)","instructions":"Consignment dispatched from origin city","status":"IN_TRANSIT"},{"scanDateTime":"2018-01-08T13:54:49.260000","scannedLocation":"Chandigarh_Hub (Chandigarh)","instructions":"Consignment received","status":"IN_TRANSIT"},{"scanDateTime":"2018-01-09T11:28:07.584000","scannedLocation":"Shimla_Tara_DC (Himachal Pradesh)","instructions":"Consignment received at destination city","status":"IN_TRANSIT"},{"scanDateTime":"2018-01-09T11:35:16.916000","scannedLocation":"Shimla_Tara_DC (Himachal Pradesh)","instructions":"Received at destination city","status":"REACHED_DEST_CITY"},{"scanDateTime":"2018-01-10T09:49:54.458000","scannedLocation":"Shimla_Tara_DC (Himachal Pradesh)","instructions":"Out for delivery","status":"OUT_DELIVERY"},{"scanDateTime":"2018-01-10T16:03:50.002000","scannedLocation":"Shimla_Tara_DC (Himachal Pradesh)","instructions":"Delivered","status":"DELIVERED"}]},{"status":{"status":"Unknown package, potential reasons:<br />* Incorrect waybill/order number.<br />* Incorrect type selected for waybill/order number.<br />* We have not received the package. Please try later."},"flow":"FORWARD","flowDirection":"ONWARD","awb":"1521500406510"}]
     */

    private MetaBean meta;
    private List<DataBean> data;

    public MetaBean getMeta() {
        return meta;
    }

    public void setMeta(MetaBean meta) {
        this.meta = meta;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DelhiveryJsonPojo{" +
                "meta=" + meta +
                ", data=" + data +
                '}';
    }

    public static class MetaBean {
        /**
         * requestId : fd999191-fa5a-11e7-a53e-bdfb5d0ba874
         */

        private String requestId;

        public String getRequestId() {
            return requestId;
        }

        public void setRequestId(String requestId) {
            this.requestId = requestId;
        }

        @Override
        public String toString() {
            return "MetaBean{" +
                    "requestId='" + requestId + '\'' +
                    '}';
        }
    }

    public static class DataBean {
        /**
         * status : {"status":"DELIVERED","statusDateTime":"2017-10-11T17:16:22.002","statusType":"DL","instructions":"Delivered to consignee"}
         * estimatedDate : 2017-10-11T23:59:59
         * flow : FORWARD
         * flowDirection : ONWARD
         * dispatchCount : 1
         * referenceNo : 173651371E10061927
         * packageType : PREPAID
         * awb : 1521510113890
         * destination : Aurangabad
         * scans : [{"scanDateTime":"2017-10-06T16:57:15.942000","scannedLocation":"HQ (Haryana)","instructions":"Consignment Manifested","status":"WAITING_PICKUP"},{"scanDateTime":"2017-10-09T13:47:58","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Shipment Picked Up from Client Location","status":"PICKUP"},{"scanDateTime":"2017-10-09T15:50:31.607000","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Shipment Recieved at Origin Center","status":"IN_TRANSIT"},{"scanDateTime":"2017-10-09T18:12:57.694000","scannedLocation":"Mumbai_Chndivli_PC (Maharashtra)","instructions":"Consignment dispatched from origin city","status":"IN_TRANSIT"},{"scanDateTime":"2017-10-09T21:19:50.916000","scannedLocation":"Bhiwandi_Mankoli_HB (Maharashtra)","instructions":"Consignment received","status":"IN_TRANSIT"},{"scanDateTime":"2017-10-10T03:26:36.956000","scannedLocation":"Pune_Tathawde_H (Maharashtra)","instructions":"Consignment received","status":"IN_TRANSIT"},{"scanDateTime":"2017-10-10T20:45:04.064000","scannedLocation":"Aurangabad_Shendra_H (Maharashtra)","instructions":"Consignment received at destination city","status":"IN_TRANSIT"},{"scanDateTime":"2017-10-11T08:39:27.479000","scannedLocation":"Aurangabad (Maharashtra)","instructions":"Received at destination city","status":"REACHED_DEST_CITY"},{"scanDateTime":"2017-10-11T10:57:44.041000","scannedLocation":"Aurangabad (Maharashtra)","instructions":"Out for delivery","status":"OUT_DELIVERY"},{"scanDateTime":"2017-10-11T17:16:22.002000","scannedLocation":"Aurangabad (Maharashtra)","instructions":"Delivered to consignee","status":"DELIVERED"}]
         */

        private StatusBean status;
        private String estimatedDate;
        private String flow;
        private String flowDirection;
        private int dispatchCount;
        private String referenceNo;
        private String packageType;
        private String awb;
        private String destination;
        private List<ScansBean> scans;

        public StatusBean getStatus() {
            return status;
        }

        public void setStatus(StatusBean status) {
            this.status = status;
        }

        public String getEstimatedDate() {
            return estimatedDate;
        }

        public void setEstimatedDate(String estimatedDate) {
            this.estimatedDate = estimatedDate;
        }

        public String getFlow() {
            return flow;
        }

        public void setFlow(String flow) {
            this.flow = flow;
        }

        public String getFlowDirection() {
            return flowDirection;
        }

        public void setFlowDirection(String flowDirection) {
            this.flowDirection = flowDirection;
        }

        public int getDispatchCount() {
            return dispatchCount;
        }

        public void setDispatchCount(int dispatchCount) {
            this.dispatchCount = dispatchCount;
        }

        public String getReferenceNo() {
            return referenceNo;
        }

        public void setReferenceNo(String referenceNo) {
            this.referenceNo = referenceNo;
        }

        public String getPackageType() {
            return packageType;
        }

        public void setPackageType(String packageType) {
            this.packageType = packageType;
        }

        public String getAwb() {
            return awb;
        }

        public void setAwb(String awb) {
            this.awb = awb;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public List<ScansBean> getScans() {
            return scans;
        }

        public void setScans(List<ScansBean> scans) {
            this.scans = scans;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "status=" + status +
                    ", estimatedDate='" + estimatedDate + '\'' +
                    ", flow='" + flow + '\'' +
                    ", flowDirection='" + flowDirection + '\'' +
                    ", dispatchCount=" + dispatchCount +
                    ", referenceNo='" + referenceNo + '\'' +
                    ", packageType='" + packageType + '\'' +
                    ", awb='" + awb + '\'' +
                    ", destination='" + destination + '\'' +
                    ", scans=" + scans +
                    '}';
        }

        public static class StatusBean {
            /**
             * status : DELIVERED
             * statusDateTime : 2017-10-11T17:16:22.002
             * statusType : DL
             * instructions : Delivered to consignee
             */

            private String status;
            private String statusDateTime;
            private String statusType;
            private String instructions;

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getStatusDateTime() {
                return statusDateTime;
            }

            public void setStatusDateTime(String statusDateTime) {
                this.statusDateTime = statusDateTime;
            }

            public String getStatusType() {
                return statusType;
            }

            public void setStatusType(String statusType) {
                this.statusType = statusType;
            }

            public String getInstructions() {
                return instructions;
            }

            public void setInstructions(String instructions) {
                this.instructions = instructions;
            }

            @Override
            public String toString() {
                return "StatusBean{" +
                        "status='" + status + '\'' +
                        ", statusDateTime='" + statusDateTime + '\'' +
                        ", statusType='" + statusType + '\'' +
                        ", instructions='" + instructions + '\'' +
                        '}';
            }
        }

        public static class ScansBean {
            /**
             * scanDateTime : 2017-10-06T16:57:15.942000
             * scannedLocation : HQ (Haryana)
             * instructions : Consignment Manifested
             * status : WAITING_PICKUP
             */

            private String scanDateTime;
            private String scannedLocation;
            private String instructions;
            private String status;

            public String getScanDateTime() {
                return scanDateTime;
            }

            public void setScanDateTime(String scanDateTime) {
                this.scanDateTime = scanDateTime;
            }

            public String getScannedLocation() {
                return scannedLocation;
            }

            public void setScannedLocation(String scannedLocation) {
                this.scannedLocation = scannedLocation;
            }

            public String getInstructions() {
                return instructions;
            }

            public void setInstructions(String instructions) {
                this.instructions = instructions;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            @Override
            public String toString() {
                return "ScansBean{" +
                        "scanDateTime='" + scanDateTime + '\'' +
                        ", scannedLocation='" + scannedLocation + '\'' +
                        ", instructions='" + instructions + '\'' +
                        ", status='" + status + '\'' +
                        '}';
            }
        }
    }
}
