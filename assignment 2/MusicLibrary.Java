import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

abstract class MusicEntity {
    protected final String name;

    public MusicEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String toString();
}

class Song extends MusicEntity {
    private final String artist;
    private final String genre;
    private final int duration; // в секундах

    public Song(String name, String artist, String genre, int duration) {
        super(name);
        this.artist = artist;
        this.genre = genre;
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", duration=" + duration + " сек.}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Song song = (Song) obj;
        return duration == song.duration &&
                name.equals(song.name) &&
                artist.equals(song.artist) &&
                genre.equals(song.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, artist, genre, duration);
    }
}

class Playlist extends MusicEntity {
    private final List<Song> songs;

    public Playlist(String name) {
        super(name);
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public List<Song> filterByGenre(String genre) {
        return songs.stream()
                .filter(song -> song.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }

    public List<Song> searchByName(String keyword) {
        return songs.stream()
                .filter(song -> song.getName().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Song> sortByDuration() {
        return songs.stream()
                .sorted((s1, s2) -> Integer.compare(s1.getDuration(), s2.getDuration()))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "name='" + name + '\'' +
                ", songs=" + songs +
                '}';
    }
}

public class MusicLibrary {
    public static void main(String[] args) {
        Song song1 = new Song("Shape of You", "Ed Sheeran", "Поп", 240);
        Song song2 = new Song("Blinding Lights", "The Weeknd", "Синтипоп", 200);
        Song song3 = new Song("Bohemian Rhapsody", "Queen", "Рок", 360);

        Playlist playlist = new Playlist("Мои любимые песни");
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);

        System.out.println(playlist);
        System.out.println("Фильтр по жанру (Поп): " + playlist.filterByGenre("Поп"));
        System.out.println("Сортировка по длительности: " + playlist.sortByDuration());
    }
}

