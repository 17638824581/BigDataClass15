package com.xty.genericity;

public class Teacher extends Person{
    public void teaching(){
        System.out.println(this.getName()+"老师开始上课！");
    }

    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Teacher{} " + super.toString();
    }
}
