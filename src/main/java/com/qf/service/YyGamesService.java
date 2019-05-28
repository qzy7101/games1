package com.qf.service;

import com.qf.pojo.YyGames;

import java.util.List;

/**
 * @Author xiao
 * @Date 2019/5/25 15:54
 */
public interface YyGamesService {

    List<YyGames> allYyGames();

    List<YyGames> getOneGame( int yyid);

}

