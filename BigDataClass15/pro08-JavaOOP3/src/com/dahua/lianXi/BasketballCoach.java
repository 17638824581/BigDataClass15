package com.dahua.lianXi;

/**
 * 篮球教练类
 * @author Mr.yu
 * @date 2022/10/27 17:11
 */
public class BasketballCoach extends Coach{

    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
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
        System.out.println("篮球教练"+super.getName()+"教篮球！");
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
        System.out.println("篮球教练吃鸡翅！");
    }
}
