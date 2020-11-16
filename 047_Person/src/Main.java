public class Main {

    public static void main(String[] args) {

        // test script

        Person guest = new Person();

        guest.setFirstName("Adam");
//        guest.setLastName("Smith");
        guest.setAge(35);

        System.out.print("Name is: " + guest.getFullName());
        System.out.println("Is this person a teen? " + guest.isTeen());
    }
}
