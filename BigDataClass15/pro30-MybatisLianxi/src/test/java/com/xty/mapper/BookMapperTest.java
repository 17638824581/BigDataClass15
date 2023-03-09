package com.xty.mapper;

import com.xty.pojo.Book;
import com.xty.pojo.BookCondition;
import com.xty.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class BookMapperTest {
    @Test
    public void testAdd(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        Book book = new Book();
        book.setTitle("淘气包马小跳");
        book.setAuthor("马小跳");
        book.setPrice(19.8);
        book.setType("故事");

        mapper.add(book);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testDeleteById(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        boolean b = mapper.deleteById(117);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testUpdate(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        Book book = new Book();
        book.setId(116);
        book.setTitle("淘气包马小跳");
        book.setAuthor("马小跳");
        book.setPrice(19.8);
        book.setType("故事");

        mapper.update(book);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        List<Book> books = mapper.seleteAll();

        System.out.println("books = " + books);
        sqlSession.close();
    }

    @Test
    public void testSelectById(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        Book book = mapper.selectById(107);

        System.out.println("book = " + book);
        sqlSession.close();
    }

    @Test
    public void testDeleteByIds(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        int row = mapper.deleteByIds(new int[]{109, 112});

        System.out.println("row = " + row);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testSelectTotalCount(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        int totalCount = mapper.selectTotalCount();

        System.out.println("totalCount = " + totalCount);

        sqlSession.close();
    }

    @Test
    public void testSelectByConditionAndLimit(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        BookCondition bookCondition = new BookCondition();
        bookCondition.setTitle("%西%");
        bookCondition.setBegin(0);
        bookCondition.setSize(3);

        List<Book> books = mapper.selectByConditionAndLimit(bookCondition);

        System.out.println("books = " + books);

        sqlSession.close();
    }

    @Test
    public void testSelectConditionTotalConut(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        BookCondition bookCondition = new BookCondition();
        bookCondition.setTitle("%西%");

        int row = mapper.selectConditionTotalConut(bookCondition);

        System.out.println("row = " + row);

        sqlSession.close();
    }
}
