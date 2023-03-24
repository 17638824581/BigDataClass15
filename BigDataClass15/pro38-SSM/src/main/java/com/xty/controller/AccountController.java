package com.xty.controller;

import com.xty.pojo.Account;
import com.xty.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/")
    public ModelAndView selectAll(ModelAndView mv){
        // 查询所有账户信息
        List<Account> all = accountService.findAll();

        mv.addObject("accounts",all);
        mv.setViewName("index");

        return mv;
    }

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Account> getAll(){
        // 查询所有账户信息
        List<Account> all = accountService.findAll();
        return all;
    }

    @RequestMapping("/delete")
    public String deleteById(int id){
        accountService.deleteAccount(id);
        return "redirect:/";
    }

    @RequestMapping("/add")
    public String add(Account account){
        accountService.saveAccount(account);

        return "redirect:/";
    }

    @RequestMapping("/transfer")
    public String transfer(String outName,String inName, double money){
        accountService.transfer(outName,inName,money);
        return "redirect:/";
    }

}
