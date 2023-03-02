package com.dahua.lianXi;


/**
 * 乒乓球运动员类
 * @author Mr.yu
 * @date 2022/10/27 17:09
 */
public class PingpongPlayer extends Sportsman implements English {

    public PingpongPlayer() {
    }

    public PingpongPlayer(String name, int age) {
        super(name, age);
    }

    /**
     * 学习英语的方法
     *
     * @return void
     * @author Mr.yu
     * @date 2022/10/27 17:04
     */
    @Override
    public void studyEnglish() {
        System.out.println("乒乓球运动员学习英语！");
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
        System.out.println("乒乓球运动员吃鸡蛋！");
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
        System.out.println("乒乓球运动员学乒乓球！");
    }
}
