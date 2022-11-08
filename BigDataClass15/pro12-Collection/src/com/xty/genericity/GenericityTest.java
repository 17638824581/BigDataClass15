package com.xty.genericity;


import java.util.ArrayList;
import java.util.List;

// 测试泛型,从 jdk 1.5 引入的
public class GenericityTest {

    // 写一个方法，这个方法能够计算 List 集合中 所有元素的和
    // List<? extends Integer>：表示List中存储的元素必须为 Integer 类型或 Integer 的子类类型。

    // List<? super Integer>：表示 List 中存储的元素必须为 Integer 类型 或 Integer 的父类类型。

    // 这个方法遍历 ArrarList,打印其中每个元素的班级
    public static void showClass(ArrayList<? extends Student> al){
        for (Student s : al) {
            System.out.println(s.getBanji());
        }
    }

    // 方法遍历 ArrayList, 打印其中每个元素的 姓名
    public static void showName(ArrayList<? extends Person > al){
        for (Person p : al) {
            System.out.println(p.getName());
        }
    }


    public static void main(String[] args) {

        ArrayList<Student> al1 = new ArrayList<>();

        al1.add(new Student("张三",15,"H5"));
        al1.add(new Student("李四",10,"大数据"));
        al1.add(new Student("王五",24,"UI"));

        ArrayList<Teacher> al2 = new ArrayList<>();

        al2.add(new Teacher("张老师",15));
        al2.add(new Teacher("李老师",10));
        al2.add(new Teacher("王老师",24));

        ArrayList<Person> al3 = new ArrayList<>();

        al3.add(new Person("亚当",15));
        al3.add(new Person("夏娃",10));
        al3.add(new Person("苹果",24));

        showName(al1);
        showName(al2);
        showName(al3);

    }
}
