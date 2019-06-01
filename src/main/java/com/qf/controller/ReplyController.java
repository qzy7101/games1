package com.qf.controller;

import com.qf.pojo.Community;
import com.qf.pojo.Reply;
import com.qf.service.CommunityService;
import com.qf.service.ReplyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@RestController
public class ReplyController {
    @Resource
    private ReplyService replyService;

    @Resource
    private CommunityService communityService;

    @GetMapping("/reply")
    public List<Reply> getAllReply(){
        System.out.println("3333333333333333");
        return replyService.getAllReply();
    }
    @RequestMapping(value = "/getOne",method = RequestMethod.POST)
    @ResponseBody
    public List<Reply> getOne(HttpSession session){

        String name = (String)session.getAttribute("bt");
        Community tz1 = communityService.getOneCommunity1(name);
        int cid = tz1.getCid();
        session.setAttribute("cid",cid);
        List<Reply> oneReply = replyService.getOneReply(cid);

        System.out.println(oneReply);
        return oneReply;
    }

    @PostMapping("/addReply")
    public int addReply(@RequestParam String uname,@RequestParam String rdetails, Reply reply,HttpSession session){

        System.out.println(uname);
        System.out.println(rdetails);
        Integer cid = (Integer) session.getAttribute("cid");
        reply.setCid(cid);
        reply.setRtime(new Date());
        reply.setRname(uname);
        System.out.println(reply.toString());
        reply.setRdetails(rdetails);

        replyService.addReply(reply);
        System.out.println("222222222222222222222");
        return 1;
    }
}
