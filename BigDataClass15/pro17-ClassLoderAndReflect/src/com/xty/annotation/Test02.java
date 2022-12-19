package com.xty.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

public class Test02 {
    // 为test()方法使用注解，并给出参数值
    @MyAnnotation(name="阿呆")
    public static void test(){
    }

    // 在主方法中，使用反射机制获取方法test()注解的值
    public static void main(String[] args) throws NoSuchMethodException {
        // 通过方法名获取方法对象
        Method test = Test02.class.getDeclaredMethod("test");
        // 通过方法对象获取方法的注解
        MyAnnotation an = test.getDeclaredAnnotation(MyAnnotation.class);
        // 获取注解对象的 name 属性值
        String name = an.name();
        System.out.println("MyAnnotation注解的值："+ name);
    }

}

// 自定义注解，注解中只有一个值
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
    String name() default "小明";
}

