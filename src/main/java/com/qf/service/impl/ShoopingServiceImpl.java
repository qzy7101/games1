package com.qf.service.impl;

import com.qf.mapper.IShoopingMapper;
import com.qf.pojo.Shooping;
import com.qf.service.IShoopingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoopingServiceImpl implements IShoopingService{

    @Autowired
    private IShoopingMapper shoopingMapper;

    @Override
    public int saveShooping(int uid, int yyid) {
        return shoopingMapper.saveShooping(uid,yyid);
    }

    @Override
    public List<Shooping> getAllShoopingsByUid(int uid) {
        return shoopingMapper.getAllShoopingsByUid(uid);
    }

    @Override
    public Shooping getShooping(int uid, int yyid) {
        return shoopingMapper.getShooping(uid,yyid);
    }
}
