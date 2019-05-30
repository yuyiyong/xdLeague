package com.xdleague.dahei01.model.dto;

import com.xdleague.dahei01.Utils.CookieUtils;

public class InsertAdminDto {
    private String userName;
    private String passWord;
    private int platformId;

    @Override
    public String toString() {
        return "InsertAdminDto{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", platformId=" + platformId +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        String pwd = CookieUtils.buildPwd(passWord);
        this.passWord = pwd;
    }

    public int getPlatformId() {
        return platformId;
    }

    public void setPlatformId(int platformId) {
        this.platformId = platformId;
    }
}
