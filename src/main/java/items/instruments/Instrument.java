package items.instruments;

import items.ISell;
import items.Item;

public abstract class Instrument extends Item {

    private InstrumentTypes instrumentType;
    private String colour;
    private String material;

    public Instrument(String name, double buyPrice, double sellPrice, InstrumentTypes instrumentType, String colour, String material) {
        super(name, buyPrice, sellPrice);
        this.instrumentType = instrumentType;
        this.colour = colour;
        this.material = material;
    }

    public InstrumentTypes getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentTypes instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


}
