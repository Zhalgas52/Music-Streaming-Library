public class Song {
    String title;
    String artist;
    String style;
    String album;

    public Song(String t, String a, String s, String alb) {
        title = t;
        artist = a;
        style = s;
        album = alb;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String a) {
        artist = a;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String s) {
        style = s;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String alb) {
        album = alb;
    }

    public String toString() {
        return "Song: " + title + ", Artist: " + artist + ", Style: " + style + ", Album: " + album;
    }
}
