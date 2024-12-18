public class Artist {
    String name;
    String musicType;

    public Artist(String n, String m) {
        name = n;
        musicType = m;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getMusicType() {
        return musicType;
    }

    public void setMusicType(String m) {
        musicType = m;
    }

    public String toString() {
        return "Artist: " + name + ", Genre: " + musicType;
    }
}
