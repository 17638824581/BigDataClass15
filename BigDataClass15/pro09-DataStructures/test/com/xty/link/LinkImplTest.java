package com.xty.link;


import com.xty.link.impl.LinkImpl;
import org.junit.Test;

import java.util.ArrayList;

public class LinkImplTest {

    @Test
    public void test(){

        // ArrayList 是列表
        // 插入操作
        ArrayList<Integer> arrayList = new ArrayList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 500000; i++) {
            arrayList.add(i);
        }

        long end = System.currentTimeMillis();

        System.out.println("列表添加500000个元素到尾部消耗的时间为"+(end-start)+"毫秒");
//        System.out.println("arrayList = " + arrayList);


        LinkImpl link = new LinkImpl();

        start = System.currentTimeMillis();

        for (int i = 0; i < 500000; i++) {
            link.add(i);
        }

        end = System.currentTimeMillis();

        System.out.println("链表添加500000个元素到尾部消耗的时间为"+(end-start)+"毫秒");
//        System.out.println("link = " + link);

    }
}
