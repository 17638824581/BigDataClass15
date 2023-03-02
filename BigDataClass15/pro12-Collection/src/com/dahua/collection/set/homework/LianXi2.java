package com.dahua.collection.set.homework;

import java.util.HashSet;
import java.util.Random;

/**
 * 产生 10 个 1~20 之间的不重复随机整数
 * @author Mr.yu
 * @date 2022/11/8 11:02
 */
public class LianXi2 {
    public static void main(String[] args) {

        Random r = new Random();

        HashSet<Integer> hs = new HashSet<>();

        while (hs.size() < 10){
            int j = r.nextInt(20) + 1;
            hs.add(j);
        }

        System.out.println(hs);

    }
}
