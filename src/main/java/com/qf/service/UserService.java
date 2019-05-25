package com.qf.service;

import com.qf.pojo.User;

import java.util.List;

public interface UserService {

    List<User>getAllUser();
    //uid查询
    User getuidAlluser(int uid);
    //增加
    void adduser(User user);
//    //删除
    void deluser(int uid);
//    //修改
    void upuser(User user);
    //登陆
    User login(String uname);
}
