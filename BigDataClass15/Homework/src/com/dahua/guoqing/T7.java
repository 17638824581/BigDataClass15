package com.dahua.guoqing;


// 猴子吃桃
//   每天都吃前一天剩下的一半+1个，第九天吃完之后剩 1 个，求第一天总共几个
public class T7 {

    public static void main(String[] args) {

        // 第九天吃完之后剩余的
        int numberOfPeach = 1;

        // 计算第一天吃完后剩余的
        for (int i = 0; i < 8; i++) {
            numberOfPeach = (numberOfPeach + 1) * 2;
        }

        System.out.println("第一天吃完后剩余的桃子数量:"+numberOfPeach);
        System.out.println("第一天刚开始的桃子数量:"+(numberOfPeach+1)*2);

    }
}
