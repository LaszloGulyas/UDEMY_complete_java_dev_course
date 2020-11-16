package com.laszlogulyas;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //challenge-----------------

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        {int finalScore2 = score + levelCompleted * bonus;
        System.out.println("Your second final score was " + finalScore2);}

    }
}
