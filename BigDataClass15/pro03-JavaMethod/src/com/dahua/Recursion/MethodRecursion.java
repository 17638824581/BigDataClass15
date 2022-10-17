package com.dahua.Recursion;

public class MethodRecursion {

    public static int eatPeach(int day,int peachNum){
        // 当桃子就剩一个了，就停下来
        if (peachNum == 1){
            return day;
        }

        // 首先吃一半桃子
        peachNum /= 2;
        // 然后再吃一个
        peachNum -= 1;

        // 接着下一天继续吃
        int nextDay = eatPeach(day+1,peachNum);

        return nextDay;
    }

    public static void main(String[] args) {
        // 递归（递进，递归）
        // 不写循环
        // 打印 1 ~ 100

        // 递归可以一定程度上替代循环。
        // 每递进一层，都需要在栈内存中存储一遍这个方法，会极大的占用内存空间

        int day = eatPeach(1,100);
        System.out.println(day);
    }

}
