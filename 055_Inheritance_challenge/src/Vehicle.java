public class Vehicle {

    private String steering;
    private double speed;

//Constructors

    public Vehicle() {
        this("Center", 0);
    }

    public Vehicle(String steering, double speed) {
        this.steering = steering;
        this.speed = speed;
    }

//Getters

    public String getSteering() {
        return steering;
    }

    public double getSpeed() {
        return speed;
    }
}
