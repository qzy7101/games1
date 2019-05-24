package com.qf.mapper;

import com.qf.pojo.Community;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;
@Mapper
public interface CommunityMapper {
    @Select("select * from community")
    List<Community> getAllCommunity();

    @Select("insert into community (cid, cheadline, uname, hits, pubdate, details) values (#{cid,jdbcType=INTEGER},#{cheadline,jdbcType=VARCHAR},#{uname,jdbcType=VARCHAR},#{hits,jdbcType=INTEGER},#{pubdate,jdbcType=VARCHAR},#{details,jdbcType=VARCHAR})")
    void addCommunity(Community community);

    @Select("delete from community where cid = #{cid}")
    void delCommunity(int cid);

    @Select("select * from community where cid = #{cid}")
    Community getOneCommunity(int cid);

    @Select("update community set cheadline = #{cheadline},uname = #{uname},hits = #{hits},pubdate = #{pubdate},details = #{details} where cid = #{cid}")
    Community updCommunity(Community community);

}
