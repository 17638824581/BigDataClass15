package com.dahua.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 用于验证手机号的Servlet
 * @author Mr.yu
 * @date 2023/2/20 10:11
 */
public class VerifyNumberServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 取出 req 携带的手机号参数
        String number = req.getParameter("number");

        // 验证 手机号的 业务。。。。
        if (number.equals("123456")){

            // 如果验证通过，则继续验证 邮箱号
            System.out.println("您的手机号验证已通过!");
            // 给 requset 域中做成功的标记
            req.setAttribute("status","1");

            // 将 请求转发 至 验证邮箱号的 Servlet 中
            req.getRequestDispatcher("/verifyEmail").forward(req,resp);
        }else{
            // 如果验证不通过，则业务失败
            System.out.println("手机号未验证通过！");
        }
    }
}
