package com.qf.service.impl;

import com.qf.mapper.CommunityMapper;
import com.qf.pojo.Community;
import com.qf.pojo.Community1;
import com.qf.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommunityServiceImpl implements CommunityService
{
    @Resource
    private CommunityMapper communityMapper;
    @Override
    public List<Community> getAllCommunity() {
        return communityMapper.getAllCommunity();
    }

    @Override
    public void addCommunity(Community community) {
        communityMapper.addCommunity(community);
    }

    @Override
    public void delCommunity(int cid) {
        communityMapper.delCommunity(cid);
    }

    @Override
    public Community getOneCommunity(int cid) {
        return communityMapper.getOneCommunity(cid);
    }

    @Override
    public Community updCommunity(Community community) {
        return communityMapper.updCommunity(community);
    }

    @Override
    public Community getOneCommunity1(String cheadline) {
        return communityMapper.getOneCommunity1(cheadline);
    }

    @Override
    public List<Community1> selAll() {
        return communityMapper.selAll();
    }
}
