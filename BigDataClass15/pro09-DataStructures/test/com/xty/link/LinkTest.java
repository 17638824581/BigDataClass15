package com.xty.link;

import com.xty.link.impl.LinkImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkTest {

    @Test
    public void add() {
        // 针对于 add() 的测试代码
        Link link = new LinkImpl();

        link.add(10);
        link.add(20);
        link.add(30);

        System.out.println(link);

    }

    @Test
    public void get() {
    }

    @Test
    public void findValue() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void size() {
        LinkImpl link = new LinkImpl();

        link.add(10);
        link.add(10);
        link.add(10);

        System.out.println(link.size());
    }
}