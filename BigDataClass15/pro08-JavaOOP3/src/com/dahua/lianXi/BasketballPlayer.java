package com.dahua.lianXi;

/**
 * 篮球运动员类
 * @author Mr.yu
 * @date 2022/10/27 17:06
 */
public class BasketballPlayer extends Sportsman{

    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    /**
     * 吃饭
     *
     * @return void
     * @author Mr.yu
     * @date 2022/10/27 16:59
     */
    @Override
    public void eat() {
        System.out.println("篮球运动员吃鸡腿！");
    }

    /**
     * 学习方法
     *
     * @return void
     * @author Mr.yu
     * @date 2022/10/27 16:58
     */
    @Override
    public void study() {
        System.out.println("篮球运动员学篮球！");
    }
}
