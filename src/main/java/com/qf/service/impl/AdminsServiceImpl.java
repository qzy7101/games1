package com.qf.service.impl;

import com.qf.mapper.AdminsMapper;
import com.qf.pojo.Admins;
import com.qf.service.AdminsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminsServiceImpl implements AdminsService {

    @Autowired
    private AdminsMapper adminsMapper;

    @Override
    public Admins login(String admin) {
        return adminsMapper.login(admin);
    }

    @Override
    public void upadmin(Admins admins) {
        adminsMapper.upadmin(admins);
    }
}
