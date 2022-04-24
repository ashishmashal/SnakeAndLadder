package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
    public static final int START_POSITION_LADDER = 0;
    public static final int NO_FUTHER_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static void main(String[] args) {
        System.out.println("Welcome To Snake And Ladder Game");
        System.out.println("Roll The Dies");
        Random random = new Random();
         int position= 0;
         int dies = random.nextInt(6) + 1;
        System.out.println("Dies Value Is " + dies);

        int options = random.nextInt(3);
        System.out.println(options);
        switch (options){
            case LADDER :
                position += dies;
                break;
            case SNAKE:
                if (position != 0)
                    position -= dies;
                break;
            case NO_FUTHER_PLAY:
                break;
        }
        System.out.println("Player At Position " + position);
    }
}
