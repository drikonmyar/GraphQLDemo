package com.graphql.service;

import com.graphql.model.Player;
import com.graphql.model.Team;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class PlayerService {

    private List<Player> players = new ArrayList<>();

    AtomicInteger atomicInteger = new AtomicInteger(0);

    @PostConstruct
    private void init(){
        players.add(new Player(atomicInteger.incrementAndGet(), "MS Dhoni", Team.CSK));
        players.add(new Player(atomicInteger.incrementAndGet(), "R Sharma", Team.MI));
        players.add(new Player(atomicInteger.incrementAndGet(), "D Karthik", Team.KKR));
        players.add(new Player(atomicInteger.incrementAndGet(), "H Pandya", Team.GT));
        players.add(new Player(atomicInteger.incrementAndGet(), "S Raina", Team.CSK));
    }

    public List<Player> findAll(){
        return players;
    }

}
