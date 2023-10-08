import java.util.*;

public class PlaylistDecorator implements PlaylistCreator {
    protected PlaylistCreator decoratedPlaylist;
    public PlaylistDecorator(PlaylistCreator decoratedPlaylist) {
        this.decoratedPlaylist = decoratedPlaylist;
    }
    @Override
    public void createPlaylist(String playlistName) {
        decoratedPlaylist.createPlaylist(playlistName);
    }
    @Override
    public void addSong(String song) {
        decoratedPlaylist.addSong(song);
    }
    @Override
    public void displayPlaylist() {
        decoratedPlaylist.displayPlaylist();
    }
    @Override
    public List<String> getSongs() {
        return decoratedPlaylist.getSongs();
    }
}
