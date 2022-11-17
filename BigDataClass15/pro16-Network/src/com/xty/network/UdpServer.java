package com.xty.network;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UdpServer {

    public static void main(String[] args) throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        new Thread(() -> {
            try {
                // 接收10086端口信息
                DatagramSocket ds = new DatagramSocket(10086);
                byte[] bytes = new byte[1024];
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

                while (true) {
                    ds.receive(dp);
                    Date date = new Date();
                    System.out.println(sdf.format(date)+"收到信息："+new String(dp.getData(),0,dp.getLength(),"utf-8"));
                }

            } catch (SocketException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).start();

        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入信息：");
            String next = sc.next();
            byte[] bytes = next.getBytes("utf-8");
            // 给10010发送信息
            DatagramPacket dp = new DatagramPacket(bytes,0,bytes.length,InetAddress.getLocalHost(),10010);
            ds.send(dp);
        }
    }
}
