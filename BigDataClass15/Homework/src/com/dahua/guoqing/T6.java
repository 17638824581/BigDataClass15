package com.dahua.guoqing;


// 百钱买百鸡
public class T6 {
    public static void main(String[] args) {

        // i 表示买多少只 公鸡
        for (int i = 0; i <= 20 ; i++) {
            // j 表示买多少只 母鸡
            for (int j = 0; j <= (100 - i*5)/3; j++) {
                // k 表示买多少只 小鸡
                for (int k = 0; k <= (100- i*5 -j*3)*3 ; k+=3) {

                    if (i+j+k == 100 && i*5+j*3+k/3 == 100){
                        System.out.println("买公鸡"+i+"只，买母鸡"+j+"只，买小鸡"+k+"只");
                    }
                }
            }
        }
    }
}
