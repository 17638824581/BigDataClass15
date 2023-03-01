package com.xty.web;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
*
*  用于处理下载请求
* */
@WebServlet("/download")
public class DownloadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 给用户返回的文件路径
        // 1. 接受请求，获取请求参数，通过参数获取用户想要下载的资源名称
        // 2. 准备资源
        String img_path = "F:\\Desktop\\文件上传.mp4";

        // 3. 设置响应头，描述文件类型，以及告诉客户端浏览器数据是用于下载的

        // 设置文件类型
        String mimeType = req.getServletContext().getMimeType(img_path);
        System.out.println("mimeType = " + mimeType);
        resp.setContentType(mimeType);

        // 设置告诉浏览器用于下载
        resp.setHeader("Content-Disposition","attachment; filename=123.mp4");


        // 4. 将文件数据存入 响应体 中
        // 获取 Response 对象的输出流，这个输出流能够将数据输出到 响应体中
        ServletOutputStream ops = resp.getOutputStream();
        // 读取资源数据，写入响应体输出流
        FileInputStream fis = new FileInputStream(img_path);
        BufferedInputStream bis = new BufferedInputStream(fis);

        byte[] datas = new byte[102400];
        int len = 0;

        while ((len = bis.read(datas,0,datas.length)) != -1){
            // 将读取到的数据写入输出流
            ops.write(datas,0,len);
            ops.flush();
        }

    }
}
