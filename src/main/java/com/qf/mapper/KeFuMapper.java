package com.qf.mapper;

import com.qf.pojo.KeFu;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface KeFuMapper {

    @Select("select * from kefu")
    List<KeFu> getAllKeFu();

    @Insert("insert into kefu (kname,email,theme,suggest) values(#{kname},#{email},#{theme},#{suggest})")
    void addKeFu(KeFu keFu);

    @Update("update kefu set kname=#{kname},email=#{email},theme=#{theme},suggest=#{suggest}  where kid=#{kid}")
    void upKeFu(KeFu keFu);
}