import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    ArrayList<T> teams;

    public League() {
        this.teams = new ArrayList<>();
    }

    public void addTeam(T team) {
        teams.add(team);
    }

    public void printTeams() {
        ArrayList<T> listToPrint = new ArrayList<>(teams);
        Collections.sort(listToPrint);
        Collections.reverse(listToPrint);
        listToPrint.stream()
                .map(team -> team.getName() + ": " + team.getTotalScore())
                .forEach(System.out::println);
    }
}
