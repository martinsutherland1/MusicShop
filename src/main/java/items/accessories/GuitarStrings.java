package items.accessories;

import items.Item;



public class GuitarStrings extends Item {

    int quantity;

    public GuitarStrings(String name, double buyPrice, double sellPrice, int quantity) {
        super(name, buyPrice, sellPrice);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
