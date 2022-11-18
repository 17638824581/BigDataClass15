package com.xty.multiThreading;

import java.util.Vector;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 蛋糕店的一个生产者、消费者模型
 *
 * @author Mr.yu
 * @date 2022/11/18 10:55
 */
public class CakeStore {

    // Vector 相当于蛋糕店中的蛋糕柜
    private static Vector<String> v = new Vector<>();


    // 买蛋糕
    public synchronized void getCake() {
        // 蛋糕不多，先唤醒厨师
        if (v.size() < 10) {
            System.out.println("顾客：蛋糕剩余不多了，叫厨师来做。");
            // 唤醒所有正在等待的线程
            notifyAll();
        }

        // 如果有蛋糕，就买一块
        if (v.size() > 0) {
            System.out.println("顾客：买了一块蛋糕，蛋糕还有" + v.size() + "个");
            v.remove(0);
        } else {
            System.out.println("顾客：没蛋糕了,等厨师来做吧！");
            // 没蛋糕，就等着，等厨师做
            try {
                wait();// 让当前线程进行等待，等到被唤醒
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // 做蛋糕
    public synchronized void putCake() {
        // 如果 蛋糕数量不够50个，就做
        if (v.size() < 50) {
            v.add("巧克力蛋糕");
            System.out.println("厨师：做了一块蛋糕，蛋糕还有：" + v.size() + "个");
        } else {
            System.out.println("厨师：蛋糕够多了，让顾客来买。");
            // 唤醒所有正在等待的线程
            notifyAll();
            // 让当前厨师线程进行等待，等待到被其他其他线程唤醒。
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public static void main(String[] args) {
        // 先让厨师做，做的够多了 50 。再通知顾客来买，之后让厨师休息。

        // 顾客来买时候，如果剩余 10 不多了，通知厨师赶紧做。

        // 要使用 Object 类的 wait()、notify()、notifyAll() ，需要保证，只能在 synchronized 代码块中，或在它所修饰的同步方法中使用。

        CakeStore cs = new CakeStore();

        // 写一个生产者的线程，不停的生产蛋糕，存到 v 中。
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                cs.putCake();
            }
        }).start();

        // 写一个生产者的线程，不停的生产蛋糕，存到 v 中。
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                cs.putCake();
            }
        }).start();

        // 写一个消费者的线程，一只不停的买蛋糕，
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                cs.getCake();
            }
        }).start();

        // 写一个消费者的线程，一只不停的买蛋糕，
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                cs.getCake();
            }
        }).start();

    }
}
