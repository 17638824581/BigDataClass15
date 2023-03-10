package com.xty.web;

import com.xty.service.UserService;
import com.xty.service.impl.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
*  假设的 Web 层
*
* */
public class UserServlet {
    public static void main(String[] args) {
        // 假设接收到添加用户的请求

        // 需要调用 Service 层的  addUser() 方法
//        UserService userService = new UserServiceImpl();

        // 通过 Spring 容器获取 userService
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = (UserService) app.getBean("userService");

        userService.addUser();

        userService.deleteUser();

        userService.updateUser();

        userService.selectUser();
    }
}
