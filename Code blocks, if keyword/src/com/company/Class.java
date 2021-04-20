package com.company;

public class Class {


    public static void displayHighScorePosition(int playersname, int positionhighscore) {
        System.out.println(playersname + " managed to get into position " + positionhighscore + " on the high score table");


    }

    public static int calculateHighScorePosition(int playerscore) {
        if (playerscore > 1000) {
            return 1;
        } else if ((playerscore > 500) && (playerscore < 1000)) {
            return 2;
        } else if ((playerscore > 100) && (playerscore < 500)) {
            return 3;
        } else {
            return 4;
        }
    }

}