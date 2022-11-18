package com.xty.network;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

// 基于TCP协议的服务端，用于发送数据
public class TCPServer {
    public static void main(String[] args) throws IOException {
        // 1. 创建 Socket 套接字对象(指定连接的ip以及端口号)
        Socket socket = new Socket(InetAddress.getByName("192.168.11.129"),8888);
        // 2. 通过 Socket 对象获取到字节输出流
        OutputStream os = socket.getOutputStream();
        // 3. 向输出流写入内容，就相当于给接收端发送数据。
        os.write("你好！".getBytes("UTF-8"));
        // 4. 发送完数据后，关闭输出流
        os.close();
        // 5. 关闭 套接字
        socket.close();
    }
}
