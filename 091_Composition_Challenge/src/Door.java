public class Door {

    private String color;
    private String material;
    private boolean locked;
    private boolean open;


    public Door (String color, String material, boolean locked, boolean open) {
        this.color = color;
        this.material = material;
        this.locked = locked;
        this.open = open;
    }

    private void openDoor() {
        if(locked) {
            System.out.println("Door is locked, can not enter");
            return;
        }

        if(!open) {
            open = true;
            System.out.println("Door is opened");
        } else {
            System.out.println("Door is already open");
        }
    }

    private void closeDoor() {
        if(open) {
            open = false;
            System.out.println("Door is closed");
        } else {
            System.out.println("Door is already closed");
        }
    }

    public void goThroughDoor() {
        openDoor();
        if(open) {
            System.out.println("Stepping through the door");
            closeDoor();
        }
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isLocked() {
        return locked;
    }

    public boolean isOpen() {
        return open;
    }
}
