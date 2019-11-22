package com.example.helpertest;

import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Task {
    private String title;
    private String cost;
    private int userLogoId;
    private String taskNum;
    private List<String> labelList;
    private String date;
    //private RecyclerView recyclerView;
    public Task(String title, String cost, int userLogoId, String taskNum, List<String> list,String date) {
        this.title = title;
        this.cost = cost;
        //this.recyclerView = recyclerView;
        this.userLogoId=userLogoId;
        this.taskNum=taskNum;
        this.labelList=list;
        this.date=date;
    }

    public String getTitle() {
        return title;
    }

    public String getCost() {
        return cost;
    }


    //public RecyclerView getRecyclerView() {
    //    return recyclerView;
    //}

    public int getUserLogoId() {
        return userLogoId;
    }

    public String getTaskNum() {
        return taskNum;
    }

    public List<String> getLabelList() {
        return labelList;
    }

    public String getDate() {
        return date;
    }
}
