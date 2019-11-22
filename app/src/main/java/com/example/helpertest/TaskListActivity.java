package com.example.helpertest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class TaskListActivity extends AppCompatActivity {
    private List<Task> taskList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);
        init();
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycle_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        TaskAdapter adapter=new TaskAdapter(taskList,getApplicationContext());
        recyclerView.setAdapter(adapter);

    }

    private void init(){
        for(int i=0;i<30;i++){
            List<String> list=new ArrayList<>();
            String label="快递、跑腿";
            String[] str=label.split("、");
            for(int j=0;j<str.length;j++){
                list.add(str[j]);
            }
            Task task=new Task("帮拿韵达快递","5元",R.drawable.userlogo,"1",list,"11/12 11:23");
            taskList.add(task);

            List<String> list1=new ArrayList<>();
            String label1="带饭、跑腿";
            String[] str1=label1.split("、");
            for(int j=0;j<str1.length;j++){
                list1.add(str1[j]);
            }
            Task task1=new Task("紫荆一楼带饭","5元",R.drawable.userlogo,"1",list1,"11/12 11:23");
            taskList.add(task1);
        }
    }
}
