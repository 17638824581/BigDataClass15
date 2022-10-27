package com.xty.link;

public class Test {
    public static void main(String[] args) {

        // 创建一个节点对象
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        // 让节点存储一个数据
        n1.setData(999);
        n2.setData(888);
        n3.setData(777);
        n4.setData(666);

        // 让 n1 和 n2 连接起来
        // n1 的 下一个节点 就是 n2
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);

        System.out.println(n1);


    }
}
