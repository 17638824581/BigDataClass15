package com.xty.dao;

import com.xty.dao.impl.StudentDaoImpl;
import org.junit.Test;

public class StudentDaoTest {

    @Test
    public void testSelectAll(){
        StudentDaoImpl studentDao = new StudentDaoImpl();

        studentDao.SeelectAl();
    }
}
