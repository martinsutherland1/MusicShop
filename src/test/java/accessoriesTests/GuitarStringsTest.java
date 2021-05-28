package accessoriesTests;

import items.accessories.Drumsticks;
import items.accessories.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings("Steel and Nickel", 4.00, 10.00, 10);
    }

    @Test
    public void hasNameStringCount() {
        assertEquals("Steel and Nickel", guitarStrings.getName());
        assertEquals(10, guitarStrings.getQuantity());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(10.00, guitarStrings.getSellPrice(), 0.0);
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(4.00, guitarStrings.getBuyPrice(), 0.0);
    }

    @Test
    public void hasMarkUpPrice(){
        assertEquals(6.00, guitarStrings.calculateMarkUp(), 0.0);
    }
}
