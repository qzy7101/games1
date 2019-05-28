package com.qf.service.impl;

import com.qf.mapper.YyGamesMapper;
import com.qf.pojo.YyGames;
import com.qf.service.YyGamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author xiao
 * @Date 2019/5/25 15:55
 */
@Service
public class YyGamesServiceImpl implements YyGamesService {
    @Autowired
    YyGamesMapper yyGamesMapper;

    @Override
    public List<YyGames> allYyGames() {
        return yyGamesMapper.allYyGames();
    }

    @Override
    public List<YyGames> getOneGame(int yyid) {
        return yyGamesMapper.getOneGame(yyid);
    }
}
