package com.dahua.guoqing;


// 求 1~100 所有质数的和
public class T5 {
    public static void main(String[] args) {

        // sum 表示所有质数的和
        int sum = 0;

        // 找出 1~100 以内所有的质数
        for (int i = 2; i <= 100 ; i++) {

            // 定义一个布尔类型，代表 i 是不是质数
            boolean isAPrimeNumber = true;

            // 判断 i 是不是质数
            for (int j = 2; j < i; j++) {
                // 如果 i 能被 j 整除，则 i 不是质数
                if(i % j == 0){
                    // 不是质数，就把 isAPrimeNumber 置为 false
                    isAPrimeNumber = false;
                    break;
                }
            }

            // 判断 isAPrimeNumber 为 true，则代表 i 是质数，否则不是
            if (isAPrimeNumber == true){
                System.out.println(i+"是质数");
                sum+=i;
            }
        }

        System.out.println("1~100 所有质数的和为："+sum);
    }
}
