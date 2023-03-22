package com.xty.aspect;


import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/*
*  自定义的切面类
* */
@Aspect
@Component
public class MyAspect {

    // 让方法承载切点表达式
    @Pointcut("execution(* com.xty.service.UserService.*(..))")
    public void myPointcut(){}


    // 通知/增强
    @Before("myPointcut()")
    public void beforeAdvise(){
        System.out.println("执行了前置通知");
    }

    @AfterReturning("myPointcut()")
    public void afterReturningAdvise(){
        System.out.println("执行了后置通知");
    }

    @After("myPointcut()")
    public void afterAdvise(){
        System.out.println("执行了最终通知");
    }

}
