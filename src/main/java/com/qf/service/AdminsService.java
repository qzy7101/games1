package com.qf.service;

import com.qf.pojo.Admins;

public interface AdminsService {

    Admins login(String admin);

    void upadmin(Admins admins);

}
