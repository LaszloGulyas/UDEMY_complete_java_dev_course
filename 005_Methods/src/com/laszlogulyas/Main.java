package com.laszlogulyas;

public class Main {

    public static void main(String[] args) {
        int finalScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was: " + finalScore);

        finalScore = calculateScore(false, 10000, 8, 200);
        System.out.println("Your final score was: " + finalScore);

        int highScore;
        String playerName;

        playerName = "Laci";
        highScore = 1500;
        displayHighScorePosition(playerName, calculateHighScorePosition(highScore));

        playerName = "Nóra";
        highScore = 900;
        displayHighScorePosition(playerName, calculateHighScorePosition(highScore));

        playerName = "Kiskoala";
        highScore = 400;
        displayHighScorePosition(playerName, calculateHighScorePosition(highScore));

        playerName = "Kiscirmos";
        highScore = 50;
        displayHighScorePosition(playerName, calculateHighScorePosition(highScore));
    }

    public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            //System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition (String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition (int playerScore) {
        if(playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}