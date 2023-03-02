package com.dahua.poly;

// 猫类
public class Cat extends Animal{
    public String breed;

    public Cat() {
    }

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void eat(String food) {
        System.out.println(super.name+"舔了"+food);
    }

    // 在父类中的抽象方法，没有方法体，在子类中就需要给出。
    @Override
    public void crow() {
        System.out.println("喵喵！");
    }

    // 猫抓老鼠方法
    public void catchMouse(){
        System.out.println(super.name+"抓了一只大老鼠！");
    }
}
