import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {

    private String name;
    private int hitPoints;
    private  int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> params = new ArrayList<>();
        params.add(name);
        params.add(Integer.toString(hitPoints));
        params.add(Integer.toString(strength));
        return params;
    }

    @Override
    public void read(List<String> params) {
        if (params != null && params.size() > 0) {
            this.name = params.get(0);
            this.hitPoints = Integer.parseInt(params.get(1));
            this.strength = Integer.parseInt(params.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }
}
