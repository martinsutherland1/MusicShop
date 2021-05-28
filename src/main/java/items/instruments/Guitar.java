package items.instruments;

public class Guitar extends Instrument implements IPlay{

    int strings;

    public Guitar(String name, double buyPrice, double sellPrice, InstrumentTypes instrumentType, String colour, String material, int strings) {
        super(name, buyPrice, sellPrice, instrumentType, colour, material);
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    public String Play(){
        return "guitar sounds great!";
    }
}
