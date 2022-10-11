package com.dahua.guoqing;

// 1、2、3、4 能组成多少个互补重复的数字
public class T1 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 ; j++) {
                for (int k = 1; k <= 4 ; k++) {
                    // i 代表百位数
                    // j 代表十位数
                    // k 代表个位数

                    // 要寻找的是 i 、j、k 都不一样的数
                    if(i!=j && j!=k && i!=k){
                        count ++;
                    }
                }
            }
        }

        System.out.println("总共有:"+count+"个互不重复的数字");
    }
}
