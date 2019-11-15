package com.richer.helpers.NetWork;

import com.richer.helpers.Entity.LoginUser;
import com.richer.helpers.Entity.RegisterUser;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface Api {

    @POST("register")
    Call<Integer> register(@Body RegisterUser user);

    @POST("login")
    Call<Integer> login(@Body LoginUser user);

}
