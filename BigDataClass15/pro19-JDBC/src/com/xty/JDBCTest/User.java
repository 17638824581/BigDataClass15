package com.xty.JDBCTest;

public class User {
    private int u_id;
    private String u_name;
    private String u_psd;

    public User() {
    }

    public User(int u_id, String u_name, String u_psd) {
        this.u_id = u_id;
        this.u_name = u_name;
        this.u_psd = u_psd;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_psd() {
        return u_psd;
    }

    public void setU_psd(String u_psd) {
        this.u_psd = u_psd;
    }

    @Override
    public String toString() {
        return "User{" +
                "u_id=" + u_id +
                ", u_name='" + u_name + '\'' +
                ", u_psd='" + u_psd + '\'' +
                '}';
    }
}
