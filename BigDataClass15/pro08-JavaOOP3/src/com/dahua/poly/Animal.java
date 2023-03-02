package com.dahua.poly;

// 动物类
// 在现实生活中，不存在一个具体的 动物对象。
// 动物只是一个抽象的统称。
// 我们并不直接使用 Animal 类，我们只是通过其它类来继承这个类中的内容。
// 我们也不会，而且也不应该创建 Animal 类的对象。
// 抽象类
//  如果定义一个类为抽象类，那么这个类就无法直接被创建对象，但可以被继承

// 抽象方法
//  抽象方法，只能写在，抽象类或接口中。只有方法头，没有方法体的方法。

public abstract class Animal {
    public String name;
    public int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat(String food);

    // 抽象方法: 叫 的方法！
    public abstract void crow();
}