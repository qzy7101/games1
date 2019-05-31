package com.qf.controller;

import com.qf.pojo.Community;
import com.qf.pojo.Community1;
import com.qf.pojo.User;
import com.qf.service.CommunityService;
import com.qf.service.UserService;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@RestController
public class CommunityController {
    @Resource
    private CommunityService communityService;

    @Resource
    private UserService userService;


    @GetMapping("/Community")
    public List<Community> getAllCommunity(){
        System.out.println("111111111111111111");
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

    @PostMapping("getOneCommunity1")
    public Community getOneCommunity1( HttpSession session){
        String name = (String)session.getAttribute("bt");
        System.out.println(name);

        Community oneCommunity1 = communityService.getOneCommunity1(name);
        System.out.println(oneCommunity1);
        return oneCommunity1;
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

    @RequestMapping(value = "/one",method = RequestMethod.POST)
    @ResponseBody
    public int login(@RequestParam String as,HttpSession session){

        session.setAttribute("bt",as);

       return 1;
    }


    @PostMapping("community1")
    public List<Community1> getAllCommunity1(){

        List<Community1> community1s = communityService.selAll();
        return community1s;
    }





}

