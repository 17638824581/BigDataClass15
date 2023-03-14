package com.xty.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person bean = app.getBean(Person.class);

        System.out.println("bean = " + bean);

//
//        Dog dog = app.getBean(Dog.class);
//
//        dog.cry();

//        Person person = PersonFactory.getPerson();

    }
}
