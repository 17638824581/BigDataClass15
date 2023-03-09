package com.xty.mapper;

import com.github.pagehelper.PageHelper;
import com.xty.pojo.Book;
import com.xty.pojo.BookCondition;
import com.xty.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.github.pagehelper.PageInfo;

import java.util.List;

public class BookMapperTest {
    @Test
    public void testAdd(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        Book book = new Book();
        book.setTitle("哈哈哈");
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


//        // 使用分页助手实现分页查询
//        PageHelper.startPage(2,6);

        List<Book> books = mapper.seleteAll();

        for (Book book : books) {
            System.out.println(book);
        }

        // 通过分页助手获取当前页面的相关属性
        PageInfo pageInfo = new PageInfo(books);
        int firstPage = pageInfo.getFirstPage();
        System.out.println("第一页："+firstPage);
        int lastPage = pageInfo.getLastPage();
        System.out.println("最后一页："+lastPage);
        int endRow = pageInfo.getEndRow();
        System.out.println("最后一行："+endRow);
        int nextPage = pageInfo.getNextPage();
        System.out.println("下一页："+nextPage);
        int pageSize = pageInfo.getPageSize();
        System.out.println("页面大小："+pageSize);
        long total = pageInfo.getTotal();
        System.out.println("数据总数："+total);
        List list = pageInfo.getList();
        System.out.println("当前页数据："+list);

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
