package com.xty.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//简单版的聊天程序
public class QQ {

    // 用于连接其他客户端的 Socket
    private Socket s;

    // 用于监听本地端口 ServerSocket
    private ServerSocket ss;

    // 用于接收信息的  Socket
    private Socket accept;

    // 通过要连接的计算机的 Ip 地址
    public QQ(String host) throws IOException {
        System.out.println("正在连接...");
        try {
            // 初始化Socket，负责发送信息
            this.s = new Socket(InetAddress.getByName(host), 8888);
        }catch (Exception e){
            System.out.println("网络异常，连接失败！");
            e.printStackTrace();
        }

        System.out.println("初始化完成！");
    }

    // 发送信息的方法
    public void sendMess(String mess) throws IOException {
        OutputStream outputStream = s.getOutputStream();
        outputStream.write(mess.getBytes("UTF-8"));
        outputStream.close();
    }

    // 接收信息的方法
    public void acceptMess() throws IOException {
        // 监听自己的 10086 端口来接收信息
        this.ss = new ServerSocket(8888);
        this.accept = ss.accept();

        InputStream is = this.accept.getInputStream();
        byte[] bytes = new byte[1024];
        int len;

        while ((len = is.read(bytes,0,bytes.length)) != -1) {
            String s1 = new String(bytes, 0, len, "UTF-8");
            System.out.println("接收到：" + s1);
        }
    }

    // 启动，开始聊天
    public void startSpeak(){
        // 启动一个线程用于接收信息
        new Thread(()->{
            while (true){
                try {
                    acceptMess();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
        System.out.println("开始接收信息！");

        // 启动另一个线程用于发送信息
        new Thread(()->{
            Scanner scanner = new Scanner(System.in);
            while (true){
                System.out.println("请输入您要发送的信息：");
                try {
                    sendMess(scanner.next());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
        System.out.println("开始发送信息！");
    }
}
