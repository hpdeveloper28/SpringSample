package com.springsample.readxmlbeandata.models;

public class Student {
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    private String nickName;

    public void displayStudentNickName(){
        System.out.println("Your nickname is "+getNickName());
    }
}
