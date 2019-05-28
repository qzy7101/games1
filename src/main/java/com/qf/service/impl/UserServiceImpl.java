package com.qf.service.impl;

import com.qf.mapper.UserMapper;
import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public User getuidAlluser(int uid) {
        return userMapper.getuidAlluser(uid);
    }

    @Override
    public void adduser(User user) {
         userMapper.adduser(user);
    }

    @Override
    public void deluser(int uid) {
        userMapper.deluser(uid);
    }

    @Override
    public void upuser(User user) {
         userMapper.upuser(user);
    }

    @Override
    public User login(String uname) {
        return userMapper.login(uname);
    }

    @Override
    public User email(String email) {
        return null;
    }

}
