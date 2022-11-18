package com.xty.multiThreading;

public class ThreadSafeClass {

    private static StringBuffer sb = new StringBuffer("abcdefghijklmnopqrstuvwxyz");


    public static void main(String[] args) throws InterruptedException {
        // 线程安全类： 在多线程操作同一个容器的时候，这些线程的类，能够保证，内部数据的安全性。
        //  1. StringBuffer ->  线程安全的可变字符串
        //      StringBuilder ->  不保证线程安全的可变字符串
        //  2. Vector  ->       线程安全的List集合
        //  3. Hashtable  ->    线程安全的 Map 集合





    }
}
