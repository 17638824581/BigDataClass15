package com.dahua.classLoader;

import com.dahua.student.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test {

    // 想要写一个方法，返回一个学生对象
    public static Student getStudent(){
        return new Student();
    }

    // 想要写一个方法，返回任意类的对象
    public static <T> T getObject(Class<T> c) throws NoSuchMethodException, InstantiationException, IllegalAccessException {
        // 通过反射，创建出这个类的对象并返回
        Constructor con = c.getDeclaredConstructor();
        con.setAccessible(true);
        Object o = c.newInstance();
        return (T) o;
    }

    public static Object getObject(String name) throws NoSuchMethodException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        // 通过反射，创建出这个类的对象并返回
        Class<?> aClass = Class.forName(name);
        Constructor con = aClass.getDeclaredConstructor();
        con.setAccessible(true);
        Object o = aClass.newInstance();
        return o;
    }

    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, ClassNotFoundException, InvocationTargetException {
//        Student object = getObject(Student.class);
//        String object1 = getObject(String.class);
//        ArrayList object2 = getObject(ArrayList.class);


        // 通过反射越过泛型检查
        ArrayList<Integer> al = new ArrayList<>();

//        al.add(12.0);

        // 获取 add() 方法
        Method add = al.getClass().getDeclaredMethod("add", Object.class);
        add.setAccessible(true);
        add.invoke(al,12.0);
        add.invoke(al,88.5);
        add.invoke(al,66.6);
        add.invoke(al,12.3);

        System.out.println(al);
    }
}
