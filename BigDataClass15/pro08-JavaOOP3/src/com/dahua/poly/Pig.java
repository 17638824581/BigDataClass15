package com.dahua.poly;

import com.dahua.Interface.Jump;

public class Pig extends Animal implements Jump {

    public double weight;

    public Pig() {
    }

    public Pig(String name, int age, double weight) {
        super(name, age);
        this.weight = weight;
    }

    public void sleep(){
        System.out.println(super.name+"开始睡觉！");
    }

    @Override
    public void eat(String food) {
        System.out.println(super.name+"拱了"+food);
    }

    @Override
    public void crow() {
        System.out.println("哼哼！");
    }

    @Override
    public void jump() {
        System.out.println("猪"+name+"跳起来了！");
    }
}
