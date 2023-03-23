package com.xty.mapper;

import com.xty.mapper.impl.StudentDaoImpl;
import org.junit.Test;

public class StudentDaoTest {

    @Test
    public void testSelectAll(){
        StudentDaoImpl studentDao = new StudentDaoImpl();

        studentDao.SeelectAl();
    }
}
