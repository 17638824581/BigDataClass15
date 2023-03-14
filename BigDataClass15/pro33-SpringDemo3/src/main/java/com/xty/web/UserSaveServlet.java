package com.xty.web;

import com.xty.configration.SpringContextConfigration;
import com.xty.service.UserService;
import com.xty.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/save")
public class UserSaveServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 找 ServletContext 域 获取 Spring 容器
        ServletContext servletContext = request.getServletContext();
        ApplicationContext app = (ApplicationContext) servletContext.getAttribute("app");

        // 再从Spring容器中获取 UserService 对象
        UserService userService = app.getBean(UserService.class);

        // 执行对应的业务方法
        userService.save();

        // 返回结果给客户端
        response.getWriter().write("save success");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
