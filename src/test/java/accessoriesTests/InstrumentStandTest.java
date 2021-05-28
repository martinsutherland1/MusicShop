package accessoriesTests;

import items.accessories.InstrumentStand;
import items.instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentStandTest {

    InstrumentStand instrumentStand;

    @Before
    public void before() {
        instrumentStand = new InstrumentStand("saxophone stand", 40.00, 80.00);
    }

    @Test
    public void hasName() {
        assertEquals("saxophone stand", instrumentStand.getName());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(80.00, instrumentStand.getSellPrice(), 0.0);
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(40.00, instrumentStand.getBuyPrice(), 0.0);
    }

    @Test
    public void hasMarkUpPrice(){
        assertEquals(40.00, instrumentStand.calculateMarkUp(), 0.0);
    }
}
