package items.instruments;

public class Piano extends Instrument implements IPlay{

    public Piano(String name, double buyPrice, double sellPrice, InstrumentTypes instrumentType, String colour, String material) {
        super(name, buyPrice, sellPrice, instrumentType, colour, material);
    }

    public String Play(){
        return "piano sounds great!";
    }
}
