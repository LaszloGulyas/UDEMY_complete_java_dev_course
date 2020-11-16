import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Song eiffelBlue = new Song("Blue", 215);

        Album summerHits = new Album("SummerHits");
          summerHits.addNewSong(new Song("Mambo nr 5", 180));
          summerHits.addNewSong(new Song("Despacito", 200));
          summerHits.addNewSong(new Song("Macarena", 150));

        Album michaelJackson = new Album("MichaelJackson");
          michaelJackson.addNewSong(new Song("Billie Jane", 160));
          michaelJackson.addNewSong(new Song ("Black or White", 220));

        Album pakito = new Album("Pakito");
          pakito.addNewSong(new Song("Living On", 130));

        ArrayList<Album> listOfAlbums = new ArrayList<>();
          listOfAlbums.add(summerHits);
          listOfAlbums.add(michaelJackson);
          listOfAlbums.add(pakito);

        Playlist myPlaylist = new Playlist("favorites");
        for (Album a : listOfAlbums) {
            for (int i=0; i<a.getNrOfTracks(); i++) {
                myPlaylist.addNewSong(a, i);
                System.out.println("Album: " + a.getName() + " | Song: " + a.getSong(i).getTitle() +
                        " have been added to the playlist");
            }
        }

        myPlaylist.load();
    }
}
