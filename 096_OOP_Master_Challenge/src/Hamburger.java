import java.util.Scanner;

public class Hamburger {

    private String name;
    private String bread;
    private String meat;

    private int baseBurgerPrice;
    private int lettucePrice;
    private int tomatoPrice;
    private int carrotPrice;
    private int saucePrice;

    private boolean lettuce = false;
    private boolean tomato = false;
    private boolean carrot = false;
    private boolean sauce = false;


    public Hamburger(String name, String bread, String meat) {
        this.name = name;
        this.bread = bread;
        this.meat = meat;
        this.baseBurgerPrice = 1200;
        this.lettucePrice = 100;
        this.tomatoPrice = 150;
        this.carrotPrice = 100;
        this.saucePrice = 120;
    }

    public int getLettucePrice() {
        return lettucePrice;
    }

    public int getTomatoPrice() {
        return tomatoPrice;
    }

    public int getCarrotPrice() {
        return carrotPrice;
    }

    public int getSaucePrice() {
        return saucePrice;
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

    public void orderBurger() {

        System.out.println("Type in the number of preferred additional: \n" +
                "1.) Lettuce " + lettuce + "\n" +
                "2.) Tomato " + tomato + "\n" +
                "3.) Carrot " + carrot + "\n" +
                "4.) Sauce " + sauce + "\n" +
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
            case "0":
                getFinalSum();
                break;
        }
    }

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

        System.out.println("\n Grand Total: " + finalSum);
    }
}