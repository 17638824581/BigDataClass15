package com.xty.service.impl;

import com.xty.service.StudentService;

public class StudentServiceImpl implements StudentService {
    @Override
    public void save() {
        System.out.println("save() 方法执行....");
    }

    @Override
    public void delete() {
        System.out.println("delete() 方法执行....");
    }
}
