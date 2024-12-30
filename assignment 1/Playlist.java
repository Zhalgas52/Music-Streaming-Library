public class Playlist {
    String title;
    int totalSongs;

    public Playlist(String t, int s) {
        title = t;
        totalSongs = s;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public int getTotalSongs() {
        return totalSongs;
    }

    public void setTotalSongs(int s) {
        totalSongs = s;
    }

    public String toString() {
        return "Playlist: " + title + ", Songs: " + totalSongs;
    }
}
