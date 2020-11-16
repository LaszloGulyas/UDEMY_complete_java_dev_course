package com.laszlogulyas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i = 1;

        while(i<=10) {
            System.out.println("Enter number #" + i + ":");
            boolean properInt = scanner.hasNextInt();

            if (properInt) {
                sum += scanner.nextInt();
                i++;
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine();
        }

        scanner.close();

        System.out.println("Total sum of entered numbers is: " + sum);
    }
}
