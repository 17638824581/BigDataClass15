package com.dahua.collection.set;

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

//        ArrayList<String> al = new ArrayList<>();
//        // 往 ArrayList 存元素
//        al.add("张三");
//        al.add("张三");
//        al.add("张三");
//        al.add("李四");
//        al.add("李四");
//        al.add("李四");
//        al.add("王五");
//        al.add("王五");
//        al.add("赵六");
//        al.add("赵六");
//        al.add("田七");
//        al.add("田七");
//        al.add("田七");
//        al.add("田七");
//        al.add("田七");
//
//        System.out.println("去重前："+al);
//
//        al = new ArrayList<>(new HashSet<>(al));
//
//        System.out.println("去重后："+al);


        // HashSet 怎么访问元素
        //  HashSet 没有索引，自然无法通过索引获取元素
        //  HashSet 实现了 Iterable 接口（可以使用 forEach 循环），但我们可以通过 迭代器访问

//        HashSet<Student> hs = new HashSet();
//
//        Student s1 = new Student("张三", 18, 33);
//        Student s2 = new Student("李四", 19, 44);
//        Student s3 = new Student("王五", 20, 55);
//        Student s4 = new Student("赵六", 21, 55);
//        Student s5 = new Student("赵六", 21, 55);
//
//        System.out.println("s4.hashCode() = " + s4.hashCode());
//        System.out.println("s5.hashCode() = " + s5.hashCode());
//        System.out.println("s4.equals(s5) = " + s4.equals(s5));
//
//        hs.add(s1);
//        hs.add(s2);
//        hs.add(s3);
//        hs.add(s4);
//        hs.add(s5);
//
//        System.out.println(hs);

        // LinkedHashSet，是 HashSet 的子类，
        // 其底层实现原理是 哈希表和链表的组合结构。特点是：
        //      1.支持存储null值，但只能有一个
        //      2.元素不可重复
        //      3.能够维持元素的添加顺序
        // 由 哈希表确保了其元素不可重复
        // 由 链表维持了元素的添加顺序

//        ArrayList<String> al = new ArrayList<>();
//        al.add("张三");
//        al.add("张三");
//        al.add("李四");
//        al.add("李四");
//        al.add("王五");
//        al.add("王五");
//        al.add("王五");
//        al.add("赵六");
//        al.add("赵六");
//        al.add("赵六");
//        System.out.println("al去重前：");
//        System.out.println("al = " + al);
//        al = new ArrayList<>(new LinkedHashSet<>(al));
//        System.out.println("al去重后：");
//        System.out.println(al);


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

        // 使用 空参构造 创建 TreeSet
//        TreeSet<Integer> ts = new TreeSet<>();
//
//        ts.add(100);
//        ts.add(50);
//        ts.add(30);
//        ts.add(80);
//        ts.add(70);
//
//        System.out.println(ts);


//        ArrayList<Integer> al = new ArrayList<>();
//
//        al.add(12);
//        al.add(36);
//        al.add(14);
//        al.add(25);
//        al.add(70);
//        al.add(40);
//        al.add(10);
//        al.add(60);
//        al.add(12);
//        al.add(14);
//        al.add(10);
//
//        System.out.println("al = " + al);

        // 通过 TreeSet(Collection c) 来创建 TreeSet
//        TreeSet<Integer> ts = new TreeSet<>(al);
//
//        System.out.println("ts = " + ts);
        
        // 通过 TreeSet(Comparator c) 来创建 TreeSet
//        TreeSet<Student> ts = new TreeSet<>((o1,o2)->o1.getAge()-o2.getAge());
//
//        Student s1 = new Student("张三", 21, 33);
//        Student s2 = new Student("李四", 20, 44);
//        Student s3 = new Student("王五", 19, 55);
//        Student s4 = new Student("赵六", 18, 66);
//        Student s5 = new Student("赵六", 18, 77);
//
//        ts.add(s1);
//        ts.add(s2);
//        ts.add(s3);
//        ts.add(s4);
//        ts.add(s5);
//
//        System.out.println(ts);


    }
}
