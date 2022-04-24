package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
    public static final int START_POSITION_LADDER = 0;
    public static void main(String[] args) {
        System.out.println("Welcome To Snake And Ladder Game");
        System.out.println("Roll The Dies");
        Random random = new Random();
         int position= 0;
         int dies = random.nextInt(6) + 1;
        System.out.println("Dies Value Is " + dies);

    }
}
