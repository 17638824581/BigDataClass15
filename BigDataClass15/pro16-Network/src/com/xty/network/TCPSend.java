package com.xty.network;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPSend {
    public static void main(String[] args) throws IOException {
        // 使用 TCP 协议发送数据
        // TCP协议基于连接，先创建一个连接。

        // 目标IP
        InetAddress ip = InetAddress.getByName("192.168.11.129");
        // 目标端口
        int port = 10086;

        String s = "你好！";

        // 1. 创建 TCP 套接字对象，指定连接到谁
        System.out.println("正在连接...");
        Socket socket = new Socket(ip,port);
        System.out.println("连接成功！");

        // 2. 获取套接字的 输出流（用于发送数据）
        OutputStream os = socket.getOutputStream();
        // 方便写入字符串，将字节输出流包装为，字符输出流
        OutputStreamWriter osw = new OutputStreamWriter(os,"UTF-8");
        // 方便发送字符串，将字符输出流，包装为 缓冲字符输出流
        BufferedWriter bw = new BufferedWriter(osw);

        // 3. 获取套接字的 输入流（用于接收数据）
        // 开启一个子线程，不断读取对方发送的数据。

        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is, "utf-8"));

        new Thread(()->{
            while (true){
                String s1 = null; // readLine() 会一直等待输入流中的数据。
                try {
                    s1 = br.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("接收到："+s1);
            }
        }).start();


        // 3. 将数据写入输出流（发送到目标）
        Scanner sc = new Scanner(System.in);
        String text;
        do{
            System.out.println("请输入您要发送的信息：");
            text = sc.next(); // next() 会一直等待键盘输入的数据。
            bw.write(text);
            bw.newLine();
            bw.flush();
        } while (!text.equals("stop"));
        System.out.println("连接已关闭。");

        // 4. 关闭资源
        bw.close();
        osw.close();
        os.close();
        socket.close();
        System.out.println("本次会话已结束。");
    }
}
