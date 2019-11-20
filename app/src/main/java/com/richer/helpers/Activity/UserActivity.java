package com.richer.helpers.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.richer.helpers.NetWork.NetWork;
import com.richer.helpers.R;

public class UserActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		//vsdvsfdvsfdaefvsv
        NetWork.init();
        setContentView(R.layout.activity_user);

    }
	//cesvrbrdbtdbdstbsdtnb
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            default:
                break;
        }
    }
}
