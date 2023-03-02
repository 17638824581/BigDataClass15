package com.dahua.Abstract;

public class FactoryTest {

    // 让工厂生产产品的方法
    public static void startWorking(Factory f){
        f.production();
    }

    // 测试工厂类
    public static void main(String[] args) {
        ShoesFactory sf = new ShoesFactory();
        CarFactory cf = new CarFactory();

        startWorking(sf);
        startWorking(cf);

    }
}
