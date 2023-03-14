package com.xty.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class PersonFactory {

    // 返回一个Person对象
    @Bean // Bean 注解作用：将这个方法的返回值放入  Spring 容器中
    public static Person getPerson(){
        System.out.println("工厂类构建了 Person 对象");
        Person person = new Person();
        person.setName("阿朱");
        return person;
    }
}
