public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi : The car's engine is starting";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi : The car is accelerating";
    }

    @Override
    public String brake() {
        return "Mitsubishi : The car is braking";
    }
}
