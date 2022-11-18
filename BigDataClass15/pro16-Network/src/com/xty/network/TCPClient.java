package com.xty.network;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

// 基于TCP协议的客户端，接收发送的数据
public class TCPClient {
    public static void main(String[] args) throws IOException {
        // 1. 创建 ServerSocket 套接字对象，监听主机的 8888号端口
        ServerSocket ss = new ServerSocket(8888);

        // 2. 调用 accept() 方法，获取套接字对象
        Socket s = ss.accept();

        // 3. 通过 套接字对象，获取输入流，读取流中数据
        InputStream is = s.getInputStream();

        byte[] bytes = new byte[1024];
        int len;
        while ((len = is.read(bytes,0,bytes.length)) != -1){
            String s1 = new String(bytes, 0, len, "UTF-8");
            System.out.println("接收到数据："+s1);
        }

        // 4.释放资源
        is.close();
        s.close();
        ss.close();
    }
}
