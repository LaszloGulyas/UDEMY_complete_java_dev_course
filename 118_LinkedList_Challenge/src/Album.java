import java.util.ArrayList;

public class Album {

    private String name;
    private ArrayList<Song> listOfSongs;

    public Album(String name) {
        this.name = name;
        listOfSongs = new ArrayList<>();
    }

    public Song getSong(int index) {
        if (index>listOfSongs.size()) return null;
        return listOfSongs.get(index);
    }

    public int getNrOfTracks() {
        return listOfSongs.size();
    }

    public void addNewSong(Song s) {
        listOfSongs.add(s);
    }

    public String getName() {
        return name;
    }
}
