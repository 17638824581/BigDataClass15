package com.dahua.enumerate;

public class StudentTest {

    // 接收一个季节
    //  冬季、春季、夏季、秋季
    public static void show(Season s){

        if (s == Season.冬){
            System.out.println("银装素裹");
        } else if (s == Season.秋) {
            System.out.println("秋高气爽");
        } else if (s == Season.夏) {
            System.out.println("烈日炎炎");
        } else if (s == Season.春) {
            System.out.println("春暖花开");
        }
    }

    public static void main(String[] args) {
        show(Season.秋);
    }
}
