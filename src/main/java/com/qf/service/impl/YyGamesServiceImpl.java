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
    public List<YyGames> getByName(YyGames yyGames) {
        return yyGamesMapper.getByName(yyGames);
    }
}
