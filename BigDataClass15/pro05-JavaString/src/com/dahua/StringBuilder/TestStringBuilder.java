package com.dahua.StringBuilder;

import java.util.LinkedList;
import java.util.Random;

public class TestStringBuilder {

    public static void speak(String name) {
        System.out.println("大家好,我叫" + name);
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);

            if (i != arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }


    public static void main(String[] args) {
        // StringBuilder 表示 可变字符串，可以通过 Stringbuilder 方便的改变字符串内容.


        // String 构造的字符串不可变
//        String str = new String("AABBCC");
//
//        // StringBuilder 构造的字符串可变
//        StringBuilder sb = new StringBuilder("AABBCC");
//
//
//        System.out.println(sb);
//        // 将 字符串 "ddee" 追加到 sb 后面
//        sb.append("ddee");
//        System.out.println(sb);
//
//
//        sb.insert(4,"aaaa");
//
//        System.out.println(sb);
//
//        sb.delete(0,4);
//
//        System.out.println(sb);
//        System.out.println(sb.length());
//
//
//        speak(sb.toString());
//
//
//        int[] a = {15,84,9,68,651,651,351,84,98};
//
//        String s = arrayToString(a);
//
//        System.out.println(s);


        // 使用 StringBuilder 的 reverse() 方法,来反转字符串

//        String str=  "abcde";
//
//        StringBuilder sb = new StringBuilder(str);
//
//        sb.reverse();
//
//        str = sb.toString();
//
//        System.out.println(str);
//
//        String s = "ASDADADAS";
//
//        System.out.println(s.toLowerCase());



        String s = "aabbbbccdcccdcceeeefeeee";

        String s1 = makeFancyString2(s);

        System.out.println(s1);

    }

    public static String[] getSortString(){
        String[] ss = new String[100];

        Random random = new Random();

        for (int i = 0; i < ss.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 20; j++) {
                int ran = random.nextInt(26) + 65;
                sb.append((char) ran);
            }
            ss[i] = sb.toString();
        }

        return ss;
    }


    public static String makeFancyString(String s) {

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length() - 2; i++) {
            char c1 = sb.charAt(i);
            char c2 = sb.charAt(i + 1);
            char c3 = sb.charAt(i + 2);
            if (c1 == c2 && c1 == c3) {
                sb.delete(i+2,i+2+1);
                i--;
            }
        }

        return sb.toString();
    }

    public static String makeFancyString2(String s) {

        class Node{
            char data;
            Node next;

            Node pre;

            public Node(char data) {
                this.data = data;
            }
        }

        class CharLink{
            int length;
            Node first;
            Node last;

            public void append(char c){
                Node node = new Node(c);
                if (this.length==0){
                    this.first = node;
                    this.last = node;
                }else{
                    node.pre = this.last;
                    this.last.next = node;
                    this.last = node;
                }
                this.length ++;
            }

            public String toString(){
                StringBuilder stringBuilder = new StringBuilder();
                Node n = this.first;
                while (n != null){
                    stringBuilder.append(n.data);
                    n = n.next;
                }
                return stringBuilder.toString();
            }

            public void printSelf(){
                Node node = this.first;
                System.out.print("[");
                while (node != null){
                    System.out.print(node.data+", ");
                    node = node.next;
                }
                System.out.println("]");
            }
        }


        CharLink charLink = new CharLink();

        for (int i = 0; i < s.length(); i++) {
            charLink.append(s.charAt(i));
        }

        Node n = charLink.first;
        while (n.next != null && n.next.next != null){
            if (n.data == n.next.data && n.data == n.next.next.data){
                n.next = n.next.next;
                charLink.length--;
            }else{
                n = n.next;
            }
        }

        return charLink.toString();
    }

    public String makeFancyString3(String s) {
        class Node{
            char data;
            Node next;

            Node pre;

            public Node(char data) {
                this.data = data;
            }
        }

        class CharLink{
            int length;
            Node first;
            Node last;

            public void append(char c){
                Node node = new Node(c);
                if (this.length==0){
                    this.first = node;
                    this.last = node;
                }else{
                    node.pre = this.last;
                    this.last.next = node;
                    this.last = node;
                }
                this.length ++;
            }

            public String toString(){

                char[] c = new char[this.length];

                int index = 0;
                Node n = this.first;
                while (n != null){
                    c[index] = n.data;
                    index ++;
                    n = n.next;
                }
                return new String(c);
            }

        }


        CharLink charLink = new CharLink();

        for (int i = 0; i < s.length(); i++) {
            charLink.append(s.charAt(i));
        }

        Node n = charLink.first;
        while (n.next != null && n.next.next != null){
            if (n.data == n.next.data && n.data == n.next.next.data){
                n.next = n.next.next;
                charLink.length--;
            }else{
                n = n.next;
            }
        }

        return charLink.toString();
    }
}
