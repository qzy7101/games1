package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @RequestMapping("/getuidAlluser")
    @ResponseBody
    public User getuidAlluser(int uid){
        uid = 1;
        return userService.getuidAlluser(uid);
    }


    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public int login(@RequestParam String uname, @RequestParam String upass){
        User user = userService.login(uname);
        if (upass.equals(user.getUpass())){
          return 1;
        }else {
            return 2;
        }
    }


    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody
    public int register(@RequestBody User user){
        userService.adduser(user);
        return 1;
    }

    @RequestMapping("/deluser")
    @ResponseBody
    public void deluser(Integer uid){
         uid = 1;
       userService.deluser(uid);
    }


    @RequestMapping("/upuser")
    @ResponseBody
    public int upuser(User user){
        user.setUid(2);
        user.setUname("xiugai");
        user.setUpass("312412");
        user.setEmail("47612376");
        userService.upuser(user);
        return 1;
    }



}
