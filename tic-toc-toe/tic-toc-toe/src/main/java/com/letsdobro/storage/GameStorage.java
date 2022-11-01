package com.letsdobro.storage;

import com.letsdobro.model.Game;

import java.util.HashMap;
import java.util.Map;

public class GameStorage {

    //This is the single tone class

    private  static Map<String, Game> games;
    private static GameStorage instance;

    private GameStorage(){
        games = new HashMap<>();
    }

    public static synchronized GameStorage getInstance(){
        if(instance==null){
            instance=new GameStorage();
        }
        return instance;
    }

    //Getter
    public Map<String,Game> getGames(){
        return games;
    }

    //Setter for set Game
    public void setGame(Game game){
        games.put(game.getGameId(),game);
    }
}
