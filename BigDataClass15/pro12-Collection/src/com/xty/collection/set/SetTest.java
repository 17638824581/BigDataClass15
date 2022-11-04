package com.xty.collection.set;

import com.xty.collection.Student;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Spliterator;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {

        // Set 接口是 Collection 接口下的子接口，和 List 接口同级
        //  Set 接口代表的是 数学概念中的 ”集合“，其 元素不可重复 且 不支持索引。
        // Set 接口下常用的实现类有：
        //  1. HashSet
        //  2. LinkedHashSet
        //  3. TreeSet

        // HashSet，其底层实现原理是：哈希表，特点是
        //      1.支持存储 null值，但只能有一个
        //      2.元素不可重复
        //      3.内部元素无序
        // HashSet 存储元素时会按照元素的 equals() 方法以及 HashCode() 哈希值，来判断元素是否重复

 /*       HashSet<Student> hs = new HashSet();
        Student s1 = new Student("张三", 18, 33);
        Student s2 = new Student("李四", 19, 44);
        Student s3 = new Student("王五", 20, 55);
        Student s4 = new Student("赵六", 21, 55);
        Student s5 = new Student("赵六", 21, 66);

        System.out.println("s4.equals(s5) = " + s4.equals(s5));
        System.out.println("s4.hashCode() = " + s4.hashCode());
        System.out.println("s5.hashCode() = " + s5.hashCode());

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        hs.add(s5);

        System.out.println(hs);
*/
        // LinkedHashSet，是 HashSet 的子类，
        // 其底层实现原理是 哈希表和链表的组合结构。特点是：
        //      1.支持存储null值，但只能有一个
        //      2.元素不可重复
        //      3.能够维持元素的添加顺序
        // 由 哈希表确保了其元素不可重复
        // 由 链表维持了元素的添加顺序
      /*  LinkedHashSet<Student> lhs = new LinkedHashSet();

        Student s1 = new Student("张三", 18, 33);
        Student s2 = new Student("李四", 19, 44);
        Student s3 = new Student("王五", 20, 55);
        Student s4 = new Student("赵六", 21, 55);
        Student s5 = new Student("赵六", 21, 66);

        lhs.add(s1);
        lhs.add(s2);
        lhs.add(s3);
        lhs.add(s4);
        lhs.add(s5);

        System.out.println(lhs);*/

        // TreeSet 其底层原理是 红黑树（平衡二叉查找树）。特点是：
        //      1. 不支持存储 null。
        //      2. 元素不可重复
        //      3. 对元素值排序（可自定义排序规则）
   /*     TreeSet<Student> ts = new TreeSet<>((o1,o2)->o1.getAge()-o2.getAge());

        Student s1 = new Student("张三", 18, 33);
        Student s2 = new Student("李四", 19, 44);
        Student s3 = new Student("王五", 20, 55);
        Student s4 = new Student("赵六", 21, 55);
        Student s5 = new Student("赵六", 21, 66);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        System.out.println(ts);*/
    }
}
