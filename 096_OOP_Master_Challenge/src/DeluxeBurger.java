import java.util.Scanner;

public class DeluxeBurger extends Hamburger {

    private int baseBurgerPrice;
    private int chipsPrice;
    private int drinksPrice;

    //private boolean chips = true;
    //private boolean drinks = true;

    public DeluxeBurger(String name, String bread, String meat) {
        super(name, bread, meat);
        baseBurgerPrice = 1600;
        chipsPrice = 350;
        drinksPrice = 550;
    }

    public int getChipsPrice() {
        return chipsPrice;
    }

    public int getDrinksPrice() {
        return drinksPrice;
    }

    @Override
    public void orderBurger() {
        getFinalSum();
    }

    @Override
    public void getFinalSum() {
        int finalSum = this.baseBurgerPrice;
        System.out.println("Final cost list: \n" +
                "Base price of Burger: " + this.baseBurgerPrice);

        System.out.println("Chips: " + getChipsPrice());
        finalSum += getChipsPrice();

        System.out.println("Drinks: " + getDrinksPrice());
        finalSum += getDrinksPrice();

        System.out.println("\n Grand Total: " + finalSum);
    }
}
