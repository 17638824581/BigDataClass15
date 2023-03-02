package com.dahua.lianXi;

/**
 * 运动员类
 * @author Mr.yu
 * @date 2022/10/27 16:57
 */
public abstract class Sportsman extends Person{

    public Sportsman() {
    }

    public Sportsman(String name, int age) {
        super(name, age);
    }

    /**
     * 学习方法
     * @return void
     * @author Mr.yu
     * @date 2022/10/27 16:58
     */
    public abstract void study();
}
