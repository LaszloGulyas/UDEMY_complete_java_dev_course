import java.util.ArrayList;

public class Players implements ISaveable {

    private ArrayList<Object> arrList;

    public Players() {
        arrList = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Players)) return false;
        Players players = (Players) o;
        return arrList.equals(players.arrList);
    }

    @Override
    public String toString() {
        return "Players{" +
                "arrList=" + arrList +
                '}';
    }

    @Override
    public ArrayList getList() {
        return arrList;
    }

    @Override
    public void addNewElement(ArrayList inputList) {
        for (Object o: inputList) {
            arrList.add(o);
        }
    }
}
