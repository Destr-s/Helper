package com.richer.helpers.ui.mine;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.richer.helpers.R;
import com.richer.helpers.ui.home.HomeFragment;

import java.util.Objects;

public class MineFragment extends Fragment implements View.OnClickListener{

    Button bt_editInfo;
    CardView cv_mytask;
    CardView cv_mytrans;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user, container, false);

        cv_mytask = view.findViewById(R.id.cv_mytask_user);
        cv_mytrans = view.findViewById(R.id.cv_mytrans_user);

        cv_mytrans.setOnClickListener(this);
        cv_mytask.setOnClickListener(this);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("我");
        bt_editInfo = view.findViewById(R.id.bt_edit_user);
        bt_editInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(R.layout.edit_information);
                builder.setTitle("编辑资料");
                builder.setPositiveButton("保存", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(),"保存成功",Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton("取消",null);
                builder.create().show();
            }
        });
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            default:
                break;
        }
    }
}