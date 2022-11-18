package com.xty.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.nio.charset.Charset;

// 基于UDP协议的 客户端，用于接收数据
public class UDPClient {
    public static void main(String[] args) throws IOException {
        // 接收 DatagremSocket 发送的数据
        // 1. 创建一个 DatagramSocket 对象。绑定到 9999 端口上，用于接收该端口的数据。
        DatagramSocket ds = new DatagramSocket(9999);

        // 2. 创建一个 DatagramPacket 数据报包，对象，用于接收数据
        DatagramPacket dp = new DatagramPacket(new byte[1024],1024);

        // 3. 接收发过来的数据
        ds.receive(dp);

        // 4. 解析接收到的数据
        byte[] data = dp.getData();

        // 将字节数组，按照 utf-8 的编码，解码为字符串
        String s = new String(data,0,dp.getLength(),"UTF-8");

        System.out.println("接收到了信息："+s);

        // 5. 关闭套接字
        ds.close();
    }
}
