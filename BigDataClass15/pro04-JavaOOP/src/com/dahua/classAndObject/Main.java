package com.dahua.classAndObject;

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
        Dog dog1 = new Dog("小黑",2,"公","黑色","哈士奇");
        Dog dog2 = new Dog("小白",1,"母","白色","萨摩耶");


        System.out.println(dog1.getName());
        System.out.println(dog2.getName());


        // 当类中属性私有了，外部就访问不到了。
        // 可以通过 方法 间接传递属性值。防止 name 被篡改
        // getName() 这个方法，保护属性只能读取，不能修改。


        // 只能获取属性却不能改属性，
        // 怎么改属性？
        // 能不能通过方法间接去修改指定的属性值



    }
}
