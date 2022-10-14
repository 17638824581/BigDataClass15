package com.dahua.String;

public class StringReplace {

    // 替换字符串中所有自定的字符为新的字符
    // 需要有一个原字符串
    // 需要有一个 旧字符
    // 需要有一个 新字符
    // 使用 新字符 替换掉 原字符串中 所有的 旧字符，返回替换完成的新字符串
    public static String replace(String str, char oldchar, char newchar){
        String newstr = "";
        // 遍历原字符串
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // 看 c 是不是要替换掉的字符
            if (c == oldchar){
                newstr += newchar;
            }else{
                newstr += c;
            }
        }

        // 返回替换完成的新字符串
        return newstr;
    }


    public static void main(String[] args) {


    }
}
