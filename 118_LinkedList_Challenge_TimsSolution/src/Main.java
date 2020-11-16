import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album testAlbum = new Album("test album", "test artist");
        testAlbum.addSong("test song", 20);
        testAlbum.addSong("test song 2", 20);
        albums.add(testAlbum);

        LinkedList<Song> playlist = new LinkedList<>();

        testAlbum.addToPlaylist(0, playlist);
        testAlbum.addToPlaylist(1, playlist);
        testAlbum.addToPlaylist(2, playlist);
        testAlbum.addToPlaylist(3, playlist);


        System.out.println(playlist.toString());

    }
}
