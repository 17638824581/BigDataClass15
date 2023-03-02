package com.dahua.FinalAndStatic;

public class Test {

    // 在类中去写方法
    // 在类中定义好方法
    public static int add(int a, int b){
        return a+b;
    }


    public static void main(String[] args) {
//        System.out.println("Cat.name = " + Cat.name);
//        // 修改类属性
//        Cat.name = "大猫";
//        System.out.println("Cat.name = " + Cat.name);

        new Cat().say();
        new Cat2();


        // static 关键字，静态
        // 用在方法上，方法就会变为静态方法（类方法），静态方法可以直接通过类名使用。
        // 用在变量上，变量就是编程静态变量（类变量），静态变量也可以直接通过类名使用。

        // 没有 static 关键字，非静态
        // 方法没有 static 关键字，就是非静态方法（成员方法），成员方法必须通过类的对象使用。
        // 变量没有 staitc 关键字，就是非静态变量（成员变量），成员变量也必须通过类的对象使用。


        // 实验：成员变量和类变量的区别

        // 1. 访问不一样
//        System.out.println("new Cat().name = " + new Cat().name);
//        System.out.println("Cat.name2 = " + Cat.name2);

        // 2. 属性归属不一样
//        Cat c1 = new Cat();
//        Cat c2 = new Cat();
//
//        // 成员变量，是属于对象自己的
//        c1.name = "小黑";
//        System.out.println("c1.name = " + c1.name);
//        System.out.println("c2.name = " + c2.name);
//
//        // 类变量，是属于类的，成员也可以访问。
//        c1.name2 = "小黑";
//        System.out.println("c1.name2 = " + c1.name2);
//        System.out.println("c2.name2 = " + c2.name2);

        // 类变量是属于类的，所有的类对象所共享的，类的对象也可以访问。


        // 什么时候 加 static ，什么时候不加 staitc
        // 看这个变量，或方法，是否有必要存到对象中。

//        Cat cat = new Cat("小花");
//        cat.eat("鱼");
//
//        Cat cat2 = new Cat("小白");
//        cat2.eat("鱼");

    }
}
