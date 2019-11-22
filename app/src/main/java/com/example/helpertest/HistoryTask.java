package com.example.helpertest;

import android.widget.ImageView;

import java.util.List;

public class HistoryTask {
    private String title;
    private String cost;
    private String date;
    private int userLogoId;
    private List<String> list;
    public HistoryTask(String title, String cost, int userLogoId,List<String> list, String date) {
        this.title = title;
        this.cost = cost;
        this.date = date;
        this.userLogoId=userLogoId;
        this.list=list;
    }

    public String getTitle() {
        return title;
    }

    public String getCost() {
        return cost;
    }


    public String getDate() {
        return date;
    }

    public int getUserLogoId() {
        return userLogoId;
    }

    public List<String> getList() {
        return list;
    }
}
