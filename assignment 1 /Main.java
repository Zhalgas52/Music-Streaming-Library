public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("Strategy", "TWICE", "K-pop", "Strategy");
        Song song2 = new Song("Like It Like It", "TWICE", "K-pop", "Strategy");
        Song song3 = new Song("6AM in Budapesht", "OG Buda", "Trap", "Miss you but working");

        Playlist playlist1 = new Playlist("K-pop", 2);
        Playlist playlist2 = new Playlist("TrapVibes", 1);

        Artist artist1 = new Artist("TWICE", "K-pop");
        Artist artist2 = new Artist("OG Buda", "Trap");

        System.out.println(song1.toString());
        System.out.println();

        System.out.println(song2.toString());
        System.out.println();

        System.out.println(song3.toString());
        System.out.println();

        if (song1.getAlbum().equals(song2.getAlbum())) {
            System.out.println("Songs \"" + song1.getTitle() + "\" and \"" + song2.getTitle() + "\" are from the same album: " + song1.getAlbum());
        } else {
            System.out.println("Songs \"" + song1.getTitle() + "\" and \"" + song2.getTitle() + "\" are from different albums.");
        }
        System.out.println();

        if (song2.getAlbum().equals(song3.getAlbum())) {
            System.out.println("Songs \"" + song2.getTitle() + "\" and \"" + song3.getTitle() + "\" are from the same album: " + song2.getAlbum());
        } else {
            System.out.println("Songs \"" + song2.getTitle() + "\" and \"" + song3.getTitle() + "\" are from different albums.");
        }
        System.out.println();

        if (song1.getAlbum().equals(song3.getAlbum())) {
            System.out.println("Songs \"" + song1.getTitle() + "\" and \"" + song3.getTitle() + "\" are from the same album: " + song1.getAlbum());
        } else {
            System.out.println("Songs \"" + song1.getTitle() + "\" and \"" + song3.getTitle() + "\" are from different albums.");
        }
        System.out.println();

        System.out.println(playlist1.toString());
        System.out.println(playlist2.toString());
        System.out.println();

        System.out.println(artist1.toString());
        System.out.println(artist2.toString());
    }
}
