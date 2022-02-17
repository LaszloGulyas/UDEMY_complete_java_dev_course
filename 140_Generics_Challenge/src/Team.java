public abstract class Team implements Comparable<Team> {

    private String name;

    private int totalScore;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    @Override
    public int compareTo(Team team) {
        return Integer.compare(this.totalScore, team.getTotalScore());
    }
}
