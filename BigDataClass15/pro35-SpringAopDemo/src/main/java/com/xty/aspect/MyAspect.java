package com.xty.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/*
*  切面类，内部方法封装了我们将要要执行的增强的代码
*  内部方法 封装了 通知
* */
public class MyAspect {

    private int count = 0;

    public void beforeAdvice(){
        System.out.println("执行前置增强的代码。。。。");
    }

    public void afterAdvice(){
        System.out.println("执行后置增强的代码....");
    }
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {

        System.out.println("执行环绕增强前置通知的代码....");

        // 调用目标方法
        Object proceed = pjp.proceed();

        System.out.println("执行环绕增强后置通知的代码....");

        return proceed;
    }

    public void excptionAdvice(){
        System.out.println("异常通知。。。");
    }


    public void countAdive(){
        count++;
        System.out.println("目标方法被执行了"+count+"次！");
    }
}
