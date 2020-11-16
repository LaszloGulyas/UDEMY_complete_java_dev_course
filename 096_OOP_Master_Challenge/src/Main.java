import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Hamburger basicBurger = new Hamburger("Basic Hamburger", "White bread roll", "Beef");
        HealthyBurger healthyBurger = new HealthyBurger("Healthy Hamburger", "Brown rye bread roll", "Chicken");
        DeluxeBurger deluxeBurger = new DeluxeBurger("Deluxe Hamburger", "Fine bread roll", "Angus beef");

        System.out.println("Select type of Hamburger: \n" +
                "1. Basic Hamburger \n" +
                "2. Healthy Hamburger \n" +
                "3. Deluxe Hamburger \n");

        Scanner inputScanner = new Scanner(System.in);
        String selectedBurgerType = inputScanner.next();

        switch (selectedBurgerType) {
            case "1":
                basicBurger.orderBurger();
                break;
            case "2":
                healthyBurger.orderBurger();
                break;
            case "3":
                deluxeBurger.orderBurger();
                break;
        }
    }
}
