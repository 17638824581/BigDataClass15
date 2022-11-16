package com.xty.functionalInterface;

@FunctionalInterface
public interface Eat {

    // 接口中只定义抽象方法
    void eat(Person p, String food);

}
