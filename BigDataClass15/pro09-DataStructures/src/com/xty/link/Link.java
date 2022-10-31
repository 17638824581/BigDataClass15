package com.xty.link;

/**
 * 链表接口：就是用来规范 链表实现类的，我们可以现在接口中定义 链表实现类所需要具备的各种方法。
 * @author Mr.yu
 * @date 2022/10/28 14:59
 */
public interface Link {
    
    /**
     * 添加元素到尾部方法
     * @param data: 要添加到链表中的元素值
     * @return void
     * @author Mr.yu
     * @date 2022/10/28 15:05
     */
    void add(int data);

    /**
     * 添加元素到指定位置方法
     * @param data: 要添加到链表中的元素值
     * @param index: 要添加到链表中的索引位
     * @return boolean：添加是否成功
     * @author Mr.yu
     * @date 2022/10/28 15:05
     */
    boolean add(int index, int data);

    /**
     * 根据索引访问元素的方法
     * @param index: 索引位
     * @return int：找到的元素值
     * @author Mr.yu
     * @date 2022/10/28 15:07
     */
    int get(int index);

    /**
     * 根据元素值找元素位置，返回找到的索引
     * @param data: 要找的元素值
     * @return int：找到的元素值的索引位置，若没找到，返回-1
     * @author Mr.yu
     * @date 2022/10/28 15:09
     */
    int findValue(int data);

    /**
     * 更新指定索引位置的元素值
     * @param index: 索引位
     * @param data: 新的元素值
     * @return boolean: 更新是否成功，若返回 false 就是因为索引越界。
     * @author Mr.yu
     * @date 2022/10/28 15:13
     */
    boolean update(int index, int data);

    /**
     * 按照索引删除元素
     * @param index: 索引位
     * @return boolean: 更新是否成功，若返回 false 就是因为索引越界。
     * @author Mr.yu
     * @date 2022/10/28 15:14
     */
    boolean delete(int index);
    
    /**
     * 获取链表长度
     * @return int：返回当前链表的长度
     * @author Mr.yu
     * @date 2022/10/28 15:15
     */
    int size();
}
