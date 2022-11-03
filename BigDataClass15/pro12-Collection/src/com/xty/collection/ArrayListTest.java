package com.xty.collection;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {


        // 对于 List<泛型> 接口下的实现类。
        // 泛型：指内部存储什么类型的数据。
        // 用法一致，效率不同
        // ArrayList<泛型> 类：由数组存储数据
        //   插入数据操作，慢
        // LinkedList<泛型> 类：由链表存储数据
        //   插入数据操作，快
        // Vector<泛型> 类：由数组存储数据


        // LinkedList 和 ArrayList 为什么用法一致？
        //  是因为它们都实现的是 List<> 接口
        //  它们常用的操作方法，都是在 List<> 中定义的。
        // Vector 是一个线程安全的列表。

//        ArrayList<String> list = new ArrayList<>();
//        LinkedList<String> link = new LinkedList<>();
//        Vector<String> vector = new Vector<>();
//
//
//        System.out.println("------------添加元素-------------");
//        // 添加元素的操作 add()
//        list.add("张三");
//        list.add(0, "李四");
//
//        link.add("张三");
//        link.add(0, "李四");
//
//        vector.add("张三");
//        vector.add(0, "李四");
//
//        System.out.println("list = " + list);
//        System.out.println("link = " + link);
//        System.out.println("vector = " + vector);
//
//
//        list.add("王五");
//        list.add("赵六");
//        System.out.println("list = " + list);
        // containsAll(): 判断本列表是否包含指定列表中的所有元素
//        boolean contains = list.contains(vector);

//        ArrayList<Integer> ints = new ArrayList<>();
//        ints.add(1);
//        ints.add(2);
//        ints.add(3);
//        ints.add(4);
//        ints.add(5);
//
//        LinkedList<Object> ints2 = new LinkedList<>();
//        ints2.add(1);
//        ints2.add(3);
//        ints2.add(2);
//
//        System.out.println("指定集合："+ints2);
//        System.out.println("本集合："+ints);
//        boolean contains1 = list.contains(link);
//        System.out.println("contains1 = " + contains1);


        // addAll() 方法：将指定集合中的元素添加到本集合中。
//        list.addAll(link);
//        list.addAll(vector);

        // removeAll() 方法：删除 本集合中 在 指定集合中存在的 元素。
//        list.add("王五");
//        System.out.println("删除之前list = " + list);
//        list.removeAll(vector);
//
//        System.out.println("list = " + list);
//
//        // 将集合转为数组
//        Object[] objects = list.toArray();

//        System.out.println(Arrays.toString(objects));

        // sort() 方法，List 中
//        System.out.println("排序前："+list);
//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                char c = o1.charAt(0);
//                char c1 = o2.charAt(0);
//                return c - c1;
//            }
//        });
//        System.out.println("排序后："+list);

//        LinkedList<Student> stus = new LinkedList<>();
//
//        stus.add(new Student("小明",16,99));
//        stus.add(new Student("小红",20,88));
//        stus.add(new Student("小光",13,38));
//        stus.add(new Student("小帅",24,65));
//        stus.add(new Student("小美",19,45));
//
//        System.out.println(stus);
        
        //stus 存储学生信息
        // 需要获取在 stus 中分数前三名的学生
        //  1. 将 stus 中的学生按照分数排序。（倒序）
//        stus.sort((o1,o2)-> (int) (o2.getScore()-o1.getScore()));
//        System.out.println(stus);

        //  2. 将 stus 中前三个元素提取出来。（截取子列表）
//        List<Student> students = stus.subList(0, 3);
//
//        System.out.println(students);


//        System.out.println("---------clear()方法：清空-----------");
//        list.clear();
//        link.clear();
//        vector.clear();
//        System.out.println("list = " + list);
//        System.out.println("link = " + link);
//        System.out.println("vector = " + vector);

//        System.out.println("---------contains()方法：判断某个元素是否存在-----------");
//        System.out.println("list.contains(\"张三\") = " + list.contains("张三"));
//        System.out.println("link.contains(\"张三\") = " + link.contains("张三"));
//        System.out.println("vector.contains(\"张三\") = " + vector.contains("张三"));

//        System.out.println("---------isEmpty()方法：判断集合是否为空-----------");
//        System.out.println("list.isEmpty() = " + list.isEmpty());
//        System.out.println("link.isEmpty() = " + link.isEmpty());
//        System.out.println("vector.isEmpty() = " + vector.isEmpty());

//        System.out.println("---------size()方法：获取元素的个数-----------");
//        System.out.println("list.size() = " + list.size());
//        System.out.println("link.size() = " + link.size());
//        System.out.println("vector.size() = " + vector.size());

//        System.out.println("------------访问元素-------------");
//
//        // 获取元素的操作 get()
//        System.out.println("list.get(0) = " + list.get(0));
//        System.out.println("link.get(0) = " + link.get(0));
//        System.out.println("vector.get(0) = " + vector.get(0));
//
//        System.out.println("------------删除元素-------------");
//
//        // 删除元素的操作 remove()
//        list.remove(0);
//        link.remove(0);
//        vector.remove(0);
//
//        System.out.println("list = " + list);
//        System.out.println("link = " + link);
//        System.out.println("vector = " + vector);
//
//        System.out.println("------------修改元素-------------");
//
//        // 修改元素的操作 set()
//        list.set(0,"王五");
//        link.set(0,"王五");
//        vector.set(0,"王五");
//
//        System.out.println("list = " + list);
//        System.out.println("link = " + link);
//        System.out.println("vector = " + vector);

    }
}
