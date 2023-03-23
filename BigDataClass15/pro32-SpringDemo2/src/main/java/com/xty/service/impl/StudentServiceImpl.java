package com.xty.service.impl;

import com.xty.mapper.StudentDao;
import com.xty.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public void SelectAll() {
        studentDao.SeelectAl();
    }

}
