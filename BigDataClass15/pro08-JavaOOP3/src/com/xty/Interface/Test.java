package com.xty.Interface;

import com.xty.poly.Animal;
import com.xty.poly.Pig;

public class Test {

    // 跳高比赛

    // 让动物跳起来的方法,接收一个动物对象，然后调用这个对象的 jump() 方法
    public static void jumpUp(Jump a){
        a.jump();
    }

    // 举办rap比赛
    public static void startRap(Rap r){
        r.rep();
    }


    public static void main(String[] args) {

        Person person = new Person("坤坤",18,"男");

        startRap(person);


//        Dog dog = new Dog("小黑",2,"黑色");
//        Pig pig = new Pig("佩奇",1,100);
//
//        jumpUp(dog);
//        jumpUp(pig);
    }
}
