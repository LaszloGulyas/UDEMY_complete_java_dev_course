package com.laszlogulyas;

public class Main {

    public static void main(String[] args) {

        int counter = 0;
        int total = 0;
        for(int i = 1; i <= 1000; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + " can be divided by both 3 and 5");
                counter++;
                total+= i;
                if(counter == 5) {
                    System.out.println("The sum of " + counter + " found numbers are: " + total);
                    break;
                }
            }
        }
    }
}
