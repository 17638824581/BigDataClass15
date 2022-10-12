package com.xty.classAndObject;

public class Main {
    public static void main(String[] args) {
        // Dog 是类名
        // eat() 是Dog类中的方法
        // Dog.eat() 是Dog类调用eat()方法。

        // static 表示静态，当给方法加上 static 之后，
        // 这个方法就是静态方法，静态方法可直接通过 类名.方法名() 调用。


        // 类通常不能直接使用。
        // 而是通过类 创建 对象。

        // 希望创建对象的时候，能够指定初始值

        // 类没有构造方法时，可以不给参数构造
        // 当类有了带参数的构造方法时，必须给参

//        Cat cat = new Cat("小花",2,"三花色");
//
//        cat.cry();
//        cat.eat("鱼");

        // 自己写的类，属于引用类型的变量（存的都是内存地址）
        Student s1 = new Student("张三丰", 88);
        Student s2 = new Student("张无忌", 35);

        Student s3 = s1;
        s1.name = "张翠山";

        s3.study();
    }
}
