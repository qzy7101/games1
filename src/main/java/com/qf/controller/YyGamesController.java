package com.qf.controller;

import com.qf.pojo.YyGames;
import com.qf.service.YyGamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author xiao
 * @Date 2019/5/25 15:57
 */
@RestController
public class YyGamesController {
    @Autowired
    YyGamesService yyGamesService;

    @RequestMapping("allYyGames")
    public List<YyGames> allYyGames(){

        return yyGamesService.allYyGames();
    }
    @RequestMapping("getOneGame")
    public List<YyGames> getOneGame(@RequestParam int yyid){

        return yyGamesService.getOneGame(yyid);
    }

}
