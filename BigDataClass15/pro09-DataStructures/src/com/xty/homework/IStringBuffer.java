package com.xty.homework;

public interface IStringBuffer {
    /**
     * 追加字符串
     * @param str:
     * @return void
     * @author Mr.yu
     * @date 2022/11/1 9:08
     */
    void append(String str);
    
    /**
     * 追加字符
     * @param c: 
     * @return void
     * @author Mr.yu
     * @date 2022/11/1 9:09
     */
    void append(char c);

    /**
     * 指定位置插入字符
     * @param pos: 
     * @param b:
     * @return void
     * @author Mr.yu
     * @date 2022/11/1 9:10
     */
    void insert(int pos, char b);

    /**
     * 指定位置插入图字符串
     * @param pos: 
     * @param b:
     * @return void
     * @author Mr.yu
     * @date 2022/11/1 9:10
     */
    void insert(int pos, String b);


    /**
     * 从开始位置，删除剩余的内容
     * @param start:
     * @return void
     * @author Mr.yu
     * @date 2022/11/1 9:11
     */
    void delete(int start);

    
    /**
     * 从开始位置删除到结束位置-1
     * @param start: 
     * @param end: 
     * @return void
     * @author Mr.yu
     * @date 2022/11/1 9:11
     */
    void delete(int start, int end);
    
    /**
     * 反转内容
     * @param :
     * @return void
     * @author Mr.yu
     * @date 2022/11/1 9:12
     */
    void reverse();
    
    /**
     * 返回长度
     * @param : 
     * @return int
     * @author Mr.yu
     * @date 2022/11/1 9:13
     */
    int length();

}
