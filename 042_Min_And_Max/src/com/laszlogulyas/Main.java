package com.laszlogulyas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int inputNumber;
        boolean properInt;

        while(true) {
            System.out.println("Enter number:");
            properInt = scanner.hasNextInt();

            if(properInt == false) {
                break;
            }

            inputNumber = scanner.nextInt();

            if(inputNumber < min) {
                min = inputNumber;
            }

            if(inputNumber > max) {
                max = inputNumber;
            }

            scanner.nextLine();
        }
        scanner.close();

        System.out.println("Min number is: " + min);
        System.out.println("Max number is: " + max);
    }
}
