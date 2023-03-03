package com.dahua.service;

import com.dahua.bean.Book;
import com.dahua.bean.BookCondition;
import com.dahua.bean.LimitBook;

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
     * 查询所有数据条数
     * @return
     */
    int selectTotal();

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

    /**
     * 批量删除
     * @return
     */
    int batchDelete(int[] ids);

    /**
     * 分页查询
     * @param currentPape：当前第几页
     * @param pageSize：页面条目数
     * @return
     */
    List<Book> selectByLimit(int currentPape,int pageSize);


    /*
    *  分页条件查询
    * */
    LimitBook selectByConditionAndLimit(BookCondition condition);
}
