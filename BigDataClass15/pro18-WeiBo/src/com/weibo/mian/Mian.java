package com.weibo.mian;

import com.weibo.bean.Posts;
import com.weibo.bean.User;
import com.weibo.dao.LikesDao;
import com.weibo.dao.impl.ConcernDaoImpl;
import com.weibo.dao.impl.LikesDaoImpl;
import com.weibo.dao.impl.PostsDaoImpl;
import com.weibo.utils.FarmatPrint;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Mian {

    // 记录当前登录用户
    private static User user;

    // 打印指定帖子
    public static void showPosts(Posts p){
        FarmatPrint.printPosts(p);
        Scanner sc = new Scanner(System.in);
        SHOW:while (true){
            System.out.println("1.点赞；2.关注作者；3.返回上一级");
            System.out.println("请输入序号：");
            int i = sc.nextInt();
            switch (i){
                case 1:
                    boolean b = new LikesDaoImpl().addLike(user.getId(), p.getId());
                    if (b){
                        System.out.println("点赞成功！");
                    }else{
                        System.out.println("您已给该帖子点过赞！");
                    }
                    break;
                case 2:
                    boolean b1 = new ConcernDaoImpl().addConcern(p.getU_id(), user.getId());
                    if (b1){
                        System.out.println("关注成功！");
                    }else{
                        System.out.println("您已关注该作者！");
                    }
                    break;
                case 3:
                    break SHOW;
            }
        }
    }

    public static void showConcern(){
        ConcernDaoImpl concernDao = new ConcernDaoImpl();
        FarmatPrint.printTitle("关注列表");
        List<User> allConcernUser = concernDao.getAllConcernUser(user.getId());

    }

    public static void showWeiBo(){
        PostsDaoImpl postsDao = new PostsDaoImpl();
        FarmatPrint.printTitle("weibo热榜");
        int page = 0;
        int pageLen = 10;

        // 先查询前十条帖子并打印
        List<Posts> posts = postsDao.getPosts(page, pageLen);
        FarmatPrint.printPage(posts,page,pageLen);

        Scanner sc = new Scanner(System.in);
        SHOW:while (true){
            System.out.println("1.下一页；2.跳转指定页；3.查看序号帖子；4.返回上一级");
            System.out.println("请输入序号：");
            int i = sc.nextInt();
            switch (i){
                case 1:
                    page++;
                    posts = postsDao.getPosts(page, pageLen);
                    FarmatPrint.printPage(posts,page,pageLen);
                    break ;
                case 2:
                    System.out.println("请输入要跳转到的页数：");
                    int p = sc.nextInt();
                    page = p-1;
                    posts = postsDao.getPosts(page, pageLen);
                    FarmatPrint.printPage(posts,page,pageLen);
                    break ;
                case 3:
                    System.out.println("请输入帖子序号：");
                    int i1 = sc.nextInt();
                    while (i1>posts.size() || i1 < 1){
                        System.out.println("超出范围！");
                        System.out.println("请重新输入帖子序号：");
                        i1 = sc.nextInt();
                    }
                    Posts posts1 = posts.get(i1 - page * pageLen - 1);
                    showPosts(posts1);
                    break ;
                case 4:
                    break SHOW;
            }
        }

    }

    public static void writeWeiBo(){

    }

    public static void printMenu(){
        FarmatPrint.printTitle("欢迎您："+user.getName());
        System.out.println("菜单：");
        System.out.println("1.查看weibo热榜");
        System.out.println("2.查看已关注");
        System.out.println("3.写weibo");
        System.out.println("4.管理weibo");
        System.out.println("5.退出weibo");
        FarmatPrint.printEnd();
    }

    public static void run(){
        RUN:while (true){
            printMenu();
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入序号：");
            int i = sc.nextInt();
            switch (i){
                case 1:
                    showWeiBo();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("bye~");
                    break RUN;
            }
        }
    }

    public static void start(){
        FarmatPrint.printTitle("欢迎使用weibo！");
        Scanner sc = new Scanner(System.in);
        Loing:while (true){
            System.out.println("1.登录账号");
            System.out.println("2.注册账号");
            System.out.println("3.退出weibo");

            System.out.println("请输入序号：");
            int i = sc.nextInt();
            switch (i){
                case 1:
                    User login = Login.login();
                    if (login != null){
                        user = login;
                        break Loing;
                    }
                    break;
                case 2:
                    User regist = Login.regist();
                    if (regist != null){
                        user = regist;
                        break Loing;
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("请输入正确序号！");
                    break;
            }
        }

        run();
    }

    public static void main(String[] args) {
        start();
    }
}
