package com.xty.test;

public class Dog {
    private String name;

    public Dog(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void cry(){
        System.out.println(name+"：汪汪汪");
    }
}
