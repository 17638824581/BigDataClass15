package com.dahua.homework;


/*
 * 好字符串的问题，如果一个字符串中没有三个连续且相同的字符，它就是好字符串
 * @author Mr.yu
 * @date 2022/10/17 10:40
 */
public class GoodString {
    
    /*
     * 将字符串变好
     * @param str: 要处理的字符串
     * @return String: 处理好的字符串
     * @author Mr.yu
     * @date 2022/10/17 10:58
     */
    public static String goodString(String str){
        StringBuilder sb = new StringBuilder(str);

        //处理 str 让它变好（删掉连续重复的字符，对多留两个）

        // 找出连续出现三次的字符
        for (int i = 0; i < sb.length()-2; i++) {
            char c1 = sb.charAt(i);
            char c2 = sb.charAt(i+1);
            char c3 = sb.charAt(i+2);

            // 如果 c1==c2==c3 说明这是三个连续且重复的字符
            if (c1==c2 && c1==c3){
                sb.deleteCharAt(i+2);
                i--;
            }
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        String str = "aaabaaaa";

        String s = goodString(str);

        System.out.println(s);


    }

}
