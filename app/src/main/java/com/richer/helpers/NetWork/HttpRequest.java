package com.richer.helpers.NetWork;

import com.richer.helpers.Entity.LoginUser;
import com.richer.helpers.Entity.RegisterUser;

import retrofit2.Callback;

public class HttpRequest {

    public static void Register(String name, String pwd, String jwcName, String jwcPwd, Callback<Integer> callback){
        NetWork.api.register(new RegisterUser(name,pwd,jwcName,jwcPwd)).enqueue(callback);
    }

    public static void Login(String name, String pwd, Callback<Integer> callback){
        NetWork.api.login(new LoginUser(name,pwd)).enqueue(callback);
    }

}
