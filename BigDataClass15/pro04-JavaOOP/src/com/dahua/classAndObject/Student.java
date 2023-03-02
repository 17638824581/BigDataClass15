package com.dahua.classAndObject;

public class Student {

    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void study(){
        System.out.println(this.name+"开始学习了！");
    }

    public void doHomework(){
        System.out.println(this.name+"开始做作业了！");
    }
}
