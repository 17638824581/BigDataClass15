package com.xty.MyArrayList;

// 测试 MyArrayList 类
public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList mal = new MyArrayList();

        mal.add(100);
        mal.add(200);
        mal.add(300);
        mal.add(400);


        for (Object i:mal) {
            System.out.println(i);
        }

//        for (int i = 0; i < mal.getSize(); i++) {
//            System.out.println("mal.get(i) = " + mal.get(i));
//        }

    }
}
