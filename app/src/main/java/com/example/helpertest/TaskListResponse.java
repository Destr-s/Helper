package com.example.helpertest;

import java.util.List;

public class TaskListResponse {

    public String result;

    public List<Data> dataList;

    public static class Data{

        public String title;
        public String label;
        public String accoutname;
        public String cost;
        public String num;
        public String tno;

    }

}

