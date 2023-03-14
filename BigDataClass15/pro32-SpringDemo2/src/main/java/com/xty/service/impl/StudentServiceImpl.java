package com.xty.service.impl;

import com.xty.dao.StudentDao;
import com.xty.dao.impl.StudentDaoImpl;
import com.xty.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
