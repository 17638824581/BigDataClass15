package com.dahua.poly;

public abstract class Mammal extends Animal{

    public Mammal() {
    }

    public Mammal(String name, int age) {
        super(name, age);
    }

    // 喂奶方法
    public abstract void nurse();
}
