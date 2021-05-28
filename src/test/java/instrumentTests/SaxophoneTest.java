package instrumentTests;

import items.instruments.InstrumentTypes;
import items.instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone("soprano", 80.00, 120.00, InstrumentTypes.saxophone, "gold", "brass");
    }

    @Test
    public void hasName() {
        assertEquals("soprano", saxophone.getName());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(120.00, saxophone.getSellPrice(), 0.0);
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(80.00, saxophone.getBuyPrice(), 0.0);
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentTypes.saxophone, saxophone.getInstrumentType());
    }

    @Test
    public void hasColour(){
        assertEquals("gold", saxophone.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("brass", saxophone.getMaterial());
    }

    @Test
    public void canPlay() {
        assertEquals("saxophone sounds great!", saxophone.Play());
    }

    @Test
    public void hasMarkUpPrice() {
        assertEquals(40.00, saxophone.calculateMarkUp(), 0.0);
    }
}
