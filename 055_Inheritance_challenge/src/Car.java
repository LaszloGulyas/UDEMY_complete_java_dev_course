public class Car extends Vehicle {

    private int gears;

//Constructors

    public Car(String steering, double speed, int gears) {
        super(steering, speed);
        this.gears = gears;
    }

}
