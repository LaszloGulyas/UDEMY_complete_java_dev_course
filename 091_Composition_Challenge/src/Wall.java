public class Wall {

    private int height;
    private int width;
    private String color;

    public Wall(int height, int width) {
        this(height, width, "white");
    }

    public Wall(int height, int width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public void paintTheWall(String color) {
        this.color = color;
        System.out.println("The new color is: " + color);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }
}
