package com.dahua.poly;

public class Test {

    // 喂食的方法
    public static void feed(Animal a){
        a.eat("食物");
    }

    // 让动物叫起来的方法
    // 接收一个动物对象，调用这个对象的 crow() 方法
    public static void crow(Animal s){
        s.crow();
    }

    // 让动物给孩子喂奶的方法
    public static void doNurse(Mammal a){
        a.nurse();
    }

    public static void main(String[] args) {

        Dog d = new Dog("大黄", 3, "黄色");
        Cat c = new Cat("小白", 2, "布偶猫");
        Pig p = new Pig("大壮", 3, 200);


        doNurse(d);

//        crow(d);
//        crow(c);
//        crow(p);



//        feed(dog);

        // 多态对象的转型
//        Animal a = new Cat("小白",2,"布偶猫");
//        a.eat("鱼");
//
//        // 2. 向下转型（将父类强转为子类）
//        Cat c = (Cat) a;
//
//        c.catchMouse();
//



//        Cat c = new Cat("小白",2,"布偶猫");
//
//        c.catchMouse();
//
//        // 1. 向上转型（子类转父类）
//        Animal a = c;
//
//        a.eat("鱼");







//        Pig p = new Pig("佩奇", 3, 200);
//        Dog d = new Dog("旺财",2,"黄色");
//        Cat c = new Cat("小白", 1, "波斯猫");
//
//        feed(p,"白菜");
//        feed(d,"骨头");
//        feed(c,"鱼");





        // 声明 Animal 型变量 a
//        Animal a;
//        // 给 a 变量赋值 Animal 对象
//        a = new Animal("大象",10);
//        // 通过 a 变量，访问 Animal 对象，调用它的 eat() 方法
//        a.eat("草");
//
//        // 声明 Cat 型变量 c
//        Cat c;
//        // 给变量 c 赋值 Cat 对象
//        c = new Cat("小蓝",2,"蓝猫");
//        // 通过变量 c 访问 Cat 对象，调用 catchMouse() 方法
//        c.catchMouse();

        // 多态机制，可以支持，父类类型的变量，保存子类类型的对象。

        // 声明一个 父类 Animal 类型的变量 a
//        Animal a;

        // 创建一个 子类 Cat 类的对象
//        a = new Cat("小白", 3, "布偶猫");

        // 父类变量，引用了子类对象， a 就是一个多态对象

        // 通过 a 变量，访问到 Cat 对象，调用它的 eat() 方法。
//        a.eat("石头");

        // a 表面上来看是 Animal 类型的，所以java限制 a 只能使用 Animal 类中有的内容
        // 但是由于子类可能会重写父类的方法，所以多态对象运行方法的时候，是按照子类重写的方法来运行的

        // 多态对象，运行方法时，看右边
        // 多态对象，访问属性时，看左边

        // 方法运行看右边，内容访问看左边

        // 编译看左边，运行看右边
    }
}
