package com.xdleague.dahei01.model.dto;

public class LoginDto {

    private String userName;
    private String passWord;


    @Override
    public String toString() {
        return "LoginDto{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
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
        this.passWord = passWord;
    }
}
