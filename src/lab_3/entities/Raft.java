package lab_3.entities;

import lab_3.entities.moves.UniversalMoves;
import lab_3.entities.stats.Size;

import java.util.ArrayList;
import java.util.List;

public record Raft(String name, List<Item> inventory, Size size) implements UniversalMoves {

    public Raft(String name, List<Item> inventory) {
        this(name, inventory, setSize(inventory.size()));
    }

    private static Size setSize(int countOfItems) {
        if (countOfItems <= 3) {
            return Size.SMALL;
        } else if (countOfItems <= 7) {
            return Size.MEDIUM;
        } else {
            return Size.BIG;
        }
    }

    @Override
    public String getInventory(ArrayList<Item> items) {
        return this.inventory.toString();
    }
}
