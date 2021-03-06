package com.android_test.zmh.lu_stationerystoreinventorysystem.Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by student on 4/3/15.
 */
public class DeliveryOrder {
    private String id;
    private String number;
    private Date date;
    private String status;
    private String remark;
    private List<DeliveryOrderDetail> deliveryOrderDetail = new ArrayList<DeliveryOrderDetail>();

    private String getID(){
        return id;
    }

    private void setID(String id){
        this.id = id;
    }

    private String getNumber(){
        return number;
    }

    private void setNumber(String number){
        this.number = number;
    }

    private Date getDate(){
        return date;
    }

    private void setDate(Date date){
        this.date = date;
    }

    private String getStatus(){
        return status;
    }

    private void setStatus(String status){
        this.status = status;
    }

    private String getRemark(){
        return remark;
    }

    private void setRemark(String remark){
        this.remark = remark;
    }

    private List<DeliveryOrderDetail> getDeliveryOrderDetail(){
        return deliveryOrderDetail;
    }

    private void setDeliveryOrderDetail(List<DeliveryOrderDetail> deliveryOrderDetail){
        this.deliveryOrderDetail = deliveryOrderDetail;
    }

}
