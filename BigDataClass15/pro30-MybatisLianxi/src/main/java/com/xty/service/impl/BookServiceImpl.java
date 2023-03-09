package com.xty.service.impl;

import com.xty.mapper.BookMapper;
import com.xty.pojo.Book;
import com.xty.pojo.BookCondition;
import com.xty.pojo.LimitBook;
import com.xty.service.BookService;
import com.xty.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

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
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        boolean result = mapper.add(book);
        sqlSession.commit();
        sqlSession.close();

        return result;
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
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        newBook.setId(id);
        boolean result = mapper.update(newBook);

        sqlSession.commit();
        sqlSession.close();

        return result;
    }

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public List<Book> selectAll() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        List<Book> books = mapper.seleteAll();

        sqlSession.close();

        return books;
    }

    /**
     * 查询所有数据条数
     *
     * @return
     */
    @Override
    public int selectTotal() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        int totalCount = mapper.selectTotalCount();

        sqlSession.close();

        return totalCount;
    }

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @Override
    public Book selectById(int id) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        Book book = mapper.selectById(id);

        sqlSession.close();

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
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        boolean b = mapper.deleteById(id);

        sqlSession.commit();
        sqlSession.close();
        return b;
    }

    /**
     * 批量删除
     *
     * @param ids
     * @return
     */
    @Override
    public int batchDelete(int[] ids) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        int i = mapper.deleteByIds(ids);

        sqlSession.commit();
        sqlSession.close();
        return i;
    }

    /**
     * 分页查询
     *
     * @param currentPape ：当前第几页
     * @param pageSize    ：页面条目数
     * @return
     */
    @Override
    public List<Book> selectByLimit(int currentPape, int pageSize) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        BookCondition bookCondition = new BookCondition();

        int begin = (currentPape - 1) * pageSize;
        int size = pageSize;

        bookCondition.setBegin(begin);
        bookCondition.setSize(size);

        List<Book> books = mapper.selectByConditionAndLimit(bookCondition);

        sqlSession.close();
        return books;
    }

    @Override
    public LimitBook selectByConditionAndLimit(BookCondition condition) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        // 先去调整模糊查询的参数
        String title = condition.getTitle();
        String author = condition.getAuthor();
        String type = condition.getType();

        title = "%" + title + "%";
        author = "%" + author + "%";
        type = "%" + type + "%";

        condition.setTitle(title);
        condition.setAuthor(author);
        condition.setType(type);

        // 查询符合条件的分页数据
        List<Book> books = mapper.selectByConditionAndLimit(condition);
        // 查询符合条件的数据总数
        int total = mapper.selectConditionTotalConut(condition);

        LimitBook limitBook = new LimitBook();
        limitBook.setBooks(books);
        limitBook.setTotal(total);

        sqlSession.close();
        return limitBook;
    }
}
