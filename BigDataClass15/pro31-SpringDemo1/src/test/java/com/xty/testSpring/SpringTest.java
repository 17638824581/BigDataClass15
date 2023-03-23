package com.xty.testSpring;

import com.xty.mapper.UserDao;
import com.xty.factory.UserDaoFactory;
import com.xty.pojo.Person;
import com.xty.pojo.Student;
import com.xty.pojo.Teacher;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void test1(){
        // 先创建 Spring 容器
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("Spring容器创建完毕");

        // 我要从 容器中 获取 Student 对象
        Student student1 = (Student) app.getBean("student");
        Student student2 = (Student) app.getBean("student");
        Student student3 = (Student) app.getBean("student");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        // Spring容器中的对象，是在 容器被销毁的时候销毁
    }

    @Test
    public void test2(){
        // 通过工厂类获取对象
//        UserDao userDao = UserDaoFactory.getUserDao();

        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 通过Spring容器获取 UserDao 对象
        UserDao userDao = (UserDao) app.getBean("userDao");

        userDao.addUser();

    }

    @Test
    public void tese3(){

        // 注入：对象的给属性赋值

        // 手动 new  Student 对象
//        Student student = new Student();
//        // 手动为属性赋值
//        student.setName("张三");
//        System.out.println("student = " + student);


        // 通过 Spring 获取 Student 对象
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) app.getBean("student");
        System.out.println("student = " + student);

        // 想要让 Spring 自动给对象的属性 注入属性值
        // 依赖注入

        // 通过 Spring 获取 Teacher 对象
        Teacher teacher = (Teacher) app.getBean("teacher");

        System.out.println("teacher = " + teacher);
    }

    @Test
    public void test4(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) app.getBean("person");

        System.out.println("person = " + person);
    }
}
