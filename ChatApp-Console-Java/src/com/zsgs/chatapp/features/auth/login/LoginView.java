package com.zsgs.chatapp.features.auth.login;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LoginView {
    private final LoginModel loginModel;


    public LoginView() {
        loginModel = new LoginModel(this);
    }


    public void init(){
        System.out.println("Iniit Sucess");
    }


    private String getCurrenttime(){
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return
    }




}
