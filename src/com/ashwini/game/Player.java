package com.ashwini.game;

import java.util.Random;

public class Player {
    private String name;
    private int currPosition;
    private boolean isWinner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrPosition() {
        return currPosition;
    }

    public void setCurrPosition(int currPosition) {
        this.currPosition = currPosition;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }

    public int rollDice(Random random){
        return random.nextInt(6)+1;
    }
}
