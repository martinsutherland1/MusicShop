package items.accessories;

import items.Item;

public class Drumsticks extends Item {

    String material;

    public Drumsticks(String name, double buyPrice, double sellPrice, String material) {
        super(name, buyPrice, sellPrice);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
