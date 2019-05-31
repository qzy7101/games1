package com.qf.service;

import com.qf.pojo.Admininfo;
import com.qf.pojo.Admins;

import java.util.List;

public interface AdminsinfoService {

    List<Admininfo> login(String admin);

    void upadmininfo(Admininfo admininfo);

}
