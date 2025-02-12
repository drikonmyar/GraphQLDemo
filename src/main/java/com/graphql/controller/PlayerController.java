package com.graphql.controller;

import com.graphql.model.Player;
import com.graphql.model.Team;
import com.graphql.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @QueryMapping
    public List<Player> findAll(){
        return playerService.findAll();
    }

    @QueryMapping
    public Optional<Player> findOne(@Argument Integer id){
        return playerService.findOne(id);
    }

    @MutationMapping
    public Player create(@Argument String name, @Argument Team team){
        return playerService.create(name, team);
    }

    @MutationMapping
    public Player update(@Argument Integer id, @Argument String name, @Argument Team team){
        return playerService.update(id, name, team);
    }

    @MutationMapping
    public Player delete(@Argument Integer id){
        return playerService.delete(id);
    }

}
