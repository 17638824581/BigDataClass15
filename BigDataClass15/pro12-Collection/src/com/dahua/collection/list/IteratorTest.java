package com.dahua.collection.list;

import com.dahua.collection.Student;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {
    // Iterable 接口是 可迭代接口，实现了这个接口就可以使该类可以通过 forEach 进行迭代。
    // Iterator 接口是 迭代器接口，可通过实现了 Iterable 接口的类对象的 iterator() 方法来获取一个 Iterator 对象。
    //    该接口提供了如下四个方法：
    //      1. next()：返回迭代器中下一个对象。
    //      2. hasNext()：判断迭代器中是否还有下一个对象。
    //      3. remove()：删除当前迭代到的对象。
    //      4. forEachRemaining()：使用指定“操作器”为迭代器中剩余的对象进行一次操作。

        ArrayList<Student> al = new ArrayList<>();

        al.add(new Student("张三",12,33));
        al.add(new Student("李四",13,44));
        al.add(new Student("王五",14,55));
        al.add(new Student("赵六",15,66));

        Iterator<Student> iterator = al.iterator();
        iterator.next();
        iterator.next();

//        iterator.forEachRemaining((s)->s));

        System.out.println(al);

    }
}
