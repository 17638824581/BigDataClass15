package com.xty.network;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TCPSendFile {
    public static void main(String[] args) throws IOException {
        // TCP 发送文件
        Socket socket = new Socket("192.168.11.129",10086);

        // 文件路径
        File file = new File("F:\\Code\\Java\\git\\BigDataClass15\\BigDataClass15\\pro16-Network\\file\\02.jpg");

        // 创建字节输入流，用于读取文件数据
        FileInputStream fis = new FileInputStream(file);

        // 获取输出流，用于发送
        OutputStream os = socket.getOutputStream();

        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes,0,bytes.length)) != -1){
            // 通过输出流，向对方发送读取到的文件数据
            os.write(bytes,0,len);
            os.flush();
        }
        System.out.println("文件发送完毕！");

        // 关闭连接
        os.close();
        fis.close();
        socket.close();

    }
}
