package lab_3.entities.moves;

import lab_3.entities.Item;

public interface HumanMoves {
    void getCondition();

    String think();
    String think(String thought);

    String pickUp();
    String pickUp(Item item);
}
