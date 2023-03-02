package com.dahua.Interface;

public class Dog implements Jump,Stand {
    public String name;
    public int age;
    public String color;

    public Dog() {
    }

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void crow(){
        System.out.println(this.name+"汪汪叫！");
    }

    public void eat(){
        System.out.println(this.name+"吃了饭！");
    }

    @Override
    public void jump() {
        System.out.println(this.name+"跳起来了！");
    }

    @Override
    public void stand() {
        System.out.println(this.name+"站起来了！");
    }
}
