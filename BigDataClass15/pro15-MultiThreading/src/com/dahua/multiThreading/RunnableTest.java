package com.dahua.multiThreading;

import java.util.concurrent.locks.ReentrantLock;

public class RunnableTest {

    // 电影票数量
    private static int aMovieTicket = 100;

    // 表示实际卖出去的票数
    private static int nums = 0;

    // 创建一把新锁
    private  static ReentrantLock rl = new ReentrantLock();

    // 写一个方法，执行一次方法，就卖出一张票
    // 返回剩余还有没有票，如果返回true，则表示剩余还有票
    public static boolean theTicket() {
        // 在非静态同步方法中，依据的同步对象是  this
        //  在静态同步方法中，依据的同步对象是 这个类，是这个类的  类名.class 对象。
        //  同一个类，获取到的 .class 对象是相同的。
        rl.lock();
        try {
            if (aMovieTicket > 0) {
                System.out.println(Thread.currentThread().getName() + "售出第" + aMovieTicket + "张票");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                aMovieTicket--;
                nums++;
            }
        }finally {
            rl.unlock();
        }

        // 根据剩余票数返回结果
        return aMovieTicket > 0;
    }


    public static void main(String[] args) throws InterruptedException {

        // 创建三个线程，表示三个售票窗口，同时售票
        new Thread(() -> {
            // 写这个线程要做的事情
            boolean b = true;
            while (b) {
                b = theTicket();
            }
            System.out.println(Thread.currentThread().getName() + "票已售空！");
        }, "1号窗口").start();

        new Thread(() -> {
            // 写这个线程要做的事情
            boolean b = true;
            while (b) {
                b = theTicket();
            }
            System.out.println(Thread.currentThread().getName() + "票已售空！");
        }, "2号窗口").start();


        // 主线程休眠2秒
        Thread.sleep(2000);

        System.out.println("总共卖出" + nums + "张票。");

        // 处理线程安全问题，可以使用 synchronized 关键字，来规定出同步代码块
        //  同步代码块 指的是，在同一时刻只能够有一个线程能够运行这个代码块。
        //  其他线程也要运行这个代码块的话，需要等待正在运行的线程，

    }
}
