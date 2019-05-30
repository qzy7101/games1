package com.qf.controller;

import com.qf.pojo.YyGames;
import com.qf.service.YyGamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
public class YyGamesController {
    @Resource
    YyGamesService yyGamesService;

    @RequestMapping("allYyGames")
    public List<YyGames> allYyGames(){

        return yyGamesService.allYyGames();
    }
    @RequestMapping("getOneGame")
    public List<YyGames> getOneGame(@RequestParam int yyid){

        return yyGamesService.getOneGame(yyid);
    }

    @RequestMapping("getByName")
    public List<YyGames> getByName(String gametype){

        System.out.println(gametype+"1111111111111111111111111111");
        return yyGamesService.getByName(gametype);
    }

}
