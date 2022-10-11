package com.dahua.guoqing;


// 找出 39 和 66 的最大公约数
public class T9 {

    public static void main(String[] args) {

        int a = 99;
        int b = 66;

        for (int i = 1; i <= a; i++) {

            // 判断 a /i 得到的不是整数
            if(a%i != 0){
                continue;
            }

            // 表示a的约数
            int c = a / i;

            // 如果 b 能够整除 c
            if(b % c == 0){
                System.out.println(c+"是"+a+"和"+b+"的最大公约数");
                break;
            }
        }
    }
}
