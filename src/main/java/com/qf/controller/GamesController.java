package com.qf.controller;

import com.qf.pojo.Games;
import com.qf.service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @Author xiao
 * @Date 2019/5/24 11:43
 */
@RestController
public class GamesController {
    @Autowired
    GamesService gamesService;

/**
 *
 *查所有
 */

@RequestMapping("getAll")
    public List<Games> getAll(){
    return gamesService.getAllGames();
}

/**
 * 增加
 */
    @RequestMapping("addGames")
    public boolean  addGames(@RequestParam Games games){
        gamesService.addGames(games);
        return true;
    }


/**
 * 删除
 */
    @RequestMapping("delGames")
    public  boolean delGames(@RequestParam  int gid){
        gamesService.delGames(gid);
        return true;
    }

/**
 * 修改
 */
    @RequestMapping("updGames")

    public boolean upGames( Games games){
           gamesService.upGames(games);
        return true;
    }

/**
 * 主键查询
 */
    @RequestMapping("getGidAll")
    public List<Games> getGidAll(@RequestParam int gid){
        return gamesService.getGidAll(gid);
    }


    }



