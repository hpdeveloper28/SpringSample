package com.springsample.readxmlbeandata.models;

public class User {

    private int userId;
    private String userName;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void displayUSerName() {
        System.out.println("Your username is " + getUserName());
    }
}
