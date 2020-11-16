package com.laszlogulyas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //input user data start
        System.out.println("Enter your year of birth: ");
        boolean properInt = scanner.hasNextInt();
        int yearOfBirth = 0;
        if(properInt) {
            yearOfBirth = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        //input user data end

        //output start
        System.out.println("Your name is: " + name);

        if(properInt) {
            int age = 2019 - yearOfBirth;

            if(age >= 0 && age <= 100) {
                System.out.println("Your age is: " + age);
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Invalid year of birth");
        }

        scanner.close();
    }
}
