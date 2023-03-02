package com.dahua.service;

import com.dahua.bean.User;
import com.dahua.dao.impl.UserDaoImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 针对于 user 表的服务类
 *
 * @author Mr.yu
 * @date 2023/2/20 17:02
 */
public class UserService {

    /**
     * 注册用户服务
     *
     * @return boolean
     * @author Mr.yu
     * @date 2023/2/20 17:04
     */
    public void register(HttpServletRequest request, HttpServletResponse response) {
        // 1. 接收参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String repassword = request.getParameter("repassword");
        String email = request.getParameter("email");
        String auth_code = request.getParameter("auth_code");


        // 2. 将所有数据提前存到 request 域中
        request.setAttribute("username", username);
        request.setAttribute("password", password);
        request.setAttribute("repassword", repassword);
        request.setAttribute("email", email);

        // 2. 验证验证码
        if (auth_code.toLowerCase().equals("3n3d")) {

            // 3. 验证两次密码
            if (!password.equals(repassword)) {
                // 验证码错误
                // 将错误信息存入 requset 域中，再将请求转发至注册页面
                request.removeAttribute("password");
                request.removeAttribute("repassword");
                try {
                    request.getRequestDispatcher("/regist.jsp").forward(request, response);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            // 4. 验证邮箱和用户名是否重复

            UserDaoImpl userDao = new UserDaoImpl();
            // 验证用户名是否重复
            if (userDao.selectByUsername(username) != null) {
                request.setAttribute("msg", "用户名重复，请更换新用户名！");
                request.removeAttribute("username");

                try {
                    request.getRequestDispatcher("/regist.jsp").forward(request, response);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            // 验证邮箱是否重复
            if (userDao.selectByEamil(email) != null) {
                request.setAttribute("msg", "此邮箱已被使用！");
                request.removeAttribute("email");
                try {
                    request.getRequestDispatcher("/regist.jsp").forward(request, response);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            // 5. 所有验证通过，注册用户
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            user.setEmail(email);
            int add = userDao.add(user);

            if (add == 1) {
                // 用户注册成功，跳转到登陆页面
                try {
                    // 将账号信息存入 request 域中
                    request.setAttribute("username",username);
                    // 请求转发到 登录页面，登录页面可以获取到 账号
                    request.getRequestDispatcher("/login.jsp").forward(request,response);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else {
                // 数据库错误，用户注册失败
                request.setAttribute("msg", "服务器异常，用户注册失败！");
                try {
                    request.getRequestDispatcher("/regist.jsp").forward(request, response);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        } else {
            // 验证码错误
            // 保留用户的其他信息
            // 将错误信息存入 requset 域中，再将请求转发至注册页面
            request.setAttribute("msg", "验证码错误");

            try {
                request.getRequestDispatcher("/regist.jsp").forward(request, response);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 获取所有用户信息
     */
    public List<User> getAllUser() {
        UserDaoImpl userDao = new UserDaoImpl();
        List<User> users = userDao.sllectAll();
        return users;
    }

    /*
     *  处理用户登录的业务方法
     * */
    public User login(String username, String password) {
        // 2. 验证用户名是否存在
        UserDaoImpl userDao = new UserDaoImpl();
        // 根据用户名查询用户数据
        User user = userDao.selectByUsername(username);
        // 如果为空，则表示用户不存在
        if (user != null) {
            // 3. 验证密码是否正确
            if (password.equals(user.getPassword())) {
                // 密码一致，登录成功，返回用户对象
                return user;
            }
            return null;
        } else {
            // 用户不存在
            return null;
        }
    }
}
