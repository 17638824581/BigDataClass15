package com.dahua.service;

import com.dahua.bean.Book;

import java.util.List;

public interface BookService {

    /**
     * 添加书籍
     * @param book
     * @return
     */
    boolean add(Book book);

    /**
     * 更新书籍
     * @param id
     * @param newBook
     * @return
     */
    boolean update(int id, Book newBook);

    /**
     * 查询所有
     * @return
     */
    List<Book> selectAll();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Book selectById(int id);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    boolean deleteById(int id);
}
