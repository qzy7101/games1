package com.qf.service;

import com.qf.pojo.Community;
import com.qf.pojo.Community1;

import java.util.List;

public interface CommunityService {
    List<Community> getAllCommunity();

    void addCommunity(Community community);

    void delCommunity(int cid);

    Community getOneCommunity(int cid);

    Community updCommunity(Community community);

    Community getOneCommunity1(String cheadline);

    List<Community1> selAll();
}
