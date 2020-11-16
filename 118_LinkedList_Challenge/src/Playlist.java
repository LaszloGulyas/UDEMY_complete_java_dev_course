import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {
    
    private String nameOfPlaylist;
    private LinkedList<Song> tracklist;

    public Playlist(String nameOfPlaylist) {
        this.nameOfPlaylist = nameOfPlaylist;
        tracklist = new LinkedList<>();
    }

    public void load() {
        if (tracklist.isEmpty()) {
            System.out.println("empty playlist, program exit");
            return;
        }

        boolean quit = false;
        boolean movingForward = true;
        Scanner scanner = new Scanner(System.in);
        ListIterator<Song> listIterator = tracklist.listIterator();

        System.out.println("\nNow playing: " + listIterator.next().getTitle());
        while (!quit) {
            if (tracklist.isEmpty()) {
                System.out.println("empty playlist, program exit");
                return;
            }
            printMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("exit program");
                    quit = true;
                    break;
                case 1:
                    if (!movingForward) {
                        listIterator.next();
                        movingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing: " + listIterator.next().getTitle());
                    } else {
                        System.out.println("This is the last song on the list");
                    }
                    break;
                case 2:
                    if (movingForward) {
                        listIterator.previous();
                        movingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing: " + listIterator.previous().getTitle());
                    } else {
                        System.out.println("This is the first song on the list");
                    }
                    break;
                case 3:
                    if (movingForward) {
                        System.out.println("Replaying: " + listIterator.previous().getTitle());
                        listIterator.next();
                    } else {
                        System.out.println("Replaying: " + listIterator.next().getTitle());
                        listIterator.previous();
                    }
                    break;
                case 4:
                    System.out.println("List of all songs on this playlist:");
                    int i=1;
                    for (Song s : tracklist) {
                        System.out.println(i + ". " + s.getTitle());
                        i++;
                    }
                    break;
                case 9:
                    listIterator.remove();
                    System.out.println("Current song removed");
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing: " + listIterator.next().getTitle());
                        movingForward = true;
                    } else if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().getTitle());
                        movingForward = false;
                    }
                    break;
            }
        }
    }

    private void printMenu() {
        System.out.println("Enter a number to select an option:\n" +
                "0 - quit\n" +
                "1 - play next song\n" +
                "2 - play previous song\n" +
                "3 - replay current song\n" +
                "4 - list all songs\n" +
                "9 - remove current song from the playlist");
    }

    public void addNewSong(Album album, int index) {
        Song s = album.getSong(index);
        if (s != null) {
            tracklist.add(s);
        }
    }
}
