package com.bridgelabz;
import java.util.Random;

public class SnakeAndLadder {
    public static final int START_POSITION_LADDER = 0;
    public static final int NO_FUTHER_PLAY = 0;
    public static final int END_POSITION_LADDER = 100;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    static int currentPosition;
    static String position;
    static Random random = new Random();

    public static int dieRoll() {
        int diceValue = random.nextInt(6) + 1;
        System.out.println("Dice value : " + diceValue);
        return diceValue;
    }

    public static int playerChecksOption() {
        int dicecount = 0;
        int currentPosition = START_POSITION_LADDER;
        while (currentPosition < END_POSITION_LADDER) {
            int checkOption = random.nextInt(3);
            int dice = dieRoll();
            dicecount ++;
            switch (checkOption) {
                case NO_FUTHER_PLAY -> {
                    position = "Not played";
                    currentPosition = currentPosition;
                }
                case LADDER -> {
                    if (currentPosition + dice > END_POSITION_LADDER) {
                        currentPosition = currentPosition;
                    } else {
                        currentPosition += dice;
                    }
                }
                case SNAKE -> {
                    position = "Player is on Snake";
                    if (currentPosition - dice <= START_POSITION_LADDER) {
                        currentPosition = START_POSITION_LADDER;
                    } else {
                        currentPosition -= dice;
                    }
                }
            }
            System.out.println("Player's Position :" + position + ",  #Current Position :" + currentPosition);
        }
        return currentPosition;
    }

    public static void main (String[] args){
            System.out.println("Welcome to Snake and Ladder Game");
            playerChecksOption();

        }


}
