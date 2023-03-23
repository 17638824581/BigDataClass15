package com.xty.factory;

import com.xty.mapper.UserDao;
import com.xty.mapper.impl.UserDaoImpl;

public class UserDaoFactory {

    public UserDao getUserDao1(){
        System.out.println("工厂类非静态工厂方法，创建了一个 UserDao 对象！");
        return new UserDaoImpl();
    }

    public static UserDao getUserDao2(){
        System.out.println("工厂类静态工厂方法，创建了一个 UserDao 对象！");
        return new UserDaoImpl();
    }
}
