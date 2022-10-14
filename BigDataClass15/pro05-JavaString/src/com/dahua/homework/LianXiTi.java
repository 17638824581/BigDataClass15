package com.dahua.homework;

public class LianXiTi {

    public static boolean isWebsite(String str){
        return str.startsWith("www") && str.endsWith(".com");
    }

    public static void main(String[] args) {

        String str1 = "www.baidu.com";
        String str2 = "baidu.com";
        String str3 = "www.baidu";


        boolean website = isWebsite(str1);

        boolean website1 = isWebsite(str2);

        boolean website2 = isWebsite(str3);

        System.out.println(str1+"是不是网址:"+website);
        System.out.println(str2+"是不是网址:"+website1);
        System.out.println(str3+"是不是网址:"+website2);


    }
}
