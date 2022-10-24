package com.xty.extend;

public class Teacher extends Person{

    public Teacher() {
    }

    public Teacher(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void teaching(){
        System.out.println("老师开始教学！");
    }
}
