package com.richer.helpers.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.richer.helpers.Activity.MainActivity;
import com.richer.helpers.NetWork.HttpRequest;
import com.richer.helpers.R;

import java.net.Inet4Address;
import java.util.Objects;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginFragment extends Fragment implements View.OnClickListener{

    private EditText et_username;
    private EditText et_password;
    private Button bt_login;
    private Button bt_register;
    private String username;
    private String password;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_login,container,false);

        et_username = view.findViewById(R.id.et_username_login);
        et_password = view.findViewById(R.id.et_userpassword_login);
        et_password.setTransformationMethod(PasswordTransformationMethod.getInstance());

        bt_register = view.findViewById(R.id.bt_register_login);
        bt_register.setOnClickListener(this);
        bt_login = view.findViewById(R.id.bt_done_login);
        bt_login.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_register_login:
                replaceFragment(new RegisterFragment());
                break;
            case R.id.bt_done_login:
                username = et_username.getText().toString();
                password = et_password.getText().toString();
                loginRequest(username,password);
                Intent intent = new Intent(getContext(),MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    public void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = Objects.requireNonNull(getActivity()).getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_user,fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    private int loginRequest(String username, String password){

        final int result=0;

        HttpRequest.Login(username, password, new Callback<Integer>() {
            @Override
            public void onResponse(Call<Integer> call, Response<Integer> response) {
                if(response.body() != null){
                    System.out.println(response.body().toString());
                    //result = response.body().intValue();
                }
            }

            @Override
            public void onFailure(Call<Integer> call, Throwable t) {

            }
        });

        return result;
    }

}
