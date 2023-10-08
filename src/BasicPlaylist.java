import java.util.*;

public class BasicPlaylist implements PlaylistCreator {
    private String playlistName;
    private List<String> songs = new ArrayList<>();

    @Override
    public void createPlaylist(String playlistName) {
        this.playlistName = playlistName;
    }

    @Override
    public void addSong(String song) {
        songs.add(song);
    }

    @Override
    public void displayPlaylist() {
        System.out.println("Playlist: " + playlistName);
        for (String song : songs) {
            System.out.println("- " + song);
        }
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
