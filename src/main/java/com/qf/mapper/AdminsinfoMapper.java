package com.qf.mapper;

import com.qf.pojo.Admininfo;
import com.qf.pojo.Admins;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface AdminsinfoMapper {

    //(通过admin查询对象)
    @Select("select * from adminsinfo where admin = #{admin}")
    List<Admininfo> login(String admin);

    //修改
    @Update("update adminsinfo set aid=#{aid},admin=#{admin},phone=#{phone},site=#{site},position=#{position},synopsis=#{synopsis} where vid = #{vid}")
    void upadmininfo(Admininfo admininfo);

}
