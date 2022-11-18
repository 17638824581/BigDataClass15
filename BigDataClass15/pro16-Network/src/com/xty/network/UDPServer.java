package com.xty.network;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.*;

// 基于UDP协议的服务端，用于发送数据
public class UDPServer {
    public static void main(String[] args) throws IOException {
        //1. 先创建一个 DatagramSocket（UDP套接字） 发送 数据报包，对象，并绑定的本主机的 8888 端口
        DatagramSocket ds = new DatagramSocket(8888);

        // 想要发送一句话：“hello !”
        String s = "hello !";
        // 将字符串按照 utf-8 的字符集编码为 字节数组
        byte[] bytes = s.getBytes("utf-8");

        //2. 在创建一个 数据报包 对象，用来存储要发送的数据
        //  数据报包包含的内容：1.数据内容，2.接收端的ip地址。3.接收端的端口号.
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,InetAddress.getByName("192.168.1.44"),9999);

        // 3. 发送数据报包
        ds.send(dp);

        // 4. 关闭数据报套接字。
        ds.close();
        System.out.println("发送完毕！");
    }
}
