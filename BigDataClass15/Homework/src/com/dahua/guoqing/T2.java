package com.dahua.guoqing;

// 输入一批数字，找出其中的最大值 和 最小值
import java.util.Scanner;

public class T2 {

    public static void main(String[] args) {

        // 使用Scanner接收用户输入
        // [alt + enter] 键，智能键
        Scanner sc = new Scanner(System.in);

        // 存储最大值
        int max;
        // 存储最小值
        int min;

        // 先让用户输入一次整数
        // 接收一个整数输入
        System.out.println("请您输入一个整数：");
        max = sc.nextInt();
        min = max;

        while (true){
            // 接收一个整数输入
            System.out.println("请您输入一个整数（输入0退出）：");
            int i = sc.nextInt();

            // 如果输入了0，就结束循环
            if (i==0){
                break;
            }

            // 如果输入的数，比max还大，就让max存储这个数
            if (max < i){
                max = i;
            }

            // 如果输入的数，比min还小，就让min存储这个数
            if (min > i){
                min = i;
            }

            System.out.println("您输入了："+i);
        }

        // 打印最大值和最小值
        System.out.println("最大值是："+max);
        System.out.println("最小值是："+min);
    }
}
