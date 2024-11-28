package intefaces;

import lab_3.entities.Item;
import lab_3.entities.stats.Place;

public interface Human {
    String think();
    String think(String thought);

    String pickUp();
    String pickUp(Item item);

    String solve();
    String solve(String solution);

    String go(String message, Place place, boolean future);

    String know();
    String know(String thought);
}
