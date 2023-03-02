package com.dahua.web;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

/*
*  仅仅接收文件类型
* */
@WebServlet("/upload3")
public class UploadServlet3 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletFileUpload upload = new ServletFileUpload();
        // 需要设置一个 文件处理工厂类
        upload.setFileItemFactory(new DiskFileItemFactory());
        // 1. 判断是否为多段数据请求
        if (upload.isMultipartContent(req)) {
            // 2. 如果是多段数据请求，使用 ServletFileUpload 的 parseRequest() 方法，直接将所有数据解析为 List<FileItem>
            try {
                List<FileItem> fileItems = upload.parseRequest(req);
                // 3. 遍历 List<FileItem> 集合，判断那个 FileItem 是文件类型。
                for (FileItem item : fileItems) {
                    // 4. 如果是文件类型，则 调用它自己的 write() 方法将文件存储到指定位置。
                    if (!item.isFormField()) {
                        // 获取上传文件名
                        String name = item.getName();
                        // 存储上传文件
                        item.write(new File("D://upload_files/"+name));
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
