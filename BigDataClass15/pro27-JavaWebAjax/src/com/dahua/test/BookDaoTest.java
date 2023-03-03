package com.dahua.test;

import com.dahua.bean.Book;
import com.dahua.dao.BookDao;
import com.dahua.dao.impl.BookDaoImpl;
import org.junit.Test;

import java.util.List;

public class BookDaoTest {

    @Test
    public void testBatchAdd(){
        BookDao bookDao = new BookDaoImpl();
        for (int i = 0; i < 100; i++) {
            Book book = new Book();

            book.setTitle("书名"+i);
            book.setAuthor("作者"+i);
            book.setType("类型"+i);
            book.setPrice((double) i);

            bookDao.add(book);
        }
    }

    // 测试 BookDao 的批量删除
    @Test
    public void testBatchDelte(){
        BookDao bookDao = new BookDaoImpl();
        int i = bookDao.batchDelte(new int[]{43, 47, 49, 50});

        System.out.println("i = " + i);

    }

    // 测试分页查询
    @Test
    public void testSelectBylimit(){
        BookDao bookDao = new BookDaoImpl();
        List<Book> books = bookDao.selectBylimit(0, 10);
        System.out.println("books = " + books);
    }

    // 测试分页条件查询
    @Test
    public void testselectByConditionAndLimit(){
        BookDao bookDao = new BookDaoImpl();
        String title = null;
        String author = null;
        String type = null;
        Double minPrice = null;
        Double maxPrice = null;
        int begin = 0;
        int size = 10;


        List<Book> books = bookDao.selectByConditionAndLimit(title, author, type, minPrice, maxPrice, begin, size);

        System.out.println("books = " + books);
    }

}
