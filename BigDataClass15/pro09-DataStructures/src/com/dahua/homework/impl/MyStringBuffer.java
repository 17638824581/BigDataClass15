package com.dahua.homework.impl;

import com.dahua.homework.IStringBuffer;

import java.util.Arrays;

public class MyStringBuffer implements IStringBuffer {

    // 内部用来存储字符数据
    private char[] data;

    public MyStringBuffer() {
        data = new char[]{};
    }

    public MyStringBuffer(String str) {
        this.data = str.toCharArray();
    }


    /**
     * 追加字符
     *
     * @param c :
     * @return void
     * @author Mr.yu
     * @date 2022/11/1 9:09
     */
    @Override
    public void append(char c) {
        // 先扩充内部数组
        char[] newData = new char[data.length + 1];
        // 将就旧组中的数据复制到 newData中
        System.arraycopy(data,0,newData,0,data.length);
        // 将要追加的字符放到新数组最后位置
        newData[newData.length-1] = c;
        // 让新数组替换掉旧数组
        data = newData;
    }


    /**
     * 追加字符串
     *
     * @param str :
     * @return void
     * @author Mr.yu
     * @date 2022/11/1 9:08
     */
    @Override
    public void append(String str) {
        // 先将要追加的字符串转为字符数组
        char[] chars = str.toCharArray();

        // 扩充内部数组
        char[] newChars = new char[data.length + chars.length];

        // 将旧数组中的内容复制到 newChars中
        System.arraycopy(data,0,newChars,0,data.length);

        // 将 chars 中的内容 也 复制到 newChars 中
        System.arraycopy(chars,0,newChars,data.length,chars.length);

        // newChar 替换掉 data
        data = newChars;
    }

    /**
     * 指定位置插入字符
     *
     * @param pos :
     * @param b   :
     * @return void
     * @author Mr.yu
     * @date 2022/11/1 9:10
     */
    @Override
    public void insert(int pos, char b) {

        // 判断索引是否越界
        if (pos > data.length){
            System.out.println("插入索引越界！");
            return;
        }

        // 如果要插入的位置是整个数组的长度，则视为追加。
        if (pos == data.length){
            append(b);
            return;
        }

        // 1. 扩充内部数组
        char[] chars = new char[data.length + 1];
        // 2. 挪位置(在复制旧数组数据的时候就把位置空出来)
        System.arraycopy(data,0,chars,0,pos);
        System.arraycopy(data,pos,chars,pos+1,data.length-pos);
        // 3. 插字符
        chars[pos] = b;
        data = chars;
    }

    /**
     * 指定位置插入图字符串
     *
     * @param pos :
     * @param b   :
     * @return void
     * @author Mr.yu
     * @date 2022/11/1 9:10
     */
    @Override
    public void insert(int pos, String b) {
        // 判断索引是否越界
        if (pos > data.length){
            System.out.println("插入索引越界！");
            return;
        }

        // 如果要插入的位置是整个数组的长度，则视为追加。
        if (pos == data.length){
            append(b);
            return;
        }

        // 1. 扩充内部数组
        char[] newChars = new char[data.length + b.length()];

        // 2. 挪位置(在复制旧数组数据的时候就把位置空出来)
        System.arraycopy(data,0,newChars,0,pos);
        System.arraycopy(data,pos,newChars,pos+b.length(),data.length-pos);

        // 3. 插字符
        // 将要插入的字符串转为字符数组
        char[] chars = b.toCharArray();
        // 将 chars 中的数据复制到 newChars中
        System.arraycopy(chars,0,newChars,pos,chars.length);

        data = newChars;
    }

    /**
     * 从开始位置，删除剩余的内容
     *
     * @param start :
     * @return void
     * @author Mr.yu
     * @date 2022/11/1 9:11
     */
    @Override
    public void delete(int start) {
        // 判断索引是否越界
        if (start >= data.length){
            System.out.println("删除失败，索引越界！");
            return;
        }

        char[] chars = Arrays.copyOfRange(data, 0, start);
        data = chars;
    }

    /**
     * 从开始位置删除到结束位置-1
     *
     * @param start :
     * @param end   :
     * @return void
     * @author Mr.yu
     * @date 2022/11/1 9:11
     */
    @Override
    public void delete(int start, int end) {

        // 判断索引是否越界
        if (start > end || start >= data.length || end > data.length || start < 0 ){
            System.out.println("删除失败，索引越界！");
            return;
        }

        // 如果end==data.length 就视为删到最后。
        if (end == data.length){
            delete(start);
            return;
        }

        // 1. 创建新数组，长度缩减
        char[] newChars = new char[data.length - (end - start)];
        // 2. 复制删除范围之前的元素到新数组
        System.arraycopy(data,0,newChars,0,start);
        // 3. 复制删除范围之后的元素到新数组
        System.arraycopy(data,end,newChars,start,newChars.length-start);
        // 4. 新数组替换掉旧数组
        data = newChars;
    }

    /**
     * 反转内容
     *
     * @return void
     * @author Mr.yu
     * @date 2022/11/1 9:12
     */
    @Override
    public void reverse() {
        char[] chars = new char[data.length];

        // 倒序遍历data中数据，再以正序存到 chars中
        for (int i = data.length-1; i >= 0 ; i--) {
            chars[(data.length-1)-i] = data[i];
        }

        data = chars;
    }

    /**
     * 返回长度
     *
     * @return int
     * @author Mr.yu
     * @date 2022/11/1 9:13
     */
    @Override
    public int length() {
        return data.length;
    }


    @Override
    public String toString() {

        if (data == null){
            return "";
        }

        // 将字符数组转为字符串
        return new String(data);
    }
}
