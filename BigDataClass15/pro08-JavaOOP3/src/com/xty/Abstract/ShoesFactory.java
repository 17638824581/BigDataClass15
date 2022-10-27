package com.xty.Abstract;

// 鞋子厂
public class ShoesFactory extends Factory{
    @Override
    public void production() {
        System.out.println("鞋子厂生产出鞋子！");
    }
}
