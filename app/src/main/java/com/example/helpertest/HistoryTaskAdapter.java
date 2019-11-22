package com.example.helpertest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class HistoryTaskAdapter extends RecyclerView.Adapter<HistoryTaskAdapter.ViewHolder> {
    private List<HistoryTask> mTaskList;
    private Context context;
    private LinearLayoutManager lln;
    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView userLogo;
        TextView taskTitle;
        TextView taskCost;
        TextView taskDate;
        RecyclerView recyclerView;
        public ViewHolder(View view){
            super(view);
            userLogo=(ImageView)view.findViewById(R.id.history_logo_text_view);
            taskTitle=(TextView)view.findViewById(R.id.history_title_text_view);
            taskCost=(TextView)view.findViewById(R.id.history_cost_text_view);
            taskDate=(TextView)view.findViewById(R.id.history_date_text_view);
            recyclerView=(RecyclerView)view.findViewById(R.id.history_label_cycle_view);
        }
    }

    public HistoryTaskAdapter(List<HistoryTask> taskList,Context context){
        this.mTaskList=taskList;
        this.context=context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.history_task_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {
        HistoryTask historyTask=mTaskList.get(position);
        lln=new LinearLayoutManager(context);
        lln.setOrientation(LinearLayoutManager.HORIZONTAL);
        holder.recyclerView.setLayoutManager(lln);
        LabelAdapter labelAdapter=new LabelAdapter(historyTask.getList(),context);
        holder.recyclerView.setAdapter(labelAdapter);
        holder.taskTitle.setText(historyTask.getTitle());
        holder.taskCost.setText(historyTask.getCost());
        holder.userLogo.setImageResource(historyTask.getUserLogoId());
        holder.taskDate.setText(historyTask.getDate());
    }

    @Override
    public int getItemCount() {
        return mTaskList.size();
    }
}
