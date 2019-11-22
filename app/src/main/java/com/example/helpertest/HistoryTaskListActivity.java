package com.example.helpertest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class HistoryTaskListActivity extends AppCompatActivity {
    private List<HistoryTask> historyTaskList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history_activity_task_list);
        init();
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.history_recycle_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        HistoryTaskAdapter adapter=new HistoryTaskAdapter(historyTaskList,getApplicationContext());
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
            HistoryTask historyTask=new HistoryTask("帮拿韵达快递","5元",R.drawable.userlogo,list,"11/12 11:23");
            historyTaskList.add(historyTask);

            List<String> list1=new ArrayList<>();
            String label1="带饭、跑腿";
            String[] str1=label1.split("、");
            for(int j=0;j<str1.length;j++){
                list1.add(str1[j]);
            }
            HistoryTask historyTask1=new HistoryTask("紫荆一楼带饭打包","5元",R.drawable.userlogo,list1,"11/12 11:23");
            historyTaskList.add(historyTask1);
        }
    }
}
