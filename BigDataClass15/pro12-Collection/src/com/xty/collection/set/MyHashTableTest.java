package com.xty.collection.set;

public class MyHashTableTest {
    public static void main(String[] args) {

        MyHashTable mht = new MyHashTableImpl(10);

        mht.add("张三");
        mht.add("李四");
        mht.add("王五");
        mht.add("赵六");
        mht.add("赵六");
        mht.add("田七");
        mht.add("王八");
        mht.add("老九");
        mht.add("猪八戒");
        mht.add("孙悟空");
        mht.add("沙悟净");
        mht.add("唐僧");
        mht.add("白龙马");
        mht.add("白骨精");
        mht.add(String.valueOf((char)61));

        System.out.println(mht);

        mht.remove("猪八戒");

        System.out.println(mht);
    }
}
