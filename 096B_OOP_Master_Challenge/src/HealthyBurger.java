public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy hamburger", meat, price, "Brown rye roll");
    }

    public void addHealthyAddition1(String additionName, double additionPrice) {
        this.healthyExtra1Name = additionName;
        this.healthyExtra1Price = additionPrice;
    }

    public void addHealthyAddition2(String additionName, double additionPrice) {
        this.healthyExtra2Name = additionName;
        this.healthyExtra2Price = additionPrice;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = 0;

        totalPrice += super.itemizeHamburger();
        totalPrice += healthyExtra1Price;
        totalPrice += healthyExtra2Price;

        return totalPrice;
    }
}
