package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/User")
    @ResponseBody
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
}
