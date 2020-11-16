package com.laszlogulyas;

public class Main {

    public static void main(String[] args) {

        int switchValue = 3;
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was 3 or 4 or 5");
                break;

            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

        // challenge

        char switchTester = 'D';
        switch(switchTester) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Value '" + switchTester + "' has been found");
                break;

            default:
                System.out.println("not found");
                break;
        }

        String month = "February";
        switch(month.toLowerCase()) {
            case "december": case "january": case "february":
                System.out.println("Winter");
                break;

            case "march": case "april": case "may":
                System.out.println("Spring");
                break;

            default:
                System.out.println("Summer or Autumn");
                break;
        }
    }
}
