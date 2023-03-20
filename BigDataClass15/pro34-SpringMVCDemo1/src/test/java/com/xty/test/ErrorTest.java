package com.xty.test;

import org.junit.Test;

public class ErrorTest {
    @Test
    public void test1(){
        System.out.println(1/0);
    }

    @Test
    public void test2() throws ClassNotFoundException {
        Class.forName("com.xty.dao.UserDaaaaa");
    }
}
