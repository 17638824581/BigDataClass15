package com.dahua.guoqing;

// 求 66 和 39 的最小公倍数
public class T8 {

    public static void main(String[] args) {

        int a = 39;
        int b = 66;

        for (int i = 1; i <= 39 ; i++) {
            if ((b * i) % a == 0){
                System.out.println(b+"*"+i+"="+(b*i));
                System.out.println(a+"和"+b+"的最小公倍数为："+b*i);
                break;
            }
        }

    }
}
