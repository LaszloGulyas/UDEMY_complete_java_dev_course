package com.laszlogulyas;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Laci", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        System.out.println("CM = " + calcFeetAndInchesToCentimeters(6,0));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    // challenge

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if((feet >= 0) && (inches >= 0) && (inches <= 12)) {
            //convert feet and inches to cm
            double centimeters = 2.54 * inches + 12 * 2.54 * feet;
            return centimeters;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches >= 0) {
            //calculation
            double feet = (int)(inches / 12);
            inches %= 12;
            return calcFeetAndInchesToCentimeters(feet, inches);
        } else {
            return -1;
        }
    }
}