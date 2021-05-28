package instrumentTests;

import items.instruments.InstrumentTypes;
import items.instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("flugelhorn", 100.00, 160.00, InstrumentTypes.trumpet, "gold", "brass", 3);
    }

    @Test
    public void hasName() {
        assertEquals("flugelhorn", trumpet.getName());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(160.00, trumpet.getSellPrice(), 0.0);
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(100.00, trumpet.getBuyPrice(), 0.0);
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentTypes.trumpet, trumpet.getInstrumentType());
    }

    @Test
    public void hasColour(){
        assertEquals("gold", trumpet.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("brass", trumpet.getMaterial());
    }

    @Test
    public void canPlay() {
        assertEquals("trumpet sounds great!", trumpet.Play());
    }

    @Test
    public void hasMarkUpPrice() {
        assertEquals(60.00, trumpet.calculateMarkUp(), 0.0);
    }

    @Test
    public void hasValves() {
        assertEquals(3, trumpet.getValves());
    }
}
