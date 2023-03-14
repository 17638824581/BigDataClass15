package com.xty.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // 作用相当于 <bean id="dog" class="com.xty.annotation.Dog"></bean>
@Scope("prototype") // 作用相当于 <bean id="dog" class="com.xty.annotation.Dog" scope="singleton"></bean>
public class Dog {

    @Value("大黄")  // 作用相当于 <property name="name" value="大黄"/>
    private String name;

    @Value("6")
    private Integer age;

    private Person zhuren;

    public void cry(){
        System.out.println("狗的名字："+name);
        System.out.println("狗的年龄："+age);
        System.out.println("狗的主人："+zhuren);
    }

    // Dog对象初始化方法
    public void init(){
        System.out.println("狗子被初始化了！");
    }


    // Dog对象销毁方法
    public void destroy(){
        System.out.println("狗子被销毁了！");
    }
}
