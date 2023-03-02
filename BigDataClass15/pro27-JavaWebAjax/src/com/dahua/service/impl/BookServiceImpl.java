package com.dahua.service.impl;

import com.dahua.bean.Book;
import com.dahua.dao.BookDao;
import com.dahua.dao.impl.BookDaoImpl;
import com.dahua.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {
    /**
     * 添加书籍
     *
     * @param book
     * @return
     */
    @Override
    public boolean add(Book book) {
        BookDao bookDao = new BookDaoImpl();
        int add = bookDao.add(book);
        return add == 1;
    }

    /**
     * 更新书籍
     *
     * @param id
     * @param newBook
     * @return
     */
    @Override
    public boolean update(int id, Book newBook) {
        BookDao bookDao = new BookDaoImpl();
        int add = bookDao.update(id,newBook);
        return add == 1;
    }

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public List<Book> selectAll() {
        BookDao bookDao = new BookDaoImpl();
        List<Book> books = bookDao.selectAll();
        return books;
    }

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @Override
    public Book selectById(int id) {
        BookDao bookDao = new BookDaoImpl();
        Book book = bookDao.selectById(id);
        return book;
    }

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    @Override
    public boolean deleteById(int id) {
        BookDao bookDao = new BookDaoImpl();
        int i = bookDao.deleteById(id);
        return i == 1;
    }
}
