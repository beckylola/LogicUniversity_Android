package com.android_test.zmh.lu_stationerystoreinventorysystem.Models;

import java.util.Date;

/**
 * Created by student on 4/3/15.
 */
public class Disbursement {
    private String id;
    private Date date;
    private String itemName;
    private String departmentName;
    private int qty;
    private int actualQty;


    private String getID() {
        return id;
    }

    private void setID(String id) {
        this.id = id;
    }

    private Date getDate(){
        return date;
    }

    private void setDate(Date date){
        this.date = date;
    }

    private String getItemName() {
        return itemName;
    }

    private void setItemName(String itemName) {
        this.itemName = itemName;
    }

    private String getDepartmentName() {
        return departmentName;
    }

    private void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    private int getQty() {
        return qty;
    }

    private void setQty(int qty) {
        this.qty = qty;
    }

    private int getActualQty() {
        return actualQty;
    }

    private void setActualQty(int actualQty) {
        this.actualQty = actualQty;
    }
}
