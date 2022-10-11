package com.dahua.guoqing;

/*
*  打印如下图形：
*       a
*       bb
*       ccc
*       dddd
*       ...
* */
public class T3 {
    public static void main(String[] args) {

        char c = 'a';

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c);
            }
            c += 1;
            System.out.println();
        }
    }
}
