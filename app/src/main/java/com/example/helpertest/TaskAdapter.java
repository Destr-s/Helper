package com.example.helpertest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.ViewHolder> {
    private Context context;
    private List<Task> mTaskList;
    private LinearLayoutManager lln;
    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView userLogo;
        TextView taskTitle;
        TextView taskCost;
        TextView taskNum;
        RecyclerView recyclerView;
        TextView taskDate;
        public ViewHolder(View view){
            super(view);
            userLogo=(ImageView)view.findViewById(R.id.logo_text_view);
            taskTitle=(TextView)view.findViewById(R.id.title_text_view);
            taskCost=(TextView)view.findViewById(R.id.cost_text_view);
            taskNum=(TextView)view.findViewById(R.id.num_text_view);
            recyclerView=(RecyclerView) view.findViewById(R.id.label_cycle_view);
            taskDate=(TextView)view.findViewById(R.id.date_text_view);
        }
    }

    public TaskAdapter(List<Task> taskList,Context context){
        this.mTaskList=taskList;
        this.context=context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item,parent,false);
        ViewHolder holder=new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {
        Task task=mTaskList.get(position);
        lln=new LinearLayoutManager(context);
        lln.setOrientation(LinearLayoutManager.HORIZONTAL);
        holder.recyclerView.setLayoutManager(lln);
        LabelAdapter labelAdapter=new LabelAdapter(task.getLabelList(),context);
        holder.recyclerView.setAdapter(labelAdapter);
        holder.taskTitle.setText(task.getTitle());
        holder.taskCost.setText(task.getCost());
        holder.userLogo.setImageResource(task.getUserLogoId());
        holder.taskNum.setText(task.getTaskNum());
        holder.taskDate.setText(task.getDate());
        //holder.recyclerView=task.getRecyclerView();

    }

    @Override
    public int getItemCount() {
        return mTaskList.size();
    }
}
