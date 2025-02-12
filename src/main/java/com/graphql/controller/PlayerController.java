package com.graphql.controller;

import com.graphql.model.Player;
import com.graphql.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @QueryMapping
    public List<Player> findAll(){
        return playerService.findAll();
    }

}
