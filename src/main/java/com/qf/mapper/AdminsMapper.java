package com.qf.mapper;

import com.qf.pojo.Admins;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface AdminsMapper {

    //登陆(通过admin查询对象)
    @Select("select * from admins where admin = #{admin}")
    Admins login(String admin);

    //修改
    @Update("update admins set password=#{password},aid=#{aid} where admin = #{admin}")
    void upadmin(Admins admins);


}
