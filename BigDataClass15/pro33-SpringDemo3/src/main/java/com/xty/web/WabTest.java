package com.xty.web;

import com.xty.configration.SpringContextConfigration;
import com.xty.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WabTest {

    public static void main(String[] args) {
        // 创建 Spring 容器 获取 UserService 对象 调用其业务方法
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringContextConfigration.class);

        UserService userService = app.getBean(UserService.class);

        userService.save();

    }
}
