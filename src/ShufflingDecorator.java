import java.util.Collections;

public class ShufflingDecorator extends PlaylistDecorator {
    public ShufflingDecorator(PlaylistCreator decoratedPlaylist) {
        super(decoratedPlaylist);
    }
    @Override
    public void displayPlaylist() {
        Collections.shuffle(decoratedPlaylist.getSongs());

        System.out.println("Shuffled Playlist:");
        super.displayPlaylist();
    }
}
