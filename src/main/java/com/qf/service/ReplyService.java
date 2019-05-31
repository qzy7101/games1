package com.qf.service;

import com.qf.pojo.Reply;
import java.util.List;

public interface ReplyService {

    List<Reply> getAllReply();

    List<Reply> getOneReply(int cid);

    void addReply(Reply reply);
}
