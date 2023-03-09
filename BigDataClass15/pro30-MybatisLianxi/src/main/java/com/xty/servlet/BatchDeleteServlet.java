package com.xty.servlet;

import com.alibaba.fastjson.JSON;
import com.xty.service.BookService;
import com.xty.service.impl.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/batchDelete")
public class BatchDeleteServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 接收要删除的 ids 数组
        String json = request.getReader().readLine();
        // 2. 将 json 格式的数组，转为 int 型数组
        int[] ids = JSON.parseObject(json, int[].class);
        // 3. 调用 BookService 的 batchDelete 方法来实现批量删除
        BookService bookService = new BookServiceImpl();
        int i = bookService.batchDelete(ids);
        // 4. 返回真正被删除的数据条目数
        response.getWriter().write(String.valueOf(i));
    }
}
