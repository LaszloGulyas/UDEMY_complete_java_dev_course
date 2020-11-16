public class Room {

    private Table table;
    private Couch couch;
    private Wall wallNorth;
    private Wall wallEast;
    private Wall wallSouth;
    private Wall wallWest;
    private Door doorNorth;
    private Door doorEast;

    public Room (Table table, Couch couch, Wall wallNorth, Wall wallEast, Wall wallSouth, Wall wallWest,
                 Door doorNorth, Door doorEast) {

        this.table = table;
        this.couch = couch;
        this. wallNorth = wallNorth;
        this. wallEast = wallEast;
        this. wallSouth = wallSouth;
        this. wallWest = wallWest;
        this.doorNorth = doorNorth;
        this.doorEast = doorEast;
    }

    public void enterFromStreet () {
        getDoorNorth().goThroughDoor();
    }

    public void exitToStreet () {
        getDoorNorth().goThroughDoor();
    }

    public void enterFromKitchen() {
        getDoorEast().goThroughDoor();
    }

    public void exitToKitchen() {
        getDoorEast().goThroughDoor();
    }

    public void setTable (Table table) {
        this.table = table;
    }

    public void setCouch(Couch couch) {
        this.couch = couch;
    }

    public void setWallNorth(Wall wallNorth) {
        this.wallNorth = wallNorth;
    }

    public void setWallEast(Wall wallEast) {
        this.wallEast = wallEast;
    }

    public void setWallSouth(Wall wallSouth) {
        this.wallSouth = wallSouth;
    }

    public void setWallWest(Wall wallWest) {
        this.wallWest = wallWest;
    }

    public void setDoorNorth(Door doorNorth) {
        this.doorNorth = doorNorth;
    }

    public void setDoorEast(Door doorEast) {
        this.doorEast = doorEast;
    }

    public Table getTable () {
        return table;
    }

    public Couch getCouch() {
        return couch;
    }

    public Wall getWallNorth() {
        return wallNorth;
    }

    public Wall getWallEast() {
        return wallEast;
    }

    public Wall getWallSouth() {
        return wallSouth;
    }

    public Wall getWallWest() {
        return wallWest;
    }

    public Door getDoorNorth() {
        return doorNorth;
    }

    public Door getDoorEast() {
        return doorEast;
    }
}
