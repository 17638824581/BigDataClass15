package com.xty.listener;

import com.xty.configration.SpringContextConfigration;
import com.xty.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ApplicatoinContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        // 当项目启动的时候，想要初始化 Spring 容器
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringContextConfigration.class);
        // 要将 Spring 容器对象 存入 ServletContext 域中
        ServletContext servletContext = servletContextEvent.getServletContext();
        servletContext.setAttribute("app",app);

        System.out.println("Spring 容器已装载至 ServletContext 域中");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("contextDestroyed() 方法被调用");
    }
}
