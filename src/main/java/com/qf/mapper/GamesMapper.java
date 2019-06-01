package com.qf.mapper;

import com.qf.pojo.Games;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author xiao
 * @Date 2019/5/24 11:43
 */
@Mapper
public interface GamesMapper {





    /**
     * 增
     */
    @Select("insert into games values(null,#{gname}.#{genre}#,{price},#{synopsis},#{purchases},#{pv},#{onlinetime},#{picture}")
    void addGames(Games games);

    /**
     * 删
     */
    @Select("delete from games where gid=#{gid}")
    void delGames(int gid);

    /**
     * 改
     */
    @Select("UPDATE games SET gname=#{gname},genre=#{genre},price=#{price},synopsis=#{synopsis},purchases=#{purchases},pv=#{pv},onlinetime=#{onlinetime},picture=#{picture} where gid=#{gid}")
    void upGames(Games games);


    /**
     * 查
     */
    @Select("select * from games")
    List<Games> getAllGames();

    /**
     * 主键查
     */
    @Select("select * from games where gid=#{gid}")
    List<Games> getGidAll(int gid);

}
