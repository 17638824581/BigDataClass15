package com.dahua.link.impl;

import com.dahua.link.Link;

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
    private Node end;

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
            end = node;
        }else{
            // 找到链表中最后一个节点
            end.next = node;
            end = node;
        }

        length ++;
    }

    /**
     * 添加元素到指定位置方法
     *
     * @param index : 要添加到链表中的索引位
     * @param data  : 要添加到链表中的元素值
     * @return void
     * @author Mr.yu
     * @date 2022/10/28 15:05
     */
    @Override
    public boolean add(int index, int data) {
        if (index<0 || index>size()){
            return false;
        }

        if (index == size()){
            add(data);
            return true;
        }

        // 先新建节点，存储 data 数据
        Node newNode = new Node(data);

        // 表示将新节点插入到开头
        if (index == 0){
            newNode.next = head;
            head = newNode;
            length++;
            return true;
        }

        Node temp = head;
        // 循环结束后 temp 表示 index 前一个节点
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        length++;

        return true;
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
        // 判断索引是否越界
        if (index<0 || index >= length){
            System.out.println("索引越界");
            return -1;
        }

        // 临时让 temp 指向 head节点
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.data;
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
        // 遍历整个链表，找 data
        Node temp = head;
        for (int i = 0; i < size(); i++) {
            if (temp.data == data){
                return i;
            }
            temp = temp.next;
        }

        return -1;
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
        // 索引是否越界
        if (index < 0 || index >= size()){
            return false;
        }

        // 通过循环找到要修改的节点
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        // 修改节点的值为 data
        temp.data = data;
        return true;
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
        if (index<0 || index>=size()){
            return false;
        }

        if (index == 0){
            head = head.next;
            length --;
            return true;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        length --;
        return true;
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
