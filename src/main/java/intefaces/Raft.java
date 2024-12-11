package intefaces;

import entities.Item;
import entities.RaftInventory;
import stats.RaftStats;

public interface Raft {
    void setRaftInventory(Item... items);
    boolean checkItemContains(Item item);
    void setRaftStats(RaftStats... stats);
}
