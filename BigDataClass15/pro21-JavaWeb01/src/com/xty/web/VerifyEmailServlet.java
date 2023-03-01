package com.xty.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 用于验证邮箱号的 Servlet
 * @author Mr.yu
 * @date 2023/2/20 10:10
 */
public class VerifyEmailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 先看 用户有没有完成验证手机号？
        if (req.getAttribute("status") == "1"){

            // 说明手机号验证成功
            // 继续处理 验证 Eamil 的业务
            String email = req.getParameter("email");

            // 验证邮箱。。
            if (email.equals("123456@qq.com")){
                System.out.println("邮箱号验证通过！");

                // 注册用户....
                System.out.println("用户注册成功！");

            }else{
                System.out.println("邮箱号验证失败！注册失败！");
            }
        }else{
            // 说明用户没有验证手机号
            System.out.println("您暂未验证手机号，请先验证手机号！");
        }
    }
}
