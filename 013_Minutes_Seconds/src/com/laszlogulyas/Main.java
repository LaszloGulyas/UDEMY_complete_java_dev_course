package com.laszlogulyas;

public class Main {

    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(200, -1));
        System.out.println(getDurationString(3660));
    }

    public static String getDurationString(int minutes, int seconds) {
        // validation
        if((minutes < 0) || (seconds <0) || (seconds >59)) {
            return INVALID_VALUE_MESSAGE;
        }

        // convert minutes to hours
        int hours = minutes / 60;
        minutes %= 60;
        return (ddConv(hours) + "h " + ddConv(minutes) + "m " + ddConv(seconds) + "s");
    }

    public static String getDurationString(int seconds) {
        // validation
        if(seconds <0) {
            return INVALID_VALUE_MESSAGE;
        }

        // convert seconds to minutes
        int minutes = seconds / 60;
        seconds %= 60;
        return getDurationString(minutes, seconds);
    }

    public static String ddConv(int digit) {
        if((digit >= 0) && (digit <= 9)) {
           return ("0" + digit);
        }
        return ("" + digit);
    }
}
