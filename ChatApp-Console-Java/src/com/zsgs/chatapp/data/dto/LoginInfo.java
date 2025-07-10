package com.zsgs.chatapp.data.dto;

import com.zsgs.chatapp.features.search.FileType;

public class LoginInfo {
    private String mail;
    private String password;
    private FileType fileType;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
