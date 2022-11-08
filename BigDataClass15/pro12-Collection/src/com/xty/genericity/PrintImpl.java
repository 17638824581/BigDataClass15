package com.xty.genericity;

public class PrintImpl<E> implements Print<E>{
    @Override
    public void print(E e) {
        System.out.print(e);
    }

    @Override
    public void println(E e) {
        System.out.println(e);
    }
}
