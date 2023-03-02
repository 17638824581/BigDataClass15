package com.dahua.link.impl;

import com.dahua.link.Link;

public class LinkImpl2<E> implements Link {


    @Override
    public void add(int data) {

    }

    @Override
    public boolean add(int index, int data) {
        return false;
    }

    @Override
    public int get(int index) {
        return 0;
    }


    @Override
    public int findValue(int data) {
        return 0;
    }

    @Override
    public boolean update(int index, int data) {
        return false;
    }


    /**
     * 按照索引删除元素
     *
     * @param index : 索引位
     * @return boolean: 更新是否成功，若返回 false 就是因为索引越界。
     * @author Mr.yu
     * @date 2022/10/28 15:14
     */
    @Override
    public boolean delete(int index) {
        return false;
    }

    /**
     * 获取链表长度
     *
     * @return int：返回当前链表的长度
     * @author Mr.yu
     * @date 2022/10/28 15:15
     */
    @Override
    public int size() {
        return 0;
    }
}
