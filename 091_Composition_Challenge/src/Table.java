public class Table {

    private int legs;
    private String color;
    private String material;

    public Table(String color, String material) {
        this(4, color, material);
    }

    public Table(int legs, String color, String material) {
        this.legs = legs;
        this.color = color;
        this.material = material;
    }
}
