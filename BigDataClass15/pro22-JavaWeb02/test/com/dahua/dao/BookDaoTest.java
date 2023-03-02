package com.dahua.dao;

import com.dahua.bean.Book;
import com.dahua.dao.impl.BookDaoImpl;
import org.junit.Test;

/*
*  BookDao 接口的测试类
* */
public class BookDaoTest {

    @Test
    // 测试存入图片
    public void testAdd(){

        Book book = new Book();
        book.setTitle("测试");
        book.setAuthor("吴承恩");
        book.setPrice(99.9);
        book.setCount(1000);
        book.setSales(100);
//        book.setPricture("F:\\Code\\Java\\github\\BigDataClass15\\pro22-JavaWeb02\\web\\imgs\\logo.jpg");

        BookDaoImpl bookDao = new BookDaoImpl();

        bookDao.add(book);
    }

    @Test
    // 测试通过id查询图片
    public void testSelectById(){
        BookDaoImpl bookDao = new BookDaoImpl();
        Book book = bookDao.selectById(1);

        System.out.println(book);
        System.out.println(book.getPicture());
    }

}
