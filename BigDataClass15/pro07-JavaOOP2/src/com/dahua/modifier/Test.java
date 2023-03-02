package com.dahua.modifier;

public class Test {

    // 私有的 private
    private String var1 = "private";

    // 默认的
    String var2 = "default";

    // 受保护的 protected
    protected String var3 = "protected";

    // 公开的 public
    public String var4 = "public";

    // 私有的成员方法
    private void method1(){
        System.out.println("private修饰的成员方法");
    }

    // 默认的成员方法
    void method2(){
        System.out.println("默认权限的成员方法");
    }

    // 受保护的的成员方法
    protected void method3(){
        System.out.println("受保护的成员方法");
    }

    // 公开的成员方法
    public void method4(){
        System.out.println("公开的成员方法");
    }

}