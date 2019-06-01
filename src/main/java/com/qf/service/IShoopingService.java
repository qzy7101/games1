package com.qf.service;

import com.qf.pojo.Shooping;

import java.util.List;

public interface IShoopingService {

    int saveShooping(int uid, int yyid);

    List<Shooping> getAllShoopingsByUid(int uid);

    Shooping getShooping(int uid,int yyid);
}
