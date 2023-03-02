package com.dahua.classLoader;

import java.lang.reflect.*;

public class Mian {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException {
        // 创建一个Student对象,加载Student类，
        // 就会创建代表着该类的 java.lang.Class 类对象
//        Student stu1 = new Student("张三",18,"男");
//        Student stu2 = new Student("李四",20,"女");
//
//        // stu.getClass() 获取 Student 类的运行时类。
//        //  同一个类的不同对象调用getClass()方法获得到的 Class 对象是同一个
//
//        Class<? extends Student> c1 = stu1.getClass();
//        Class<Student> c2 = Student.class;
//
////        System.out.println(c1 == c2);
//
//        // 返回 c1 这个Class对象所代表的类的类名
//        System.out.println("c1.getName() = " + c1.getName());
//        System.out.println("c1.isArray() = " + c1.isArray());
//        System.out.println("c1.isEnum() = " + c1.isEnum());
//        System.out.println("c1.isInterface() = " + c1.isInterface());
//        System.out.println("c1.isInstance(stu2) = " + c1.isInstance(stu2));
//
//        // 类加载器：ClassLoader
//        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
//        ClassLoader platformClassLoader = ClassLoader.getPlatformClassLoader();

        // 有了类加载器，就可以指定的去加载一个类到内存中。

        // 拿到一个类的 Class 对象有什么用？
        // 有了一个类的 Class 对象，就可以通过 反射 随意 的操控这个类。
        // 操作  Student 类
        // 1. 拿到Student 类的 Class 对象
        //  1. 类名.class
//        Class<Student> c1 = Student.class;
//        //  2. 对象名.getClass()
//        Class<? extends Student> c2 = new Student().getClass();
        //  3. Class.forName("类的全名")
        Class<?> c3 = Class.forName("com.dahua.student.Student");

        // 就相当于掌握了这个类的所有信息，可以 随意 的操控这个类。
        // 一个类有什么？
        //  1. 类属性
        //  2. 类构造方法
        //  3. 类成员方法
        //  4. 类名
//        System.out.println("c3.getName() = " + c3.getName());
        //  5. 类继承
//        Class<?> superclass = c3.getSuperclass();
        //  6. 类实现
//        Class<?>[] interfaces = c3.getInterfaces();

        // 1. 创建这个类的对象
        Constructor<?> c = c3.getDeclaredConstructor();
        // 设置可强制访问
        c.setAccessible(true);
        // 使用这个构造方法创建一个对象
        Object o = c.newInstance();

        System.out.println(o);
        // 2. 操作这个类的任意属性
        // 通过反射设置属性 name
        Field name = c3.getDeclaredField("name");// 通过属性名获取该类属性
        name.setAccessible(true); // 设置属性可强制访问
        name.set(o,"张三");

        // 通过反射设置对象 o 的 age 属性
        Field age = c3.getDeclaredField("age");
        age.setAccessible(true);
        age.set(o,19);

        // 通过反射获取对象 o 的 sex 属性
        Field sex = c3.getDeclaredField("sex");
        sex.setAccessible(true);
        sex.set(o,"男生");
        System.out.println("sex.get(o) = " + sex.get(o));

        System.out.println(o);


        // 3. 随意使用类的任意方法
        Method speak = c3.getDeclaredMethod("speak");
        speak.setAccessible(true);
        speak.invoke(null);
    }
}
