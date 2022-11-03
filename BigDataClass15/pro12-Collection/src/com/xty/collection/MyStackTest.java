package com.xty.collection;

import java.util.Queue;

public class MyStackTest {
    public static void main(String[] args) {
        // 判断括号是否匹配
        String s = "{{{{{{{{{{}}}}}}}}}}";
        char[] chars = s.toCharArray();

        MyStack myStack = new MyStack();


        for (char c : chars) {
            // 1. 遇见左括号入栈
            if (c=='(' || c=='[' || c=='{'){
                myStack.push(String.valueOf(c));
            }else{
                String l = null;
                try {
                    l = myStack.pop();
                }catch (Exception e){
                    System.out.println("括号不匹配！");
                    break;
                }
                if (l.equals("(") && c == ')' || l.equals("[") && c == ']' || l.equals("{") && c=='}'){
                   continue;
                }else{
                    System.out.println("阔号不匹配！");
                    break;
                }
            }
        }


    }
}
