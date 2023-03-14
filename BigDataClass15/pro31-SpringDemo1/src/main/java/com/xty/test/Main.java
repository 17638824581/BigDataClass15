package com.xty.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // 类路径下的 配置文件
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 系统文件下的 配置文件
//        ApplicationContext app = new FileSystemXmlApplicationContext("D:\\applicationContext.xml");

//        Dog dog = (Dog) app.getBean("dog");
        Dog bean = app.getBean(Dog.class);

        bean.cry();

    }
}
