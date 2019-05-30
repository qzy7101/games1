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

}
