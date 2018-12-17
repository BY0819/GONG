package com.example.vmfld.gonggumi.ApiData;

public class officialM_used_mData {
    String name; // date
    String txt_use_name1;
    String txt_use_name2;
    String txt_use_price1;
    String txt_use_price2;

    public officialM_used_mData(String name, String txt_use_name1, String txt_use_price1) {
        this.name = name;
        this.txt_use_name1 = txt_use_name1;
        this.txt_use_price1 = txt_use_price1;
        this.txt_use_name2 = null;
        this.txt_use_price2 = null;
    }

    public officialM_used_mData(String name, String txt_use_name1, String txt_use_price1, String txt_use_name2, String txt_use_price2) {
        this.name = name;
        this.txt_use_name1 = txt_use_name1;
        this.txt_use_price1 = txt_use_price1;
        this.txt_use_name2 = txt_use_name2;
        this.txt_use_price2 = txt_use_price2;
    }

    public String getName() {
        return name;
    }

    public String getTxt_use_name1() {
        return txt_use_name1;
    }

    public String getTxt_use_name2() {
        return txt_use_name2;
    }

    public String getTxt_use_price1() {
        return txt_use_price1;
    }

    public String getTxt_use_price2() {
        return txt_use_price2;
    }
}
