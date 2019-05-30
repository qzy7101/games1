package com.qf.mapper;

import com.qf.pojo.Admins;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AdminsMapper {

    //登陆(通过admin查询对象)
    @Select("select * from admins where admin = #{admin}")
    Admins login(String admin);

}
