package com.xty.link;

import com.xty.link.impl.LinkImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class LinkTest {

    @Test
    public void add() {
        Link l = new LinkImpl();
        l.add(88);
        l.add(99);
        l.add(100);
        // 通过断言看测试是否通过
        int expect = 100;
        int actual = l.get(2);

        assertEquals("元素添加顺序不一致",expect,actual);
    }

    @Test
    public void add2(){
        // 测试 插入元素到指定位置

        LinkImpl link = new LinkImpl();

        link.add(10);
        link.add(20);
        link.add(30);
        link.add(40);

        boolean add = link.add(0, 50);
        assertEquals("插入元素到开头元素值应为50",50,link.get(0));
        assertEquals("插入元素之后，长度应该+1",5,link.size());
    }

    @Test
    public void get() {
        LinkImpl l = new LinkImpl();
        l.add(15);
        l.add(30);
        l.add(80);
        System.out.println(l.get(2));
    }

    @Test
    public void findValue() {
        LinkImpl link = new LinkImpl();
        link.add(10);
        link.add(20);
        link.add(30);

        // 找第一个元素
        int expect = 0;
        int actual = link.findValue(10);

        assertEquals("第一个元素索引错误",expect,actual);

        // 找最后的元素
        expect = link.size()-1;
        actual = link.findValue(30);

        assertEquals("最后一个元素索引错误",expect,actual);

        // 找不存在的元素
        expect = -1;
        actual = link.findValue(40);

        assertEquals("未找到元素时索引错误",expect,actual);
    }

    @Test
    public void update() {
        LinkImpl link = new LinkImpl();

        link.add(10);
        link.add(20);
        link.add(30);
        link.add(40);

        boolean update = link.update(5, 55);
        assertFalse("对不存在的元素修改结果应该为false",update);

        boolean update1 = link.update(1, 80);
        assertFalse("修改成功结果应该为true",!update1);

        int expect = 80;
        int actual = link.get(1);
        assertEquals("修改元素之后元素值应该为80",expect,actual);
    }

    @Test
    public void delete() {
        LinkImpl link = new LinkImpl();
        link.add(10);
        link.add(20);
        link.add(30);
        link.add(40);

        boolean delete = link.delete(0);

        int expectLength = 3;
        int actualLength  = link.size();

        assertEquals("删除之后长度是否减一",expectLength,actualLength);
    }

    @Test
    public void size() {
        LinkImpl link = new LinkImpl();
        int expectLength = 0;
        int actualLength = link.size();
        // 断言预期长度和实际长度是否一致
        assertEquals("空链表预期长度和实际长度不一致", expectLength, actualLength);

        link.add(10);
        System.out.println(link.size());
        // 我们需要通过一种  自动判断测试是否成功  的机制
        // 断言机制：在执行测试之后，对测试的 预期结果 和 实际运行结果 进行对比，断言测试是否通过。

    }
}