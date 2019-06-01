package com.qf.service;
import com.qf.pojo.YyGames;
import org.apache.ibatis.annotations.Select;

import java.util.List;
public interface YyGamesService {

    List<YyGames> allYyGames();

    List<YyGames> getOneGame( int yyid);

    List<YyGames> getByName(String gametype);


    //根据游戏名查ID

    int getYyidByName(String yyname);

    YyGames getGameByYyid( int yyid);
}

