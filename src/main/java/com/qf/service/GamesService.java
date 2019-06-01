package com.qf.service;

import com.qf.pojo.Games;

import java.util.List;

/**
 * @Author xiao
 * @Date 2019/5/24 11:41
 */
public interface GamesService {



    /**
     * 增
     */
    void addGames(Games games);

    /**
     * 删
     */
    void delGames(int gid);

    /**
     * 改
     */
    void upGames(Games games);

    /**
     * 查
     */

    List<Games> getAllGames();

    /**
     * 主键查数据增
     */
    List<Games> getGidAll(int gid);


}
