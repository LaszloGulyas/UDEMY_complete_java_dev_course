public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;

        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        return "Car : The car's engine is starting";
    }

    public String accelerate() {
        return "Car : The car is accelerating";
    }

    public String brake() {
        return "Car : The car is braking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
