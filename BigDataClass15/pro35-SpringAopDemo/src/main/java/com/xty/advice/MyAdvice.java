package com.xty.advice;

/*
*  增强/通知，类
* */
public class MyAdvice {

    public void before(){
        System.out.println("执行前置增强的代码。。。。");
    }

    public void after(){
        System.out.println("执行后置增强的代码....");
    }

}
