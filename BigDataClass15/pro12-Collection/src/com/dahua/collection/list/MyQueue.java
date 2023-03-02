package com.dahua.collection.list;

import com.dahua.collection.Student;

import java.util.LinkedList;

public class MyQueue {

    // 内部存储数据的容器
    LinkedList<Student> ll;

    public MyQueue() {
        this.ll = new LinkedList<>();
    }

    /**
     * 在队尾加入一个学生
     * @param s: 要加入的学生
     * @return void
     * @author Mr.yu
     * @date 2022/11/7 9:33
     */
    public void push(Student s){
        ll.add(s);
    };

    /**
     * 取出队头的学生
     * @param : 
     * @return Student
     * @author Mr.yu
     * @date 2022/11/7 9:34
     */
    public Student pop(){
        return ll.pop();
    }

    /**
     * 判断队列是否为空
     * @param : 
     * @return boolean
     * @author Mr.yu
     * @date 2022/11/7 9:34
     */
    public boolean empty(){
        return ll.isEmpty();
    }

    /**
     * 查看队头元素
     * @param : 
     * @return Student
     * @author Mr.yu
     * @date 2022/11/7 9:35
     */
    public Student front(){
        return ll.getFirst();
    }

    /**
     * 返回队尾元素
     * @param : 
     * @return Student
     * @author Mr.yu
     * @date 2022/11/7 9:35
     */
    public Student back(){
        return ll.getLast();
    }
    
    /**
     * 返回队列长度
     * @param : 
     * @return int
     * @author Mr.yu
     * @date 2022/11/7 9:36
     */
    public int size(){
        return ll.size();
    }

    @Override
    public String toString() {
        return ll.toString();
    }
}
