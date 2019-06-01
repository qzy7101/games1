package com.qf.service.impl;

import com.qf.mapper.YyGamesMapper;
import com.qf.pojo.YyGames;
import com.qf.service.YyGamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class YyGamesServiceImpl implements YyGamesService {
    @Resource
    YyGamesMapper yyGamesMapper;

    @Override
    public List<YyGames> allYyGames() {
        return yyGamesMapper.allYyGames();
    }

    @Override
    public List<YyGames> getOneGame(int yyid) {
        return yyGamesMapper.getOneGame(yyid);
    }

    @Override
    public List<YyGames> getByName(String gametype) {
        return yyGamesMapper.getByName(gametype);
    }

    @Override
    public int getYyidByName(String yyname) {
        return yyGamesMapper.getYyidByName(yyname);
    }

    @Override
    public YyGames getGameByYyid(int yyid) {
        return yyGamesMapper.getGameByYyid(yyid);
    }
}
