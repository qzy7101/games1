package com.qf.service;
import com.qf.pojo.YyGames;
import java.util.List;
public interface YyGamesService {

    List<YyGames> allYyGames();

    List<YyGames> getOneGame( int yyid);

    List<YyGames> getByName(YyGames yyGames);
}

