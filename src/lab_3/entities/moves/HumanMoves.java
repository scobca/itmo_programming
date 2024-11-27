package lab_3.entities.moves;

import lab_3.entities.Item;
import lab_3.entities.stats.Place;

public interface HumanMoves {
    void getCondition();

    String think();
    String think(String thought);

    String pickUp();
    String pickUp(Item item);

    String solve();

    String go(Place place, boolean future);
}
