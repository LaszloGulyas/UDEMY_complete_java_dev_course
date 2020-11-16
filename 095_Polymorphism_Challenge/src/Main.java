class Car {

    private String name;
    private String color;
    private int cylinders;
    private boolean engine;
    private int wheels;

    public Car(int cylinders, String name) {
        this(cylinders, name, "grey");
    }

    public Car(int cylinders, String name, String color) {
        this.cylinders = cylinders;
        this.name = name;
        this.color = color;
        this.wheels = 4;
        this.engine = true;
    }

    public void startEngine() {
        if(!engine) {
            System.out.println("There is no engine in the car");
            return;
        }
        System.out.println("Engine has started");
    }

    public void accelerate() {
        System.out.println("Speed is increasing");
    }

    public void brake() {
        System.out.println("Car is slowing down");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getCylinders() {
        return cylinders;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }
}

class Ferrari extends Car {

    public Ferrari() {
        super(12, "Ferrari");
    }

    @Override
    public void startEngine() {
        System.out.println("Keys are missing");
    }
}

class Porsche extends Car {

    public Porsche() {
        super(10, "Porsche");
    }
}

class Ford extends Car {

    public Ford() {
        this("grey");
    }

    public Ford(String color) {
        super(8, "Ford", color);
    }


    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Crunchy noise is coming from the hood");
    }

    @Override
    public void brake() {
        System.out.println("Brake has malfunctioned, nothing happens...");
    }
}


public class Main {

    public static void main(String[] args) {

        Car myFord = new Ford("Black");

        System.out.println(myFord.getName() + "\n" + myFord.getWheels());
        myFord.startEngine();
        myFord.brake();

        Porsche myPorsche = new Porsche();
        System.out.println("\n" + myPorsche.getName());
        System.out.println(myPorsche.getColor());
        myPorsche.brake();

        System.out.println(myPorsche.getName());
    }
}
