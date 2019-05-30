package com.qf.controller;

import com.qf.pojo.Community;
import com.qf.service.CommunityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
public class CommunityController {
    @Resource
    private CommunityService communityService;


    @GetMapping("/Community")
    public List<Community> getAllCommunity(){
        return communityService.getAllCommunity();
    }

    @GetMapping("/addCommunity")
    public int addCommunity(Community community){
        community.setCheadline("dsvfdb");
        community.setUname("刘备");
        community.setHits(43);
        community.setPubdate(new Date());
        community.setDetails("阿凡达的功能");
        communityService.addCommunity(community);
        return 1;
    }

    @GetMapping("/delCommunity")
    public int delCommunity(Integer cid){
        communityService.delCommunity(6);
        return 5;
    }

    @GetMapping("/getOneCommunity")
    public Community getOneCommunity(Integer cid){
        Community oneCommunity = communityService.getOneCommunity(2);
        return oneCommunity;
    }

    @GetMapping("/updCommunity")
    public Community updateCommunity(Community community){
        community.setCid(5);
        community.setCheadline("abcdefghijk");
        community.setUname("关羽");
        community.setPubdate(new Date());
        community.setHits(22);
        community.setDetails("adv购房计划并不v就");
        Community community1 = communityService.updCommunity(community);

        return community1;
    }
}
