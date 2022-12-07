package com.weibo.mian;

import com.weibo.bean.User;
import com.weibo.dao.impl.UserDaoImpl;
import com.weibo.utils.FarmatPrint;

import java.util.Scanner;

public class Login {

    // 登录，返回登录成功的用户
    public static User login(){
        FarmatPrint.printTitle("登录");
        Scanner sc = new Scanner(System.in);
        UserDaoImpl userDao = new UserDaoImpl();

        System.out.println("请输入账号：");
        String uname = sc.next();

        if (userDao.isExists(uname)){
            User user = userDao.getUser(uname);
            for (int i = 0; i < 3; i++) {
                System.out.println("请输入密码：");
                String psd = sc.next();
                // 验证密码
                if (user.getPassword().equals(psd)){
                    System.out.println("登录成功！");
                    FarmatPrint.printEnd();
                    return user;
                }else {
                    System.out.println("账号或密码错误，请重试！");
                }
            }
        }else {
            System.out.println("此账号不存在！");
            return null;
        }

        return null;
    }

    // 注册，返回注册成功的用户
    public static User regist(){
        FarmatPrint.printTitle("注册用户");
        Scanner sc = new Scanner(System.in);
        UserDaoImpl userDao = new UserDaoImpl();

        System.out.println("请输入账号：");
        String uname = sc.next();

        // 验证重复账号
        while(userDao.isExists(uname)){
            System.out.println("此账号已存在，请输入一个新的账号。");
            uname = sc.next();
        }

        System.out.println("请输入密码：");
        String psd1 = sc.next();
        System.out.println("请再次输入密码：");
        String psd2 = sc.next();

        // 两次确认密码
        while (!psd1.equals(psd2)){
            System.out.println("两次密码不一致，请重新输入！");
            System.out.println("请输入密码：");
            psd1 = sc.next();
            System.out.println("请再次输入密码：");
            psd2 = sc.next();
        }

        // 输入用户名
        System.out.println("请输入您的账户昵称：");
        String name = sc.next();

        // 将用户信息添加至数据库
        boolean b = userDao.addUser(new User(uname,psd2,name));

        if (b){
            System.out.println("注册成功！");
            User user = userDao.getUser(uname);
            System.out.println("请牢记您的账号和密码！");
            System.out.println("您的账号："+user.getUsername());
            System.out.println("您的密码："+user.getPassword());
            FarmatPrint.printEnd();
            return user;
        }

        return null;
    }
}
