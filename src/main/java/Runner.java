import items.Item;
import items.accessories.Drumsticks;
import items.accessories.GuitarStrings;
import items.accessories.InstrumentStand;
import items.accessories.SheetMusic;
import items.instruments.*;
import shop.Shop;

import javax.sound.midi.Instrument;

public class Runner {

    public static void main(String[] args) {





        Guitar guitar = new Guitar("base", 100.00, 220.00, InstrumentTypes.guitar, "blue", "wood", 4);
        Piano piano = new Piano("grand", 1000.00, 2200.00, InstrumentTypes.piano, "black", "wood");
        Saxophone saxophone = new Saxophone("soprano", 80.00, 120.00, InstrumentTypes.saxophone, "gold", "brass");
        Trumpet trumpet = new Trumpet("flugelhorn", 100.00, 160.00, InstrumentTypes.trumpet, "gold", "brass", 3);
        Drumsticks drumsticks= new Drumsticks("Promark Hickory", 10.00, 20.00, "wood");
        GuitarStrings guitarStrings = new GuitarStrings("Steel and Nickel", 4.00, 10.00, 10);
        InstrumentStand instrumentStand = new InstrumentStand("saxophone stand", 40.00, 80.00);
        SheetMusic sheetMusic = new SheetMusic("The sound of silence", 6.00, 12.00, "Paul Simon", "pop");
        Shop shop = new Shop("Ray's Music Exchange");
        shop.addItemToStock(guitar);
        shop.addItemToStock(piano);
        shop.addItemToStock(trumpet);
        shop.addItemToStock(saxophone);
        shop.addItemToStock(guitarStrings);
        shop.addItemToStock(sheetMusic);
        shop.addItemToStock(drumsticks);
        shop.addItemToStock(instrumentStand);

        System.out.println(shop.getStockSize());
        System.out.println(shop.getItems());
        System.out.println(shop.getStockValue());
        System.out.println(guitar.calculateMarkUp());

        double total = 0;

        for (Item item : shop.getItems()){
            total += item.getSellPrice();

        }
        System.out.println(total);
    }
}
