package entities;

import java.util.List;

public record RaftInventory(List<Item> items) {
    public int getCountOfItems() {
        if (items != null) {
            return items.size();
        } else {
            return 0;
        }
    }
}
