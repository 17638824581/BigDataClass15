package com.xty.web;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class FormServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    // 用于处理 GET 请求的方法
    public void doGet(){
        System.out.println("处理GET请求。。。。");
    }

    // 用于处理 POST 请求的方法
    public void doPost(){
        System.out.println("处理POST请求。。。。");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        // 接收到请求了，这个请求是什么请求？ GET 还是 POST 请求？
        // 我们可以使用 HttpServletRequset 类来获取究竟是 GET 还是 POST 请求

        // 将 ServletRequest 对象强转为 HttpServletRequest 对象
        HttpServletRequest hsr = (HttpServletRequest) servletRequest;

        // 通过 HttpServletRequest 对象的 getMethod() 方法可以获取到 用户的请求方式
        String method = hsr.getMethod();

        // 我们可以对 不同的请求方式 做出不同的处理

        // GET 请求一般是，客户端想要服务器回传一些数据
        // POST 请求一般是，客户端要给服务器上传一些数据
        if (method.equals("GET")){
            System.out.println("接收到 GET 请求");
            doGet();
        }else if(method.equals("POST")){
            System.out.println("接收到 POST 请求");
            doPost();
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
