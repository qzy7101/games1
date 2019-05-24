package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
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

    @RequestMapping("/adduser")
    @ResponseBody
    public int adduser(User user){
        user.setUname("313214");
        user.setUpass("231412");
        user.setEmail("2144214");
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
