package instrumentTests;

import items.instruments.Guitar;
import items.instruments.InstrumentTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("base", 100.00, 220.00, InstrumentTypes.guitar, "blue", "wood", 4);
    }

    @Test
    public void hasName() {
        assertEquals("base", guitar.getName());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(220.00, guitar.getSellPrice(), 0.0);
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(100.00, guitar.getBuyPrice(), 0.0);
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentTypes.guitar, guitar.getInstrumentType());
    }

    @Test
    public void hasColour(){
        assertEquals("blue", guitar.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void canPlay() {
        assertEquals("guitar sounds great!", guitar.Play());
    }

    @Test
    public void hasMarkUpPrice() {
        assertEquals(120.00, guitar.calculateMarkUp(), 0.0);
    }

    @Test
    public void hasStrings() {
        assertEquals(4, guitar.getStrings());
    }
}
