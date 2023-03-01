package com.dahua.dao;

import com.dahua.bean.Book;
import com.dahua.dao.impl.BookDaoImpl;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BookDaoTest {

    private static BookDao bookDao = new BookDaoImpl();

    @Test
    public void selectAll() {
        List<Book> books = bookDao.selectAll();
        System.out.println(books);
    }

    @Test
    public void selectById() {
        int id = 1;
        Book book = bookDao.selectById(id);
        System.out.println("book = " + book);
    }

    @Test
    public void selectByAuthor() {
        String author = "陈";
        List<Book> books = bookDao.selectByAuthor(author);
        System.out.println("books = " + books);
    }

    @Test
    public void selectByTitle() {
        String title = "三国";
        List<Book> books = bookDao.selectByTitle(title);
        System.out.println("books = " + books);
    }

    @Test
    public void selectByType() {
        String type = "历史";
        List<Book> books = bookDao.selectByType(type);
        System.out.println("books = " + books);
    }

    @Test
    public void add() {
        Book book = new Book();
        book.setTitle("红楼梦");
        book.setAuthor("曹雪芹");
        book.setType("经典/名著/言情");
        book.setPrice(88.8);

        int add = bookDao.add(book);
        System.out.println("add = " + add);
    }

    @Test
    public void deleteById() {
        int id = 1;
        int i = bookDao.deleteById(id);
        System.out.println("i = " + i);
    }

    @Test
    public void update() {
        int id = 2;
        Book book = bookDao.selectById(id);
        book.setTitle("三国志");
        book.setAuthor("陈寿");
        book.setType("历史/名著/经典");
        book.setPrice(1001.0);

        int update = bookDao.update(id, book);
        System.out.println("update = " + update);
    }

    @Test
    public void selectByTotal(){
        int i = bookDao.selectByTotal();
        System.out.println("i = " + i);
    }
}