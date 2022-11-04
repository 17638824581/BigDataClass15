package com.xty.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import java.util.function.Consumer;

public class VectorTest {
    public static void main(String[] args) {
        // 常用List 集合包含 ： ArrayList、LinkedList、Vector

        // Vector是线程安全的
        // Vector 每次扩充长度的 1 倍
//        ArrayList<Student> v = new ArrayList<>();
//
//        v.add(new Student("小明",16,88.8));
//        v.add(new Student("小聪",18,77.8));
//        v.add(new Student("小光",17,66.8));
//        v.add(new Student("小白",15,55.8));

        // 集合类自带一个 forEach() 方法
        //  接收一个操作器对象，定义了对元素要进行的操作。
        //   集合操作器对象对集合中的每个元素都进行一次操作。


        // 遍历打印集合中的每个元素
//        for (int i = 0; i < v.size(); i++) {
//            System.out.println(v.get(i));
//        }

        // :: 表示方法引用
        //System.out::println 相当于将 println 这个方法，作为实参传入 forEach 方法
//        v.forEach(System.out::println);


        // 要给每个学生的分数 + 10 分
//        for (int i = 0; i < v.size(); i++) {
//            Student s = v.get(i);
//            s.setScore(s.getScore()+10);
//        }
//
//        v.forEach((s)->s.setScore(s.getScore()+10));
//
//        System.out.println(v);



        // 找出 Vector集合中的名字叫 小白的同学，删掉他

        // 集合的遍历
//        System.out.println("----------for循环遍历-----------");
        // 1. for
//        for (int i = 0; i < v.size(); i++) {
//            // 找到小白，删掉他
//            Student student = v.get(i);
//            if (student.getName().equals("小白")){
//                v.remove(student);
//            }
//        }
//
//        System.out.println(v);


//        System.out.println("----------forEach遍历-----------");
        // 2. forEach
//        for(Student s: v){
//            // 找到小白删掉他
//            if (s.getName().equals("小白")){
//                v.remove(s);
//            }
//        }
//
        // 3. 使用 Iterator 迭代器（从哪儿来？从集合对象的 iterator() 方法来）
        //  使用 迭代器的时候，无法修改集合。
//        Iterator<Student> iterator = v.iterator();
//
//        iterator.forEachRemaining((s)->s.setScore(0));
//
//        System.out.println(v);

    }
}
