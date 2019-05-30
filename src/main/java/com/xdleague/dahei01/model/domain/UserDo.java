package com.xdleague.dahei01.model.domain;

public class UserDo {
    private int uid;
    private String name;

    @Override
    public String toString() {
        return "UserDo{" +
                "uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
