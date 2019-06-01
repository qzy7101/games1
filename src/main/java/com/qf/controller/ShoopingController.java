package com.qf.controller;

import com.qf.pojo.Games;
import com.qf.pojo.Shooping;
import com.qf.pojo.YyGames;
import com.qf.service.IShoopingService;
import com.qf.service.UserService;
import com.qf.service.YyGamesService;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ShoopingController {

    @Resource
    private IShoopingService shoopingService;
    @Resource
    private UserService userService;
    @Resource
    private YyGamesService yyGamesService;


    @PostMapping("/saveShoping")
    public int saveShooping(HttpServletRequest req) {

        String name = req.getParameter("uname");

        int uid = userService.getUidByName(name);

        String yname = req.getParameter("yyname");

        int yyid = yyGamesService.getYyidByName(yname);


        if (shoopingService.getShooping(uid, yyid) == null) {
            int i = shoopingService.saveShooping(uid, yyid);
            return 1;
        } else {
            return 0;
        }

    }

    @PostMapping("/showShoping")
    public List<YyGames> showShooping(HttpServletRequest req) {

        String name = req.getParameter("uname");

        System.out.println(name);

        int uid = userService.getUidByName(name);

        List<Shooping> list = shoopingService.getAllShoopingsByUid(uid);

        List<YyGames> games = new ArrayList<>();
        for(Shooping sp:list){
            YyGames gameByYyid = yyGamesService.getGameByYyid(sp.getYyid());

            games.add(gameByYyid);
        }
        System.out.println(games);
        return games;
    }
}
