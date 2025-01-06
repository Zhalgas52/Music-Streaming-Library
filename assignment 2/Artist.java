import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Artist {
    private String name;
    private String musicType;

    public Artist(String name, String musicType) {
        this.name = name;
        this.musicType = musicType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMusicType() {
        return musicType;
    }

    public void setMusicType(String musicType) {
        this.musicType = musicType;
    }

    public String toString() {
        return "Artist: " + name + ", Genre: " + musicType;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return Objects.equals(name, artist.name) && Objects.equals(musicType, artist.musicType);
    }

    public int hashCode() {
        return Objects.hash(name, musicType);
    }
}

