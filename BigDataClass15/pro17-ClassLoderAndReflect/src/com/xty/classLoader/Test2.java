package com.xty.classLoader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 读取 在 properties 中的配置
        // 运行配置文件中指定的类的指定方法

        // 1.读取properties文件
        Properties pro = new Properties();
        InputStream ra = Test2.class.getResourceAsStream("config.properties");
        pro.load(ra);
        ra.close();

        System.out.println(pro);
        // 2.根据类名创建对象
        Class<?> clazz = Class.forName(pro.getProperty("className"));
        Constructor<?> con = clazz.getDeclaredConstructor();
        con.setAccessible(true);
        Object o = con.newInstance();
        System.out.println(o);

        // 3.根据方法名，获取方法对象
        Method method = clazz.getDeclaredMethod(pro.getProperty("methodName"));
        method.setAccessible(true);

        // 4.调用这个方法，将对象作为参数传入
        System.out.println("method.invoke(o) = " + method.invoke(o));
    }
}
