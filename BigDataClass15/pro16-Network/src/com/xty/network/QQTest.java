package com.xty.network;

import java.io.IOException;

public class QQTest {
    public static void main(String[] args) throws IOException {
        // 要和 192.168.1.44 进行连接
        QQ qq = new QQ("192.168.1.124");

        // 启动聊天
        qq.startSpeak();
    }
}
