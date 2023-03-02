package com.dahua.lianXi;

public class PingpongCoach extends Coach implements English{

    public PingpongCoach() {
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    /**
     * 教学方法
     *
     * @return void
     * @author Mr.yu
     * @date 2022/10/27 17:02
     */
    @Override
    public void teaching() {
        System.out.println("乒乓球教练教乒乓球");
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
        System.out.println("乒乓球教练学习英语");
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
        System.out.println("乒乓球教练喝鸡汤！");
    }
}
