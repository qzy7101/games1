package com.qf.service.impl;

import com.qf.mapper.AdminsinfoMapper;
import com.qf.pojo.Admininfo;
import com.qf.pojo.Admins;
import com.qf.service.AdminsinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminsinfoServiceImpl implements AdminsinfoService {
    @Autowired
    private AdminsinfoMapper adminsinfoMapper;

    @Override
    public List<Admininfo> login(String admin) {
        return adminsinfoMapper.login(admin);
    }

    @Override
    public void upadmininfo(Admininfo admininfo) {
        adminsinfoMapper.upadmininfo(admininfo);
    }
}
