package com.ashwini.game;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Game {

    private List<Player> playerList;
    private Board board;
    private static final int MAX_POSITION = 100;
    private static final Random random = new Random();

    public static void main(String[] args) {

        Game game = new Game();
        game.init();
        Player winningPlayer = game.play();
        System.out.println("The winning player is "+winningPlayer.getName());
    }

    private Player play(){
        while(true){
            for(Player player : playerList){
                int diceValue = player.rollDice(random);
                int newPosition = player.getCurrPosition() + diceValue;
                if(board.getSnakeOrLadderMap().containsKey(newPosition)){
                    newPosition = board.getSnakeOrLadderMap().get(newPosition);
                }
                if(newPosition > MAX_POSITION){
                    continue;
                }
                player.setCurrPosition(newPosition);

                if(player.getCurrPosition()==MAX_POSITION){
                    return player;
                }
            }

        }

    }

    private void init(){
        this.board = new Board();
        this.board.init();
        this.initializePlayers();
    }

    private void initializePlayers(){
        Player player1 = new Player();
        player1.setName("John");
        player1.setCurrPosition(1);

        Player player2 = new Player();
        player2.setName("Jane");
        player2.setCurrPosition(1);

        Player player3 = new Player();
        player3.setName("Mike");
        player3.setCurrPosition(1);

        this.playerList = Arrays.asList(player1, player2, player3);

    }

}
