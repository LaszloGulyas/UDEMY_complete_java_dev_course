public class Car extends Vehicle {

    private int doors;
    private int engineCapacity;

    public Car (String name, int doors, int engineCapacity) {

        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }

    public Car (String name, int input) {

        super(name);
        if(input < 10) {
            this.doors = input;
            this.engineCapacity = 1200;
        } else {
            this.doors = 4;
            this.engineCapacity = input;
        }

    }

    public int getDoors() {
        return doors;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

}
