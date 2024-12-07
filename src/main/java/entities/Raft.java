package entities;

import intefaces.Universal;
import stats.Size;

import java.util.ArrayList;
import java.util.List;


public record Raft(String name, List<Item> inventory, Size size) implements Universal, intefaces.Raft {

    public Raft(String name, List<Item> inventory) {
        this(name, inventory, setSize(inventory.size()));
    }

    // Setters
    private static Size setSize(int countOfItems) {
        if (countOfItems <= 3) {
            return Size.SMALL;
        } else if (countOfItems <= 7) {
            return Size.MEDIUM;
        } else {
            return Size.BIG;
        }
    }

    // Self methods, getters
    @Override
    public String getInventory(ArrayList<Item> items) {
        return this.inventory.toString();
    }
}
