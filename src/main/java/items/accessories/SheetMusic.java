package items.accessories;

import items.Item;

public class SheetMusic extends Item {

    String artist;
    String genre;

    public SheetMusic(String name, double buyPrice, double sellPrice, String artist, String genre) {
        super(name, buyPrice, sellPrice);
        this.artist = artist;
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
