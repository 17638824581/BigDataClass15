package com.xty.common;

public class CatTest {
    public static void main(String[] args) throws CloneNotSupportedException {


        // 创建 Cat 对象
        // hashCode ：哈希码，就是一串数字，通过一系列计算得出。
        //          哈希码是具有唯一性：同一个对象的 哈希码 是一致的。

        Cat c1 = new Cat("小黑", 2);


//        System.out.println("c1.hashCode() = " + c1.hashCode());
//        System.out.println("c2.hashCode() = " + c2.hashCode());


        System.out.println(c1);


    }
}
