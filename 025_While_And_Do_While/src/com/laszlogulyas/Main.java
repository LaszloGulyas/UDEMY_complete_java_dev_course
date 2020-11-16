package com.laszlogulyas;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while(count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        while(true) {
            if(count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count ++;
        }

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while(count != 6);

//LAST CHALLENGE--------------------------------------------------------------

        int number = 4;
        int finish = 20;
        int countOfEven = 0;

        while (number <= finish) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }

            System.out.println(number + " is an even number");
            countOfEven++;
            if(countOfEven == 5) {
                break;
            }
        }

        System.out.println(countOfEven + " even number(s) are found");
    }

    public static boolean isEvenNumber(int number) {
        if((number >= 0) && (number%2 == 0)) {
            return true;
        }
        return false;
    }
}
