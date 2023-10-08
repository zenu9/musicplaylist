import java.util.List;

public interface PlaylistCreator {
    void createPlaylist(String playlistName);
    void addSong(String song);
    void displayPlaylist();
    List<String> getSongs();
}
