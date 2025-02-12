package com.graphql.service;

import com.graphql.model.Player;
import com.graphql.model.Team;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

    public Optional<Player> findOne(Integer id){
        return players.stream().filter(player -> player.id().equals(id)).findFirst();
    }

    public Player create(String name, Team team){
        Player player = new Player(atomicInteger.incrementAndGet(), name, team);
        players.add(player);
        return player;
    }

    public Player delete(Integer id){
        Player player = players.stream().filter(p -> p.id().equals(id)).findFirst().orElseThrow(() -> new IllegalArgumentException("Invalid id: " + id));
        players.remove(player);
        return player;
    }

    public Player update(Integer id, String name, Team team){
        Player updatedPlayer = new Player(id, name, team);
        Optional<Player> optionalPlayer = players.stream().filter(p -> p.id().equals(id)).findFirst();
        if(optionalPlayer.isPresent()){
            Player player = optionalPlayer.get();
            int index = players.indexOf(player);
            players.set(index, updatedPlayer);
        }
        else{
            throw new IllegalArgumentException("Invalid Player");
        }
        return updatedPlayer;
    }

}
