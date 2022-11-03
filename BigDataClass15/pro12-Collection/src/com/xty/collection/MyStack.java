package com.xty.collection;

import java.util.ArrayList;

/**
 * 栈，就是操作受限的列表。
 * 将一个列表改造成栈
 * @author Mr.yu
 * @date 2022/11/3 17:04
 */
public class MyStack {

    // 使用 ArrayList 实现栈。
    // 内部用来存储数据的列表。
    private ArrayList<String> data;

    public MyStack() {
        data = new ArrayList<>();
    }


    // push(): 压入元素到栈中
    public void push(String s){
        data.add(s);
    }

    // pop(): 从栈顶中弹出元素
    public String pop(){
        String s = data.get(data.size() - 1);
        data.remove(data.size() - 1);
        return s;
    }
    // peek()：查看栈顶元素
    public String peek(){
        return data.get(data.size()-1);
    }

    // serach()：搜索指定元素，返回它在栈中的位置
    public int serach(String s){
        int index = data.lastIndexOf(s);
        return data.size()-index;
    }

    // empty()：判断栈是否为空
    public boolean empty(){
        return data.isEmpty();
    }

    @Override
    public String toString() {
        return data.toString();
    }
}