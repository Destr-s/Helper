package com.example.helpertest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LabelAdapter extends RecyclerView.Adapter<LabelAdapter.ViewHoder>{
    private List<String> labelList;
    private Context context;
    static class ViewHoder extends RecyclerView.ViewHolder{
        TextView textView;
        public ViewHoder(View view){
            super(view);
            textView=(TextView)view.findViewById(R.id.label_text_view);
        }
    }
    public LabelAdapter(List<String> list,Context context){
        this.labelList=list;
        this.context=context;
    }

    @Override
    public ViewHoder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.label_item,parent,false);
        ViewHoder hoder=new ViewHoder(view);
        return hoder;
    }

    @Override
    public void onBindViewHolder(ViewHoder holder, int position) {
        String s=labelList.get(position);
        holder.textView.setText(s);
    }

    @Override
    public int getItemCount() {
        return labelList.size();
    }
}
