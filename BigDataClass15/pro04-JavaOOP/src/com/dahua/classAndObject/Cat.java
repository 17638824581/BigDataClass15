package com.dahua.classAndObject;

public class Cat {

    // 猫类属性
    String name;
    int age;
    String color;

    // 构造方法
    public Cat() {
    }

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // 猫类方法
    public void cry(){
        System.out.println(this.name+"叫了：喵~");
    }

    public void eat(String food){
        System.out.println(this.name+"吃了"+food);
    }
}
