package com.ashwini.game;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class SnakeLaddergame {
    private Integer startPosition = 1;
    private int currPosition = startPosition;

    public Integer play(Integer dice, Integer position) {


        TreeMap<Integer, Integer> Ladder = new TreeMap<Integer, Integer>();
        Ladder.put(2, 44);
        Ladder.put(6, 13);
        Ladder.put(9, 31);
        Ladder.put(28, 84);
        Ladder.put(59, 61);
        Ladder.put(67, 93);
        Ladder.put(70, 73);
        Ladder.put(79, 100);
        Set<Integer> riseposition = Ladder.keySet();

        TreeMap<Integer, Integer> Snake = new TreeMap<Integer, Integer>();
        Snake.put(16, 5);
        Snake.put(50, 8);
        Snake.put(57, 25);
        Snake.put(68, 15);
        Snake.put(63, 20);
        Snake.put(76, 40);
        Snake.put(89, 45);
        Snake.put(95, 90);
        Snake.put(98, 78);
        Set<Integer> fallposition = Snake.keySet();


        position = position + dice;
        if (Ladder.containsKey(position)) {
            position = Ladder.get(position);

        } else if (Snake.containsKey(position)) {
            position = Snake.get(position);

        } else if (position == 100) {
            System.out.println("you won");
            return position;
        }
        return position;

    }

    public static void main(String args[]) {

        /*Scanner sc = new Scanner(System.in);
        while (currPo != 100) {
            System.out.println("Roll the dice,say y/n");
            String answer = sc.next();
            if (answer.equals("y")) {
                Random random = new Random();
                int rand = random.nextInt(7);
                Integer dice = rand;
                SnakeLaddergame player = new SnakeLaddergame();
                System.out.println("new startPosition" + " "+dice+" "+player.play(1, startPosition));

            }

        }*/

    }


}