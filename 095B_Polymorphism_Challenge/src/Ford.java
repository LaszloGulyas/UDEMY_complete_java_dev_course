public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford : The car's engine is starting";
    }

    @Override
    public String accelerate() {
        return "Ford : The car is accelerating";
    }

    @Override
    public String brake() {
        return "Ford : The car is braking";
    }
}
