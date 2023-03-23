package com.xty.controller;

import com.xty.pojo.Account;
import com.xty.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/getAll")
    public ModelAndView selectAll(ModelAndView mv){
        // 查询所有账户信息
        List<Account> all = accountService.findAll();

        mv.addObject("accounts",all);
        mv.setViewName("/index.jsp");

        return mv;
    }
}
