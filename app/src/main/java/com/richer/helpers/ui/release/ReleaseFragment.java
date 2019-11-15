package com.richer.helpers.ui.release;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.richer.helpers.R;

public class ReleaseFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_release, container, false);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("发布新任务");
        return view;
    }
}