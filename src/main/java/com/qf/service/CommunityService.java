package com.qf.service;

import com.qf.pojo.Community;
import java.util.List;

public interface CommunityService {
    List<Community> getAllCommunity();

    void addCommunity(Community community);

    void delCommunity(int cid);

    Community getOneCommunity(int cid);

    Community updCommunity(Community community);
}
