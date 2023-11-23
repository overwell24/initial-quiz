package com.initialquiz.dto;

public class UserDTO {

    private String username;
    private String passwd;
    private int point;

    public String getUsername() {
        return username;
    }

    public String getPasswd() {
        return passwd;
    }

    public int getPoint() {
        return point;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
