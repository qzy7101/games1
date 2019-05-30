package com.qf.mapper;

import com.qf.pojo.Reply;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ReplyMapper {
    @Select("select * from reply")
    List<Reply> getAllReply();

    @Select("select * from reply where cid = #{cid}")
    List<Reply> getOneReply(int cid);

    @Select("insert into reply (rid, cid, uname, rtime, rdetails) values (#{rid},#{cid},#{uname},#{rtime},#{rdetails})")
    void addReply(Reply reply);
}
