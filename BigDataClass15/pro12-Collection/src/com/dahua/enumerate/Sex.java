package com.dahua.enumerate;

/**
 * 通过这个类的对象来表示一个性别值
 * @author Mr.yu
 * @date 2022/11/10 10:52
 */

// 希望限制外部不能创建 Sex 对象
public enum Sex {
    MAN("男生"),WOMAN("女生");

    String name;

    private Sex(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
