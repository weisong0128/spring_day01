package com.java.pojo;

/**
 * description:
 * author: ws
 * time: 2020/2/25 14:25
 */
public class Admin {
    private String uName="魏松";
    private String gender="男";

    public Admin(){
        System.out.println("Admin...无参构造方法");
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "uName='" + uName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
