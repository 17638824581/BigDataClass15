package com.xty.dao;

import com.xty.service.impl.StudentServiceImpl;
import org.junit.Test;

public class StudentServiceTest {
    @Test
    public void testSelectAll() {
        StudentServiceImpl studentService = new StudentServiceImpl();
        studentService.SelectAll();
    }
}
