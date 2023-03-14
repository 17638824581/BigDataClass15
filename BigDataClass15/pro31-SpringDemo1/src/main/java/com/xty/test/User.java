package com.xty.test;

public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    private Dog dog;

    public void speak(){
        System.out.println("我叫："+name);
        System.out.println("我的狗子叫："+dog.getName());
    }
}
