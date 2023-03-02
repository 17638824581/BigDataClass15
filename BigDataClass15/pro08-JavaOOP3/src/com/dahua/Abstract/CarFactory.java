package com.dahua.Abstract;

// 汽车厂
public class CarFactory extends Factory{
    @Override
    public void production() {
        System.out.println("汽车厂生产出来小汽车！");
    }
}
