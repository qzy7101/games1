package com.qf.service.impl;

import com.qf.mapper.ReplyMapper;
import com.qf.pojo.Reply;
import com.qf.service.ReplyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ReplyServiceImpl implements ReplyService {
    @Resource
    private ReplyMapper replyMapper;

    @Override
    public List<Reply> getAllReply() {
        return replyMapper.getAllReply();
    }

    @Override
    public List<Reply> getOneReply(int cid) {
        return replyMapper.getOneReply(cid);
    }

    @Override
    public void addReply(Reply reply) {
        replyMapper.addReply(reply);
    }


}
