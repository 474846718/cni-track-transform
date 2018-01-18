package com.cni.pojo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Waybill {

    private String info;
    private String number;
    private Long estimatedDate;  //Long默认值是null不是0
    private String headCompany;
    private String tailCompany;
    private String compAddInfo;
    private List<String> historyStatus;
    private String currStatus;
    private String currStatusSub;
    private String currStatusLv2;
    private List<SavePoint> savePoints = new ArrayList<>();
    private static final List<String> exceptions;

    public static List<String> getExceptions() {
        return exceptions;
    }

    static {
        exceptions = new ArrayList<>();
        exceptions.add("Refuse");
        exceptions.add("Payment");
        exceptions.add("Address/Contact Issue");
        exceptions.add("Future Delivery");
        exceptions.add("Self Collect");
        exceptions.add("Delay");
        exceptions.add("Undelivered");
    }

    public Waybill() {
    }

    public Waybill(String number) {
        this.number = number;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setCurrStatusLv2(String currStatusLv2) {
        this.currStatusLv2 = currStatusLv2;
    }

    public String getCurrStatusLv2() {
        return currStatusLv2;
    }

    public void setHistoryStatus(List<String> historyStatus) {
        this.historyStatus = historyStatus;
    }

    public List<String> getHistoryStatus() {
        return historyStatus;
    }

    public String getCurrStatus() {
        return currStatus;
    }

    public void setCurrStatus(String currStatus) {
        this.currStatus = currStatus;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void addSavePiont(SavePoint savePoint) {
        if (null == savePoint)
            return;
        savePoints.add(savePoint);
    }

    public List<SavePoint> getSavePoints() {
        return savePoints;
    }

    public String getCurrStatusSub() {
        return currStatusSub;
    }

    public void setCurrStatusSub(String currStatusSub) {
        this.currStatusSub = currStatusSub;
    }

    public void setSavePoints(List<SavePoint> savePoints) {
        this.savePoints = savePoints;
    }

    /**
     * 合并运单
     *
     * @param
     */
    public void joinWaybill(Waybill beJoin) {
        if (null == beJoin)
            return;
        this.setHeadCompany(beJoin.getHeadCompany());
        joinSavePointsSortAndSetStatus(beJoin.getSavePoints());

        //设置头程公司
        if ("Shipment Created".equals(lastSavePoint().getStatus()))
            setHeadCompany("CNI");
    }


    public SavePoint firstSavePoint() {
        return savePoints.get(0);
    }

    /**
     * 加入一堆存储点
     * 排序并且更新运单状态
     */
    public void joinSavePointsSortAndSetStatus(List<SavePoint> savePoints) {
        List<SavePoint> host = getSavePoints();
        host.addAll(savePoints);
        setSavePoints(host);
        sortAndSetStatus();
    }


    /**
     * 按日期排序后
     * 设置历史状态和最新状态
     */
    public void sortAndSetStatus() {
        if (0 == savePoints.size())
            return;
        savePoints.sort(Comparator.comparing(SavePoint::getDate));
        List<String> historyStatus = new ArrayList<>();
        for (SavePoint savePoint : savePoints)
            historyStatus.add(savePoint.getStatus());
        setHistoryStatus(historyStatus);
        setCurrStatus(historyStatus.get(historyStatus.size() - 1));
        //异常状态
        if (exceptions.contains(getCurrStatus())) {
            setCurrStatus("Exception");
            setCurrStatusSub(lastSavePoint().getStatus());
            setCurrStatusLv2(lastSavePoint().getInfo());
        }
    }

    public String getHeadCompany() {
        return headCompany;
    }

    public void setHeadCompany(String headCompany) {
        this.headCompany = headCompany;
    }

    public String getTailCompany() {
        return tailCompany;
    }

    public void setTailCompany(String tailCompany) {
        this.tailCompany = tailCompany;
    }

    public Long getEstimatedDate() {
        return estimatedDate;
    }

    public String getCompAddInfo() {
        return compAddInfo;
    }

    public void setCompAddInfo(String compAddInfo) {
        this.compAddInfo = compAddInfo;
    }

    public void setEstimatedDate(Long estimatedDate) {
        this.estimatedDate = estimatedDate;
    }

    public SavePoint lastSavePoint() {
        return savePoints.get(savePoints.size() - 1);
    }


    public static class SavePoint {
        private String place;
        private Date date;
        private String info;
        private String status;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getPlace() {
            return place;
        }

        public void setPlace(String place) {
            this.place = place;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }
    }

}
