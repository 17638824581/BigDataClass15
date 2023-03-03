package com.dahua.web;

import com.alibaba.fastjson.JSON;
import com.dahua.bean.Book;
import com.dahua.bean.BookCondition;
import com.dahua.bean.LimitBook;
import com.dahua.service.BookService;
import com.dahua.service.impl.BookServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectByCondition")
public class SelectByConditionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/json; charset=utf-8");

        // 从请求体中，获取请求参数
        String json = request.getReader().readLine();

        // 使用 FastJSON 将  json 字符串转为 对象
        BookCondition bookCondition = JSON.parseObject(json, BookCondition.class);
        System.out.println(json);
        System.out.println(bookCondition);

        BookService bookService = new BookServiceImpl();

        LimitBook limitBook = bookService.selectByConditionAndLimit(bookCondition);

        String jsonString = JSON.toJSONString(limitBook);

        response.getWriter().write(jsonString);
    }
}
