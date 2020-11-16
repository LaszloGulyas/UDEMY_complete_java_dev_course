public class Main {

    public static void main(String[] args) {

        Ford frd123 = new Ford("Center", 100, 6);
        Vehicle train = new Vehicle();
        Car mazda = new Car("Center", 70, 5);

        System.out.println("Ford FRD123 Steering direction: " + frd123.getSteering());
        System.out.println("Ford FRD123 Speed: " + frd123.getSpeed());

        System.out.println("Train speed: " + train.getSpeed());
    }
}
