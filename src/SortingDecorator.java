import java.util.*;

public class SortingDecorator extends PlaylistDecorator {
    public SortingDecorator(PlaylistCreator decoratedPlaylist) {
        super(decoratedPlaylist);
    }
    @Override
    public void displayPlaylist() {
        Collections.sort(decoratedPlaylist.getSongs());

        System.out.println("Sorted Playlist:");
        super.displayPlaylist();
    }
}
