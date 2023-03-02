package com.dahua.exception;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字小游戏（处理异常）
 * @author Mr.yu
 * @date 2022/11/2 17:19
 */
public class BullsAndCows {
    public static void startGame(){

        Random random = new Random();
        int num = random.nextInt(101);
        Scanner scanner = new Scanner(System.in);

        for (int j = 0; j < 5; j++) {
            System.out.println("请输入您猜到的数字（0~100）之间：");
            int i = -1;

            try{
                i = scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("请输入整数！");
                scanner.next();
                j--;
                continue;
            }

            if (i == num){
                System.out.println("猜对了！");
                return;
            }else if(i > num){
                System.out.println("猜大了！");
            }else if(i < num){
                System.out.println("猜小了！");
            }
        }

        System.out.println("你太笨了！正确答案是："+num);
    }


    public static void main(String[] args) {
        startGame();
    }
}
