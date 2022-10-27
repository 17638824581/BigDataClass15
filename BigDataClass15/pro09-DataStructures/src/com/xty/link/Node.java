package com.xty.link;

/**
 * 链表的节点类，每个节点存储一个数据，和下一个节点的位置
 * @author Mr.yu
 * @date 2022/10/27 17:46
 */
public class Node {
    // 节点存储的数据
    private int data;

    // 下一个节点
    private Node next;

    public Node() {
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
