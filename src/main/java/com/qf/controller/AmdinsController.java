package com.qf.controller;

import com.qf.pojo.Admininfo;
import com.qf.pojo.Admins;
import com.qf.service.AdminsService;
import com.qf.service.AdminsinfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class AmdinsController {

    @Resource
    private AdminsService adminsService;

    @Resource
    private AdminsinfoService adminsinfoService;

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

    //根据admin查询个人信息
    @RequestMapping(value = "/gexx")
    @ResponseBody
    public List<Admininfo> gexx(@RequestParam String admin){

        return adminsinfoService.login(admin);
    }

    //修改个人信息
    @RequestMapping(value = "/adminupdata")
    @ResponseBody
    public int upadmininfo(@RequestBody Admininfo admininfo){

        System.out.println(admininfo.toString());
        adminsinfoService.upadmininfo(admininfo);
        return 1;
    }

    //修改admin密码
    @RequestMapping(value = "/adminpassword")
    @ResponseBody
    public int upadmin(@RequestParam String pass,@RequestParam String admin){

        Admins login = adminsService.login(admin);

        login.setPassword(pass);

        System.out.println(login);

        adminsService.upadmin(login);

        return 1;
    }
}
