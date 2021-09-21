import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public boolean addSong(String songTitle, double songDuration) {
        if (findSong(songTitle) == null) {
            songs.add(new Song(songTitle, songDuration));
            return true;
        } else {
            return false;
        }
    }

    private Song findSong(String songTitle) {
        for (Song s : songs) {
            if (s.getTitle().equals(songTitle)) {
                return s;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        if (trackNumber > 0 && trackNumber <= songs.size()) {
            Song s = songs.get(trackNumber - 1);
            if (!playList.contains(s)) {
                playList.add(s);
                return true;
            }
        }
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playList) {
        Song s = findSong(songTitle);
        if (s != null) {
            playList.add(s);
            return true;
        } else {
            return false;
        }
    }
}
