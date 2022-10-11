package com.dahua.guoqing;

// 求 ： 10!+9!+8!+....+1!
public class T4 {

    public static void main(String[] args) {
        // 保存所有阶乘的和
        int sum = 0;

        for (int j = 1; j <= 10 ; j++) {
            // 求 j! 的阶乘
            int a = 1;
            for (int i = 1; i <= j ; i++) {
                a*=i;
            }

            System.out.println(j+"!="+a);
            // 把 j! 的结果 加到 sum 中
            sum += a;
        }

        System.out.println("10!+9!+8!+....+1!="+sum);
    }
}
