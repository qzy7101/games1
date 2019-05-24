package com.qf.mapper;

import com.qf.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
   //查询所有
    @Select("select * from user")
    List<User> getAllUser();
   //uid查询
    @Select("select * from user where uid = #{uid}")
    User getuidAlluser(int uid);
   //增加
    @Insert("insert into user(uname,upass,email) values(#{uname},#{upass},#{email})")
    void adduser(User user);
   //删除
   @Delete("delete from user where uid = #{uid}")
    void deluser(int uid);
   //修改
    @Update("update user set uname=#{uname},upass=#{upass},email=#{email} where uid=#{uid}")
    void upuser(User user);
}
