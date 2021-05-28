package items.instruments;

import items.Item;

public class Saxophone extends Instrument implements IPlay{


    public Saxophone(String name, double buyPrice, double sellPrice, InstrumentTypes instrumentType, String colour, String material) {
        super(name, buyPrice, sellPrice, instrumentType, colour, material);

    }

    public String Play(){
        return "saxophone sounds great!";
    }


}


