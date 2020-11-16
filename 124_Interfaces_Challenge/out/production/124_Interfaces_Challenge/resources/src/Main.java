import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[]args) {
        Players players = new Players();
        players.addNewElement(readValues());

        saveObject(players);

    }

    private static void saveObject(ISaveable toSave) {
        //simulating the save action

        for (Object o: toSave.getList()) {
            System.out.println("Saved record: " + o.toString());
        }
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
}
