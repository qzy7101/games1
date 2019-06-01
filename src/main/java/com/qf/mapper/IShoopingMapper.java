package com.qf.mapper;

import com.qf.pojo.Shooping;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IShoopingMapper {

    @Insert("insert into shooping values(#{uid},#{yyid})")
    int saveShooping(int uid, int yyid);


    @Select("select * from shooping where uid = #{uid}")
    List<Shooping> getAllShoopingsByUid(int uid);

    @Select("select * from shooping where uid = #{uid} and yyid = #{yyid}")
    Shooping getShooping(int uid,int yyid);
}
