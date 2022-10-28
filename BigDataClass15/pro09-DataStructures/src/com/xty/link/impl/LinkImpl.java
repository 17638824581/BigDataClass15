package com.xty.link.impl;

import com.xty.link.Link;

/**
 * 实现Link接口的链表实现类
 * @author Mr.yu
 * @date 2022/10/28 15:27
 */
public class LinkImpl implements Link {

    /**
     * 链表节点成员内部类
     * @author Mr.yu
     * @date 2022/10/28 15:28
     */
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    // 存储整个链表的头节点
    private Node head;

    // 存储链表长度
    private int length;

    public LinkImpl() {
    }

    /**
     * 添加元素方法
     *
     * @param data : 要添加到链表中的元素值
     * @return void
     * @author Mr.yu
     * @date 2022/10/28 15:05
     */
    @Override
    public void add(int data) {
        //1.创建节点，保存数据
        Node node = new Node(data);
        //2.将节点存到链表尾部
        // 先判断整个链表是否为空，如果为空，应该让 head = 新节点
        if(length == 0){
            head = node;
        }else{
            // 找到链表中最后一个节点
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            // 循环结束之后，temp就是最后一个节点。
            // 将新节点放到最后一个节点后面
            temp.next = node;
        }

        length ++;
    }

    /**
     * 根据索引访问元素的方法
     *
     * @param index : 索引位
     * @return int：找到的元素值
     * @author Mr.yu
     * @date 2022/10/28 15:07
     */
    @Override
    public int get(int index) {
        return 0;
    }

    /**
     * 根据元素值找元素位置，返回找到的索引
     *
     * @param data : 要找的元素值
     * @return int：找到的元素值的索引位置，若没找到，返回-1
     * @author Mr.yu
     * @date 2022/10/28 15:09
     */
    @Override
    public int findValue(int data) {
        return 0;
    }

    /**
     * 更新指定索引位置的元素值
     *
     * @param index : 索引位
     * @param data  : 新的元素值
     * @return boolean: 更新是否成功，若返回 false 就是因为索引越界。
     * @author Mr.yu
     * @date 2022/10/28 15:13
     */
    @Override
    public boolean update(int index, int data) {
        return false;
    }

    /**
     * 按照索引删除元素
     *
     * @param index : 索引位
     * @return boolean: 更新是否成功，若返回 false 就是因为索引越界。
     * @author Mr.yu
     * @date 2022/10/28 15:14
     */
    @Override
    public boolean delete(int index) {
        return false;
    }

    /**
     * 获取链表长度
     *
     * @return int：返回当前链表的长度
     * @author Mr.yu
     * @date 2022/10/28 15:15
     */
    @Override
    public int size() {
        return this.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        // 遍历整个链表，将每个节点中存储的元素打印出来
        Node temp = head;
        while(temp.next!=null){
            sb.append(temp.data);
            sb.append(", ");
            temp = temp.next;
        }
        // 循环结束之后，temp 是最后一个节点，将最后一个节点的数据添加到 sb 中。
        sb.append(temp.data);
        sb.append("]");
        return sb.toString();
    }
}
