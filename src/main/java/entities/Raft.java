package entities;

import lombok.Getter;
import stats.RaftStats;
import stats.Size;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
public class Raft extends Entity implements intefaces.Raft {
    @Getter
    private RaftInventory inventory;
    private Size size;
    private List<RaftStats> raftStats;

    public Raft(String name) {
        super(name);
    }

    // Self methods, getters
    @Override
    public int hashCode() {
        int result = this.getName().hashCode() + this.getInventory().hashCode();
        result = 31 * result + this.getSize().hashCode();

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Raft raft = (Raft) o;
        return this.getName() == raft.getName();
    }

    @Override
    public String toString() {
        return "Raft{" +
                "inventory=" + inventory +
                ", size=" + size +
                ", raftStats=" + raftStats +
                '}';
    }

    @Override
    public Size setSize(int countOfItems) {
        if (countOfItems <= 3) {
            return Size.SMALL;
        } else if (countOfItems <= 7) {
            return Size.MEDIUM;
        } else {
            return Size.BIG;
        }
    }

    public boolean isItemInRaftInventory(Item item) {
        return this.inventory.items().contains(item);
    }

    //Raft interface
    @Override
    public void setRaftInventory(Item... items) {
        ArrayList<Item> itemsArray = new ArrayList<>(Arrays.asList(items));

        this.size = setSize(itemsArray.size());
        this.inventory = new RaftInventory(itemsArray);
    }

    @Override
    public boolean checkItemContains(Item item) {
        return this.inventory.items().contains(item);
    }

    @Override
    public void setRaftStats(RaftStats... stats) {
        this.raftStats = Arrays.asList(stats);
    }
}
