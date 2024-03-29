package com.qf.service.impl;

import com.qf.mapper.KeFuMapper;
import com.qf.pojo.KeFu;
import com.qf.service.KeFuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class KeFuServiceImpl implements KeFuService {

    @Autowired
   private KeFuMapper keFuMapper;
    @Override
    public List<KeFu> getAllKeFu() {
        return keFuMapper.getAllKeFu();
    }

    @Override
    public void addKeFu(KeFu keFu) {
        keFuMapper.addKeFu(keFu);
    }

    @Override
    public void upKeFu(KeFu keFu) {
        keFuMapper.upKeFu(keFu);
    }

    @Override
    public int delKeFu(int kid) {
        return keFuMapper.delKeFu(kid);
    }


}
