package com.xty.encapsulation;

public class Main {
    public static void main(String[] args) {

        // 通过 Phone 类创建 出对应的 对象
        Phone mi = new Phone("小米", 3299, "小米12Pro", 6.25);

        mi.call("110");

        mi.sendMessage("123456","你好！");


    }
}
