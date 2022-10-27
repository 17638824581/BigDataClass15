package com.xty.Interface;

public class Person implements Ikun{

    public String name;
    public int age;
    public String sex;

    public Person() {
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public void playBasketball() {
        System.out.println(this.name+"开始打篮球！");
    }

    @Override
    public void jump() {
        System.out.println(this.name+"跳起来了");
    }

    @Override
    public void rep() {
        System.out.println(this.name+"唱起来rep了");
    }

    @Override
    public void realSing() {
        System.out.println(this.name+"真的唱起来了");
    }

    @Override
    public void falseSing() {
        System.out.println(this.name+"张嘴唱起来了");
    }
}
