package instrumentTests;

import items.instruments.InstrumentTypes;
import items.instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("grand", 1000.00, 2200.00, InstrumentTypes.piano, "black", "wood");
    }

    @Test
    public void hasName() {
        assertEquals("grand", piano.getName());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(2200.00, piano.getSellPrice(), 0.0);
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(1000.00, piano.getBuyPrice(), 0.0);
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentTypes.piano, piano.getInstrumentType());
    }

    @Test
    public void hasColour(){
        assertEquals("black", piano.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void canPlay() {
        assertEquals("piano sounds great!", piano.Play());
    }

    @Test
    public void hasMarkUpPrice() {
        assertEquals(1200.00, piano.calculateMarkUp(), 0.0);
    }


}
