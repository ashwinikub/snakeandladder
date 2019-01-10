package com.ashwini.game;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {

    public Map<Integer, Integer> getSnakeOrLadderMap() {
        return snakeOrLadderMap;
    }

    public void setSnakeOrLadderMap(Map<Integer, Integer> snakeOrLadderMap) {
        this.snakeOrLadderMap = snakeOrLadderMap;
    }

    private Map<Integer, Integer> snakeOrLadderMap = new HashMap<>();

    public void init(){
        snakeOrLadderMap.put(2,44);
        snakeOrLadderMap.put(5,16);
        snakeOrLadderMap.put(6,13);
        snakeOrLadderMap.put(9,31);
        snakeOrLadderMap.put(28, 84);
        snakeOrLadderMap.put(46, 76);
        snakeOrLadderMap.put(57,25);
        snakeOrLadderMap.put(63, 20);
        snakeOrLadderMap.put(59,61);
        snakeOrLadderMap.put(68,15);
        snakeOrLadderMap.put(70, 73);
        snakeOrLadderMap.put(79, 100);
        snakeOrLadderMap.put(89, 45);
        snakeOrLadderMap.put(95, 90);
        snakeOrLadderMap.put(98, 78);
    }
}
