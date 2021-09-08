public class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden : The car's engine is starting";
    }

    @Override
    public String accelerate() {
        return "Holden : The car is accelerating";
    }

    @Override
    public String brake() {
        return "Holden : The car is braking";
    }
}
