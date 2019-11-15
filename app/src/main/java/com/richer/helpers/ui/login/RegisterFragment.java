package com.richer.helpers.ui.login;

import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.richer.helpers.NetWork.HttpRequest;
import com.richer.helpers.R;

import java.util.Objects;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterFragment extends Fragment implements View.OnClickListener{

    private EditText et_username;
    private EditText et_password;
    private EditText et_confirmpwd;
    private EditText et_jwcUsername;
    private EditText et_jwcPassword;

    private Button bt_register;
    private Button bt_cancel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_register,container,false);

        et_username = view.findViewById(R.id.et_username_register);
        et_password = view.findViewById(R.id.et_password_register);
        et_confirmpwd = view.findViewById(R.id.et_repeat_register);
        et_jwcUsername = view.findViewById(R.id.et_identify_name_register);
        et_jwcPassword = view.findViewById(R.id.et_identify_password_register);
        et_password.setTransformationMethod(PasswordTransformationMethod.getInstance());
        et_confirmpwd.setTransformationMethod(PasswordTransformationMethod.getInstance());
        et_jwcPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());

        bt_register = view.findViewById(R.id.done_register);
        bt_register.setOnClickListener(this);
        bt_cancel = view.findViewById(R.id.cancel_register);
        bt_cancel.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.done_register:

            case R.id.cancel_register:
                getActivity().onBackPressed();
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

    private int registerRequest(String username, String password, String jwcname, String jwcpwd){

        int result=0;

        HttpRequest.Register(username, password, jwcname, jwcpwd, new Callback<Integer>() {
            @Override
            public void onResponse(Call<Integer> call, Response<Integer> response) {

            }

            @Override
            public void onFailure(Call<Integer> call, Throwable t) {

            }
        });
        return result;

    }

}
