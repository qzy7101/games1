package com.qf.service;

import com.qf.pojo.KeFu;

import java.util.List;

public interface KeFuService {
    List<KeFu> getAllKeFu();

    void addKeFu(KeFu keFu);
}
