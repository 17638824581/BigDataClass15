package com.dahua.exception;

public class CarTest {

    public static void guoqiao(Car c){
        if (c.getWeight() > 5000){
//            System.out.println("车辆超重，无法通过！");
            // 使用 throw 主动抛错误
            throw new OverloadException("车辆超重，无法通过！");
        }else{
            System.out.println("车辆可以通行");
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car("擎天柱", 5000);
        Car c2 = new Car("大黄蜂", 3000);
        Car c3 = new Car("急先锋", 6000);

        guoqiao(c1);
        guoqiao(c2);
        guoqiao(c3);

        System.out.println("正常结束程序！");

    }
}
