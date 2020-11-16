import java.util.Scanner;

public class HealthyBurger extends Hamburger {

    private int baseBurgerPrice;
    private int mushroomPrice;
    private int cucumberPrice;

    private boolean lettuce = false;
    private boolean tomato = false;
    private boolean carrot = false;
    private boolean sauce = false;
    private boolean mushroom = false;
    private boolean cucumber = false;

    public HealthyBurger(String name, String bread, String meat) {
        super(name, bread, meat);
        this.baseBurgerPrice = 1400;
        this.mushroomPrice = 200;
        this.cucumberPrice = 150;
    }

    private void changeLettuce() {
        lettuce = !lettuce;
    }

    private void changeTomato() {
        tomato = !tomato;
    }

    private void changeCarrot() {
        carrot = !carrot;
    }

    private void changeSauce() {
        sauce = !sauce;
    }

    private void changeMushroom() {
        mushroom = !mushroom;
    }

    private void changeCucumber() {
        cucumber = !cucumber;
    }

    public int getMushroomPrice() {
        return mushroomPrice;
    }

    public int getCucumberPrice() {
        return cucumberPrice;
    }

    @Override
    public void orderBurger() {
        System.out.println("Type in the number of preferred additional: \n" +
                "1.) Lettuce " + lettuce + "\n" +
                "2.) Tomato " + tomato + "\n" +
                "3.) Carrot " + carrot + "\n" +
                "4.) Sauce " + sauce + "\n" +
                "5.) Mushroom " + mushroom + "\n" +
                "6.) Cucumber " + cucumber + "\n" +
                "0.) No more additional");

        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.next();

        switch (input) {
            case "1":
                changeLettuce();
                orderBurger();
                break;
            case "2":
                changeTomato();
                orderBurger();
                break;
            case "3":
                changeCarrot();
                orderBurger();
                break;
            case "4":
                changeSauce();
                orderBurger();
                break;
            case "5":
                changeMushroom();
                orderBurger();
                break;
            case "6":
                changeCucumber();
                orderBurger();
                break;
            case "0":
                getFinalSum();
                break;
        }
    }

    @Override
    public void getFinalSum() {
        int finalSum = this.baseBurgerPrice;
        System.out.println("Final cost list: \n" +
                "Base price of Burger: " + this.baseBurgerPrice);
        if(lettuce) {
            System.out.println("Lettuce: " + getLettucePrice());
            finalSum += getLettucePrice();
        }

        if(tomato) {
            System.out.println("Tomato: " + getTomatoPrice());
            finalSum += getTomatoPrice();
        }

        if(carrot) {
            System.out.println("Carrot: " + getCarrotPrice());
            finalSum += getCarrotPrice();
        }

        if(sauce) {
            System.out.println("Sauce: " + getSaucePrice());
            finalSum += getSaucePrice();
        }

        if(mushroom) {
            System.out.println("Mushroom: " + getMushroomPrice());
            finalSum += getMushroomPrice();
        }

        if(cucumber) {
            System.out.println("Cucumber: " + getCucumberPrice());
            finalSum += getCucumberPrice();
        }

        System.out.println("\n Grand Total: " + finalSum);
    }
}
