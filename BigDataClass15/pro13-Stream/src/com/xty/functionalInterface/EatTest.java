package com.xty.functionalInterface;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.*;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class EatTest {

    // 让某个人吃饭
    public static void personEat(Person p, Eat e){
        e.eat(p,"饭");
    }

    // 指导某个人吃饭
    public static Eat getEat(){
        return (p,f)-> System.out.println(p.getName()+"应该用筷子吃"+f);
    }

    // 写一个内部类来实现 Eat 接口
    static class EatImpl implements Eat{
        @Override
        public void eat(Person p, String food) {
            System.out.println(p.getName()+"用筷子吃了"+food);
        }
    }

    public static void main(String[] args) {

//        ArrayList<String> al = new ArrayList<>();
//
//        al.add("张三");
//        al.add("李四");
//        al.add("王五");
//        al.add("赵六");

        // 随机整数流
//        Stream<Integer> generate = Stream.generate(new Supplier<Integer>() {
//            @Override
//            public Integer get() {
//                Random random = new Random();
//                return random.nextInt(11);
//            }
//        });

        // 随机的Double型流

//        ToDoubleFunction
//        generate.mapToDouble(i -> i / 2.0).forEach(System.out::println);

//        System.out.println(arr);


//        Person person = new Person("张三",30);
//
//        Eat eat = getEat();
//
//        // 传入一个 Eat 接口的对象
//        personEat(person, getEat());


        // 1. 写一个类实现 Eat 接口，可以传入 实现 Eat 接口的实现类对象。
//        personEat(person,new EatImpl());

        // 2. 使用匿名内部类，直接实现 Eat 中的所有抽象方法。
//        personEat(person, new Eat() {
//            @Override
//            public void eat(Person p, String food) {
//                System.out.println(p.getName()+"用叉子吃了"+food);
//            }
//        });

        // 3. 使用 Lambda 表达式重写 这个（函数式）接口中唯一的抽象方法。
//        personEat(person, (p,f) -> System.out.println(p.getName()+"用勺子吃了"+f));

        // 4. 使用 方法引用的方式，将指定的代码传递给（函数式）接口中需要重写的抽象方法。
//        personEat(person, EatTest::e);
    }


    public static void e(Person p, String f){
        System.out.println(p.getName()+"用手吃了"+f);
    }



}
