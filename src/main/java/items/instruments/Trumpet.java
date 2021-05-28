package items.instruments;

public class Trumpet extends  Instrument implements IPlay{

    int valves;

    public Trumpet(String name, double buyPrice, double sellPrice, InstrumentTypes instrumentType, String colour, String material, int valves) {
        super(name, buyPrice, sellPrice, instrumentType, colour, material);
        this.valves = valves;
    }

    public int getValves() {
        return valves;
    }

    public void setValves(int valves) {
        this.valves = valves;
    }

    public String Play(){
        return "trumpet sounds great!";
    }
}
