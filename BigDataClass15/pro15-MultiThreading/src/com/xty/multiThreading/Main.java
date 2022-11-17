package com.xty.multiThreading;

import java.util.Scanner;

/*
 * 主类
 * @author Mr.yu
 * @date 2022/11/17 14:41
 */
public class Main {
    // 内部类，让内部类继承 Thread 类
    public static class MyThread1 extends Thread{
        @Override
        public void run() {

            // run() 方法内部就是线程要执行的任务。
            for (int j = 0; j < 100; j++) {
                System.out.println(getName()+" :  "+j);
                if (j==50){
                    System.out.println(getName()+"执行了join()");
                }
            }

        }
    }

    public static class MyThread2 extends Thread{
        @Override
        public void run() {
            // run() 方法内部就是线程要执行的任务。
            for (int j = 0; j < 100; j++) {
                System.out.println(getName()+" :  "+j);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // 单线程：只有一个main方法，执行main方法中的代码的线程，我们称为 主线程
        // 如果一个程序只有单线程，那么当主线程阻塞了。整个程序都会卡住，

        // 多线程有什么优势？
        // 多线程能够充分利用计算机的CPU中的多个核心，将会对程序的性能带来成倍的提升。

        // 如何实现多线程？
        // 1. 创建一个类，让这个类继承 Thread 类，重写Thread中的 run() 方法，ran() 方法中的代码，就是线程所要执行的任务。
        // 通过线程类，创建出来线程对象。 一个线程对象 就是 一个线程

        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();

        // 设置两个线程名称
        thread1.setName("线程1");
        thread2.setName("线程2");

        //
        thread1.setPriority(10);
        thread2.setPriority(1);

        thread1.setDaemon(true);
        thread2.setDaemon(true);

        // 创建出来两个线程之后，调用它们的 start()方法来启动线程。
        thread1.start();
        thread2.start();

        // 两个线程并行执行，就会造成一个问题：先运行谁？
        // 两个线程在争取 CPU 的执行时间片段

        Thread thread = Thread.currentThread();
        thread.setDaemon(true);

        while (true){
            System.out.println(Thread.currentThread().getName());
        }

        // 我希望主线程能够等一等两个子线程。
        // 等到两个子线程执行结束了，再打印 i
        //  可以使用 Thread.sleep() 方法让本线程休眠指定的 毫秒数


        // 如何查看当前这个时刻正在运行的线程是哪个线程？
        // Thread.currentThread() 方法可以获取当前正在运行的线程。
    }
}
