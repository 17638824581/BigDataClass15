package com.weibo.utils;

import com.weibo.bean.Posts;
import com.weibo.bean.User;
import com.weibo.dao.impl.UserDaoImpl;

import java.util.List;

public class FarmatPrint {

    public static void printTitle(String title){
        System.out.println("---------- "+title+" ----------");
    }

    public static void printEnd(){
        System.out.println("============================");
    }

    public static void printPage(List<Posts> posts, int page, int page_len){
        UserDaoImpl userDao = new UserDaoImpl();
        printTitle("第 "+(page+1)+" 页");
        System.out.println("序号\t\t标题\t\t作者\t\t点赞\t\t时间");
        for (int i = 0; i < posts.size(); i++) {
            Posts p = posts.get(i);
            User user = userDao.getUser(p.getU_id());
            System.out.println((page*page_len+i+1)+"\t\t"+p.getTitle()+"\t\t"+user.getName()+"\t\t"+p.getLike()+"\t\t"+p.getDate());
        }
        printEnd();
    }

    public static void printPosts(Posts p){
        printTitle(p.getTitle());
        System.out.println("正文：");
        System.out.println();
        System.out.print("    "+p.getBody());
        System.out.println();
        System.out.println();
        User user = new UserDaoImpl().getUser(p.getU_id());
        System.out.println("作者："+user.getName());
        System.out.println("点赞："+p.getLike());
        System.out.println("日期："+p.getDate());
        printTitle("end");
    }
}
