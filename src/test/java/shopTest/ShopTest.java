package shopTest;

import items.accessories.Drumsticks;
import items.accessories.GuitarStrings;
import items.accessories.InstrumentStand;
import items.accessories.SheetMusic;
import items.instruments.*;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.*;

public class ShopTest {

    Guitar guitar;
    Saxophone saxophone;
    Piano piano;
    Trumpet trumpet;
    GuitarStrings guitarStrings;
    InstrumentStand instrumentStand;
    Drumsticks drumsticks;
    SheetMusic sheetMusic;
    Shop shop;


    @Before
    public void before(){
        guitar = new Guitar("base", 100.00, 220.00, InstrumentTypes.guitar, "blue", "wood", 4);
        piano = new Piano("grand", 1000.00, 2200.00, InstrumentTypes.piano, "black", "wood");
        saxophone = new Saxophone("soprano", 80.00, 120.00, InstrumentTypes.saxophone, "gold", "brass");
        trumpet = new Trumpet("flugelhorn", 100.00, 160.00, InstrumentTypes.trumpet, "gold", "brass", 3);
        drumsticks= new Drumsticks("Promark Hickory", 10.00, 20.00, "wood");
        guitarStrings = new GuitarStrings("Steel and Nickel", 4.00, 10.00, 10);
        instrumentStand = new InstrumentStand("saxophone stand", 40.00, 80.00);
        sheetMusic = new SheetMusic("The sound of silence", 6.00, 12.00, "Paul Simon", "pop");
        shop = new Shop("Ray's Music Exchange");
    }

    @Test
    public void hasName() {
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void canAddStock() {
        shop.addItemToStock(guitar);
        assertEquals(1, shop.getStockSize());
        assertTrue(shop.getItems().contains(guitar));
    }

    @Test
    public void canRemoveStock() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(piano);
        assertTrue(shop.getItems().contains(guitar));
        assertTrue(shop.getItems().contains(piano));
        shop.removeItemFromStock(piano);
        assertFalse(shop.getItems().contains(piano));
    }

    @Test
    public void hasProfitValueAndStockValue() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(piano);
        shop.addItemToStock(trumpet);
        shop.addItemToStock(saxophone);
        shop.addItemToStock(guitarStrings);
        shop.addItemToStock(sheetMusic);
        shop.addItemToStock(drumsticks);
        shop.addItemToStock(instrumentStand);
//        assertEquals(1482.00, shop.getTotalProfit(), 0.0);
        assertEquals(2822.00, shop.getStockValue(), 0.0);
    }
}
