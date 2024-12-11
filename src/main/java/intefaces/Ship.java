package intefaces;

import entities.Item;

public interface Ship {
    void setShipInventory(Item... items);
    void removeItemFromInventory(Item... items);
}
