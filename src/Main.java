public class Main {
    public static void main(String[] args) {
        PlaylistCreator playlist = new BasicPlaylist();
        playlist.createPlaylist("My Favourite Playlist");

        playlist.addSong("Silhouette");
        playlist.addSong("In The End");
        playlist.addSong("Eternal Youth");
        playlist.addSong("Aruarian Dance");
        playlist.addSong("Paint");

        playlist.displayPlaylist();
        System.out.println();

        PlaylistCreator sortedPlaylist = new SortingDecorator(playlist);
        sortedPlaylist.displayPlaylist();
        System.out.println();

        PlaylistCreator shuffledPlaylist = new ShufflingDecorator(playlist);
        shuffledPlaylist.displayPlaylist();
    }
}