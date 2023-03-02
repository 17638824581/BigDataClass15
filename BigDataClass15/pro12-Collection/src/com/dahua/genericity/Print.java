package com.dahua.genericity;

public interface Print<E> {

    // 打印元素
    void print(E e);

    // 换行打印元素
    void println(E e);
}
