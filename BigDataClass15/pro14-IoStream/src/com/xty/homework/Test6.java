package com.xty.homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

// 通过Properties永久限制游戏次数
public class Test6 {
    public static void main(String[] args) throws IOException {
        game();
    }

    // 猜数字小游戏
    public static void game() throws IOException {
        // 判断用户有没有试玩次数了！
        Properties p = new Properties();
        p.load(new FileReader("F:\\Code\\Java\\git\\BigDataClass15\\BigDataClass15\\pro14-IoStream\\itgeek\\game.properties"));

        int count = Integer.parseInt(p.getProperty("count"));

        if (count > 0){

            System.out.println("正在试玩，剩余次数："+count);

            int num = new Random().nextInt(101);
            Scanner sc = new Scanner(System.in);
            for (int i = 1; i <= 5; i++) {
                System.out.println("第"+i+"次猜测，请输入您猜的数字：");
                int input = sc.nextInt();
                if (input>num){
                    System.out.println("猜大了！");
                }else if(input < num){
                    System.out.println("猜小了！");
                }else{
                    System.out.println("猜对了！");
                    break;
                }

                if (i==5){
                    System.out.println("游戏结束！正确答案是："+num);
                }
            }

            count--;
            p.setProperty("count",String.valueOf(count));
            p.store(new FileWriter("F:\\Code\\Java\\git\\BigDataClass15\\BigDataClass15\\pro14-IoStream\\itgeek\\game.properties"),"新游戏次数");
        }else{
            System.out.println("您的试玩次数以用完，请充值！");
        }
    }
}
