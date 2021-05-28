package accessoriesTests;

import items.accessories.Drumsticks;
import items.accessories.InstrumentStand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsticksTest {

    Drumsticks drumsticks;

    @Before
    public void before() {
        drumsticks= new Drumsticks("Promark Hickory", 10.00, 20.00, "wood");
    }

    @Test
    public void hasName() {
        assertEquals("Promark Hickory", drumsticks.getName());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(20.00, drumsticks.getSellPrice(), 0.0);
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(10.00, drumsticks.getBuyPrice(), 0.0);
    }

    @Test
    public void hasMarkUpPrice(){
        assertEquals(10.00, drumsticks.calculateMarkUp(), 0.0);
    }
}
