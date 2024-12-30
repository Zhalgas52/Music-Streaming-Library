import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class MusicManager {
    private List<Artist> artists;

    public MusicManager() {
        this.artists = new ArrayList<>();
    }
  
    public void addArtist(Artist artist) {
        artists.add(artist);
    }

    public List<Artist> filterByGenre(String genre) {
        return artists.stream()
                .filter(artist -> artist.getMusicType().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }

    public Artist findByName(String name) {
        return artists.stream()
                .filter(artist -> artist.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public List<Artist> sortByName() {
        return artists.stream()
                .sorted(Comparator.comparing(Artist::getName))
                .collect(Collectors.toList());
    }

    public void displayAllArtists() {
        artists.forEach(System.out::println);
    }
}

class Main {
    public static void main(String[] args) {
        MusicManager manager = new MusicManager();

        manager.addArtist(new Artist("Taylor Swift", "Pop"));
        manager.addArtist(new Band("Coldplay", "Rock", 4));
        manager.addArtist(new Artist("Eminem", "Rap"));

        System.out.println("All Artists:");
        manager.displayAllArtists();

        System.out.println("\nFiltered by Genre (Pop):");
        List<Artist> popArtists = manager.filterByGenre("Pop");
        popArtists.forEach(System.out::println);

        System.out.println("\nFind Artist by Name (Eminem):");
        Artist eminem = manager.findByName("Eminem");
        System.out.println(eminem);

        System.out.println("\nSorted by Name:");
        List<Artist> sortedArtists = manager.sortByName();
        sortedArtists.forEach(System.out::println);
    }
}
