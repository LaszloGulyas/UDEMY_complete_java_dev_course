public class Main {

    public static void main(String[] args) {

        Wall northWall = new Wall(5,20);
        Wall eastWall = new Wall(5,10);
        Wall southWall = new Wall(5,20);
        Wall westWall = new Wall(5,10);

        Table diningTable = new Table("brown", "wood");

        Door doorToStreet = new Door("brown", "wood", true, false);
        Door doorToKitchen = new Door("white", "plastic", false, false);

        Couch livingCouch = new Couch("yellow", 3);

        Room livingRoom = new Room(diningTable, livingCouch, northWall, eastWall, southWall, westWall,
                doorToStreet, doorToKitchen);

        //livingRoom.enterFromKitchen();

        System.out.println("Current color is " + livingRoom.getWallNorth().getColor());

        livingRoom.getWallNorth().paintTheWall("Green");
        livingRoom.getWallEast().paintTheWall("Green");
        livingRoom.getWallSouth().paintTheWall("Green");
        livingRoom.getWallWest().paintTheWall("Green");

        System.out.println("Current color is " + livingRoom.getWallNorth().getColor());

        livingRoom.exitToStreet();
        livingRoom.exitToKitchen();

    }
}
