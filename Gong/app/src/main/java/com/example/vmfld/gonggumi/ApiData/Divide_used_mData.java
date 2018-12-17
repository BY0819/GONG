package com.example.vmfld.gonggumi.ApiData;

public class Divide_used_mData {
    String name; // date
    String txt_left;
    String txt_use_price1;
    String txt_use_price2;

    public Divide_used_mData(String name, String txt_use_price1, String txt_left) {
        this.name = name;
        this.txt_left = txt_left;
        this.txt_use_price1 = txt_use_price1;
        this.txt_use_price2 = null;
    }

    public Divide_used_mData(String name, String txt_use_price1, String txt_use_price2, String txt_left) {
        this.name = name;
        this.txt_left = txt_left;
        this.txt_use_price1 = txt_use_price1;
        this.txt_use_price2 = txt_use_price2;
    }

    public String getName() {
        return name;
    }

    public String getTxt_left() {
        return txt_left;
    }

    public String getTxt_use_price1() {
        return txt_use_price1;
    }

    public String getTxt_use_price2() {
        return txt_use_price2;
    }
}
