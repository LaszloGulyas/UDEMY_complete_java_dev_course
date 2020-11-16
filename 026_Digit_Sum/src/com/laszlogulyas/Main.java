package com.laszlogulyas;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of digits = " + sumDigits(321));
        System.out.println("Sum of digits2 = " + sumDigits2(9999));
    }

    public static int sumDigits(int number) {
        if(!(number >= 10)) {
            return -1;
        }

        int totalDigits = 0;
        int numberLength = 0;
        int divider = 10;
        while(true) {
            if((number / divider) < 1) {
                break;
            }
            numberLength++;
            divider*=10;
        }

        int tempDigits = 0;
        for(int i = (int)(Math.pow(10, numberLength)); i>=1; i/=10) {
            tempDigits = (number / i);
            totalDigits+= tempDigits;
            number-= tempDigits*i;
        }

        return totalDigits;
    }

    public static int sumDigits2(int number) {
        if(!(number >= 10)) {
            return -1;
        }

        int totalDigits = 0;
        while(number >= 1) {
            totalDigits += number % 10;
            number /= 10;
        }

        return totalDigits;
    }
}
