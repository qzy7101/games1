package com.qf.controller;

import com.qf.pojo.Admins;
import com.qf.service.AdminsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class AmdinsController {

    @Resource
    private AdminsService adminsService;

    //登陆
    @RequestMapping(value = "/adminlogin",method = RequestMethod.POST)
    @ResponseBody
    public int login(@RequestParam String admin, @RequestParam String upass){
        Admins login = adminsService.login(admin);
        if (login == null){
            return 3;
        }else if (upass.equals(login.getPassword())){
            return 1;
        }else {
            return 2;
        }

    }

}