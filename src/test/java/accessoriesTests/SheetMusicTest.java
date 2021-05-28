package accessoriesTests;

import items.accessories.InstrumentStand;
import items.accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.VisibilityHelper;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("The sound of silence", 6.00, 12.00, "Paul Simon", "pop");
    }

    @Test
    public void hasNameArtistGenre() {
        assertEquals("The sound of silence", sheetMusic.getName());
        assertEquals("Paul Simon", sheetMusic.getArtist());
        assertEquals("pop", sheetMusic.getGenre());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(12.00, sheetMusic.getSellPrice(), 0.0);
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(6.00, sheetMusic.getBuyPrice(), 0.0);
    }

    @Test
    public void hasMarkUpPrice(){
        assertEquals(6.00, sheetMusic.calculateMarkUp(), 0.0);
    }




}
