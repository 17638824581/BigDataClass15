package com.xty.service;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    public void getAll(){
        System.out.println("getAll() 方法执行。。。。");
    }

    public int getTotal(){
        System.out.println("getTotal() 方法执行....");
        return 50;
    }

    public void deleteById(int id){
        System.out.println("deleteById() 方法执行。。。");
    }
}
