public class Main {

    public static void main(String[] args) {

        MajorTeam majorTeam1 = new MajorTeam("team1");
        majorTeam1.setTotalScore(1);
        MajorTeam majorTeam2 = new MajorTeam("team2");
        majorTeam2.setTotalScore(2);
        MinorTeam minorTeam1 = new MinorTeam("team3");
        minorTeam1.setTotalScore(3);
        MinorTeam minorTeam2 = new MinorTeam("team4");
        minorTeam2.setTotalScore(4);

        League<MajorTeam> majorLeague = new League<>();
        League<MinorTeam> minorLeague = new League<>();

        majorLeague.addTeam(majorTeam1);
        majorLeague.addTeam(majorTeam2);
        minorLeague.addTeam(minorTeam1);
        minorLeague.addTeam(minorTeam2);

        majorLeague.printTeams();
        minorLeague.printTeams();

//        these should fail at compile
//        majorLeague.addTeam(minorTeam1);
//        minorLeague.addTeam(majorTeam2);
    }
}
