package com.dahua.extend;

public class Student extends Person{

    public void study(){
        System.out.println("学生开始学习！");
    }

    public Student(){
    }

    public Student(String name, int age, String gender){
        super(name,age,gender);
    }

}
