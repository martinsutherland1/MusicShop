package shop;

import items.Item;


import java.util.ArrayList;

public class Shop {

    String name;
    ArrayList<Item> items;

    public Shop(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();

    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItemToStock(Item item){
        this.items.add(item);
    }

    public void removeItemFromStock(Item item){
        this.items.remove(item);
    }

    public int getStockSize(){
        return this.items.size();
    }

    public double getTotalProfit(){
        double total = 0.00;

        for (Item item : this.items){
            total += item.calculateMarkUp();;
        }
        return total;
    }

    public double getStockValue(){
        double total = 0.00;

        for (Item item : getItems()){
            total += item.getSellPrice();

        }
        return total;
    }
}
