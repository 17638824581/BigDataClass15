package com.dahua.lianXi;

/**
 * 教练类
 * @author Mr.yu
 * @date 2022/10/27 17:01
 */
public abstract class Coach extends Person {

    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    /**
     * 教学方法
     * @return void
     * @author Mr.yu
     * @date 2022/10/27 17:02
     */
    public abstract void teaching();
}
