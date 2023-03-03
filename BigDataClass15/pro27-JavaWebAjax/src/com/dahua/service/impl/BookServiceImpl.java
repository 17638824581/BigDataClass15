package com.dahua.service.impl;

import com.dahua.bean.Book;
import com.dahua.bean.BookCondition;
import com.dahua.bean.LimitBook;
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
     * 查询所有数据条数
     *
     * @return
     */
    @Override
    public int selectTotal() {
        BookDao bookDao = new BookDaoImpl();
        int i = bookDao.selectByTotal();
        return i;
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

    @Override
    public int batchDelete(int[] ids) {
        BookDao bookDao = new BookDaoImpl();
        int i = bookDao.batchDelte(ids);
        return i;
    }

    /**
     * 分页查询
     * @param currentPape ：当前第几页
     * @param pageSize    ：页面条目数
     * @return
     */
    @Override
    public List<Book> selectByLimit(int currentPape, int pageSize) {
        // 计算 begin 和 size
        // begin = (当前页数 - 1) * 每页大小
        int begin = (currentPape - 1) * pageSize;
        int size = pageSize;

        BookDao bookDao = new BookDaoImpl();
        List<Book> books = bookDao.selectBylimit(begin, size);

        return books;
    }

    @Override
    public LimitBook selectByConditionAndLimit(BookCondition condition) {
        String title = condition.getTitle();
        String author = condition.getAuthor();
        String type = condition.getType();

        // 处理模糊查询
        title = "%" + title + "%";
        author = "%" + author + "%";
        type = "%" + type + "%";

        // 计算分页查询的参数
        int begin = (condition.getCurrentPage() - 1) * condition.getPageSize();
        int size = condition.getPageSize();

        BookDao bookDao = new BookDaoImpl();
        List<Book> books = bookDao.selectByConditionAndLimit(title, author, type, condition.getMinPrice(), condition.getMaxPrice(), begin, size);

        // 查询符合条件的数据总数
        long total = bookDao.selectByConditionTotal(title, author, type, condition.getMinPrice(), condition.getMaxPrice());

        LimitBook limitBook = new LimitBook();
        limitBook.setTotal((int) total);
        limitBook.setBooks(books);

        return limitBook;
    }
}
