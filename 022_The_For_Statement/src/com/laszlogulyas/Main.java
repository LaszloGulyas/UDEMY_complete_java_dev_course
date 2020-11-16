package com.laszlogulyas;

public class Main {

    public static void main(String[] args) {
        for(int i = 2; i <= 8; i++) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000, i));
        }

        for(int i = 8; i>=2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000, i));
        }

        int primeCount = 0;

        for(int i= 1; i<=100000; i++) {
            if(isPrime(i)) {
                System.out.println(i);
                primeCount++;
                if(primeCount == 1000) {
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * interestRate / 100);
    }

    public static boolean isPrime(int number) {
        if(number <= 1) {
            return false;
        }

        for(int i = 2; i <= (long)Math.sqrt(number); i++ ) {
            if(number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
