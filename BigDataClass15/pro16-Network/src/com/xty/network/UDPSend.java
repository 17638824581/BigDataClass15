package com.xty.network;

import java.io.*;
import java.net.*;

public class UDPSend {
    public static void main(String[] args) throws IOException {
        // 通过udp连接，向 192.168.11.129 发送数据
        // 目标ip
        InetAddress ip = InetAddress.getByName("192.168.11.129");
        // 目标端口号
        int port = 8888;
        // 要发送的数据
        File file = new File("F:\\Code\\Java\\git\\BigDataClass15\\BigDataClass15\\pro16-Network\\file\\02.jpg");

        // 1. 创建 UPD 套接字
        DatagramSocket ds = new DatagramSocket();

        // 通过字节输入流，读取文件内容
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        // 读取文件中的字节数据
        byte[] bytes = new byte[1024];
        int len;
        System.out.println("开始发送文件。");
        while ((len = bis.read(bytes,0,bytes.length)) != -1){
            // 2. 创建 UPD 数据包(需要携带，目标ip，目标端口，要发送的数据)
            // 3. 将要发送的数据放入数据包
            DatagramPacket dp = new DatagramPacket(bytes, 0, len, ip, port);
            // 4. 通过套接字发送数据包
            ds.send(dp);
        }
        System.out.println("发送完成。");

        // 发送结束短语
        DatagramPacket dp = new DatagramPacket("stop".getBytes("UTF-8"), 0, 4, ip, port);
        ds.send(dp);

        // 5. 释放资源
        bis.close();
        fis.close();
        ds.close();
    }
}
