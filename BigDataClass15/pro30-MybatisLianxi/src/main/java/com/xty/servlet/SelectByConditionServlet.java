package com.xty.servlet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xty.pojo.BookCondition;
import com.xty.pojo.LimitBook;
import com.xty.service.BookService;
import com.xty.service.impl.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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

        // 从 Json 字符串中提取 currentPage 和 pageSize 参数
        JSONObject parse = (JSONObject) JSON.parse(json);

        int currentPage = (int) parse.get("currentPage");
        int pageSize = (int) parse.get("pageSize");

        // 计算分页的参数
        int begin = (currentPage - 1) * pageSize;
        int size = pageSize;

        // 将分页参数添加至 条件对象中
        bookCondition.setBegin(begin);
        bookCondition.setSize(size);

        BookService bookService = new BookServiceImpl();

        LimitBook limitBook = bookService.selectByConditionAndLimit(bookCondition);

        String jsonString = JSON.toJSONString(limitBook);

        response.getWriter().write(jsonString);
    }
}
