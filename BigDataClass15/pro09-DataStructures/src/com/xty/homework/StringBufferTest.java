package com.xty.homework;

import com.xty.homework.impl.MyStringBuffer;

public class StringBufferTest {
    public static void main(String[] args) {

        MyStringBuffer myStringBuffer = new MyStringBuffer("123456789");
        myStringBuffer.delete(6,9);
        System.out.println(myStringBuffer);

    }
}
