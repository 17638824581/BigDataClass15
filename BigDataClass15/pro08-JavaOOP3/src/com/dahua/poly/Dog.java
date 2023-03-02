package com.dahua.poly;

public class Dog extends Mammal{

    public String color;

    public Dog() {
    }

    public Dog(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void lookHouse(){
        System.out.println(super.name+"在看家！");
    }

    @Override
    public void eat(String food) {
        System.out.println(name+"啃了"+food);
    }

    @Override
    public void crow() {
        System.out.println("旺旺！");
    }

    @Override
    public void nurse() {
        System.out.println("狗子给狗宝宝喂奶！");
    }
}
