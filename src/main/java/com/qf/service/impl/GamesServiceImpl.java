package com.qf.service.impl;

import com.qf.mapper.GamesMapper;
import com.qf.pojo.Games;
import com.qf.service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author xiao
 * @Date 2019/5/24 11:42
 */
@Service
public class GamesServiceImpl implements GamesService {
    @Autowired
    GamesMapper gamesMapper;
    /**
     * 增
     *
     * @param games
     */
    @Override
    public void addGames(Games games) {
        this.gamesMapper.addGames(games);
    }

    /**
     * 删
     *
     * @param gid
     */
    @Override
    public void delGames(int gid) {
  this.gamesMapper.delGames(gid);
    }

    /**
     * 改
     *
     * @param games
     */
    @Override
    public void upGames(Games games) {
           this.gamesMapper.upGames(games);
    }

    /**
     * 查
     */
    @Override
    public List<Games> getAllGames() {
        return gamesMapper.getAllGames();
    }

    /**
     * 主键查数据增
     *
     * @param gid
     */
    @Override
    public List<Games> getGidAll(int gid) {
        return gamesMapper.getGidAll(gid);
    }
}
