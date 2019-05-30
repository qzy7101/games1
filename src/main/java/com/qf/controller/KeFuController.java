package com.qf.controller;

import com.qf.pojo.KeFu;
import com.qf.service.KeFuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class KeFuController {
    @Resource
    private KeFuService keFuService;

    @RequestMapping("getAllKeFu")
    @ResponseBody
    public List<KeFu> getAllKeFu(){
        return keFuService.getAllKeFu();
    }

    @RequestMapping("addKeFu")
    @ResponseBody
    public int addKeFu(@RequestBody KeFu keFu){
        System.out.println(keFu+"111111111111111111");
        keFuService.addKeFu(keFu);
        return 1;
    }

    @RequestMapping("upKeFu")
    @ResponseBody
    public void upKeFu(KeFu keFu){
        keFuService.upKeFu(keFu);
    }
}
