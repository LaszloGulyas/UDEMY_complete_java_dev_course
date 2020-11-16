import java.util.ArrayList;
import java.util.List;

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
    public List getList() {
        return arrList;
    }

    @Override
    public void addNewElement(List inputList) {
        if (inputList != null && inputList.size()>0) {
            for (Object o: inputList) {
                arrList.add(o);
            }
        }
    }
}
