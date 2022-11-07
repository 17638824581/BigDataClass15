package com.xty.collection.set;

import java.util.Arrays;

/**
 * 实现简单的哈希表，存储字符串元素
 * @author Mr.yu
 * @date 2022/11/7 16:20
 */
public class MyHashTableImpl implements MyHashTable {

    /**
     * 节点，节点存储数据，还能指向下一个节点。
     * @return null
     * @author Mr.yu
     * @date 2022/11/7 16:44
     */
    private class Node{
        private String data;
        private Node next;

        public Node(String data){
            this.data = data;
        }
    }
    
    // 哈希表本质就是用 数组来存储元素
    private Node[] data;

    // 记录本哈希表存储的元素个数
    private int size;

    public MyHashTableImpl() {
        data = new Node[20];
    }

    public MyHashTableImpl(int length){
        data = new Node[length];
    }

    /**
     * 向哈希表中添加元素
     *
     * @param str : 要添加的元素
     * @return void
     * @author Mr.yu
     * @date 2022/11/7 16:17
     */
    @Override
    public void add(String str) {
        // 1. 获取 str 的哈希码
        int hash = str.hashCode();
        // 2. 根据哈希码计算存储位置：简单算法（哈希值 % 数组长度）
        int index = hash % data.length;
        // 3. 将 str 包裹为 Node
        Node newNode = new Node(str);
        Node temp = data[index];
        // 如果 temp 为空，说明当前位置没有节点
        if (temp == null){
            data[index] = newNode;
            size ++;
        }else{
            // 如果 temp 不为空，则需要找到最后的节点，将新节点存到后面
            while (temp.next != null){
                // 在找位置的同时，需要对比元素是否重复
                if(temp.data.equals(str)){
                    return;
                }
                temp = temp.next;
            }
            // 判断最后一个节点是否重复
            if (temp.data.equals(str)){
                return;
            }
            // 将新元素存到这个位置的最后的节点的后面
            temp.next = newNode;
            size ++;
        }
    }


    /**
     * 删除哈希表中指定的元素
     *
     * @param str : 要删掉的元素
     * @return boolean
     * @author Mr.yu
     * @date 2022/11/7 16:18
     */
    @Override
    public boolean remove(String str) {
        // 1. 计算 str 的位置
        int index = str.hashCode() % data.length;
        // 2. 判断这个位置是否为空
        Node temp_pre = data[index]; // temp 之前的节点
        Node temp = data[index]; // temp 表示要删掉的节点
        if (temp != null){
            // 如果要删的节点刚好是 第一个节点
            if (temp.data.equals(str)){
                data[index] = temp.next;
                size--;
                return true;
            }
            // 如果要删除的节点不是第一个节点，需要找到要删的这个节点
            while (temp != null){
                temp_pre = temp;
                temp = temp.next;

                // 如果temp是我们要删除的节点
                if (temp.data.equals(str)){
                    temp_pre.next = temp.next;
                    size--;
                    return true;
                }
            }
            return false;
        }else{
            return false;
        }
    }

    /**
     * 返回哈希表中元素个数
     *
     * @return int
     * @author Mr.yu
     * @date 2022/11/7 16:18
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * 判断哈希表是否为空
     *
     * @return boolean
     * @author Mr.yu
     * @date 2022/11/7 16:18
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 清空哈希表
     *
     * @return void
     * @author Mr.yu
     * @date 2022/11/7 16:19
     */
    @Override
    public void clear() {
        data = new Node[data.length];
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < data.length; i++) {
            sb.append("索引"+i+": ");
            if (data[i] != null){
                Node node = data[i];
                // 遍历节点所在的链表
                while(node != null){
                    // 将节点中的元素添加到 sb中
                    sb.append("("+node.data+")");
                    sb.append("->");
                    node = node.next;
                }
            }else{
                sb.append("null");
            }
            sb.append("\n");
        }

        
        sb.append("]");
        
        return sb.toString();
    }
}
