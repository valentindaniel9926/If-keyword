package com.company;

public class Main {

    public static void main(String[] args) {
        int positionhighscore= calculateHighScorePosition(1500);
        displayHighScorePosition("Tim",positionhighscore);

        positionhighscore= calculateHighScorePosition(1000);
        displayHighScorePosition("John",positionhighscore);

         positionhighscore= calculateHighScorePosition(500);
        displayHighScorePosition("Andrei",positionhighscore);

        positionhighscore= calculateHighScorePosition(500);
        displayHighScorePosition("Andrei",positionhighscore);


    }

        public static void displayHighScorePosition ( String playersname, int positionhighscore){
            System.out.println(playersname + " managed to get into position " + positionhighscore + " on the high score table");


        }

        public static int calculateHighScorePosition(int playerscore){
       /*     if(playerscore >= 1000) {
                return 1;
            } else if((playerscore >= 500) && (playerscore < 1000)) {
                return 2;
            } else if((playerscore >= 100) && (playerscore < 500)) {
                return 3;
            }
            return 4;
            }*/

            int position =4;
            if(playerscore >= 1000){
                position=1;
            }else if(playerscore>= 500){
                position=2;
            }else if(playerscore>=100){
                position=3;
            }
            return position;
        }



}

