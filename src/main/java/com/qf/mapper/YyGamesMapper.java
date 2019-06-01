package com.qf.mapper;

import com.qf.pojo.YyGames;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface YyGamesMapper {


    @Select("select * from yygames")
      List<YyGames> allYyGames();


    @Select("select * from yygames where yyid = #{yyid}")
      List<YyGames> getOneGame( int yyid);

    @Select("select * from yygames where gametype=#{gametype}")
    List<YyGames> getByName(String gametype);

    //根据游戏名查ID
    @Select("select yyid from yygames where yyname = #{yyname}")
    int getYyidByName(String yyname);
    //根据Id查游戏
    @Select("select * from yygames where yyid = #{yyid}")
    YyGames getGameByYyid( int yyid);

}
