package com.xty.multiThreading;

import java.awt.*;
import java.util.ArrayList;

public class RunnableTest {


    // 使用 num 变量表示整个电影院电影票的数量
    private static ArrayList<String> al = new ArrayList<>();

    private static int count = 0;

    // 写一个买票窗口类
    public static class Window implements Runnable{
        @Override
        public void run() {
            // 若我们想要限制某些代码，同一时刻只能有一个线程执行
            // 就可以使用 synchronized 关键字来设置 同步代码块
            //  在 synchronized 代码块的后面的小括号中，需要指定一个对象。
            //  让所有的线程在执行到这个代码块的时候，根据al对象来同步。
            while (true){
                synchronized(al){
                    // 在大括号中放置需要同步的代码块
                    // 1. 先判断有没有票
                    // 卖出去了一张票
                    if (al.size()>0){
                        al.remove(0);
                        count++;
                    }else{
                        break;
                    }
                    // 3. 打印信息
                    System.out.println(Thread.currentThread().getName()+"卖出一张票，剩余："+al.size());
                }
            }
            System.out.println(Thread.currentThread().getName()+"买票完毕，关闭窗口");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // 给 al 中填充 1000 张票
        for (int i = 0; i < 1000; i++) {
            al.add("电影票");
        }



        // 实现 Runnable 接口，是创建多线程的另一种方法

        // 使用匿名内部类，来实现 Runnable 接口
        // 通过 new Thread() 传入一个 Runnalbe 接口的实现类，即可快速创建出一个线程对象。
        // 创建一个买票窗口
        Window window1 = new Window();
        // 启动一个线程开始卖票
        Thread thread1 = new Thread(window1);
        thread1.setName("1号窗口");
        thread1.start();

        // 创建一个买票窗口
        Window window2 = new Window();
        // 启动一个线程开始卖票
        Thread thread2 = new Thread(window2);
        thread2.setName("2号窗口");
        thread2.start();

        // 创建一个买票窗口
        Window window3 = new Window();
        // 启动一个线程开始卖票
        Thread thread3 = new Thread(window3);
        thread3.setName("3号窗口");
        thread3.start();

        // 创建一个买票窗口
        Window window4= new Window();
        // 启动一个线程开始卖票
        Thread thread4 = new Thread(window4);
        thread4.setName("4号窗口");
        thread4.start();

        // 创建一个买票窗口
        Window window5 = new Window();
        // 启动一个线程开始卖票
        Thread thread5 = new Thread(window5);
        thread5.setName("5号窗口");
        thread5.start();

        Thread.sleep(1000);
        System.out.println(count);



    }
}
