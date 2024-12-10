package entities;

import lombok.Getter;
import stats.Place;
import stats.Size;

@Getter
public class Event extends Entity {
    private final Place place;
    private final Size duration;

    public Event(String name, Place place, int time) {
        super(name);
        this.place = place;
        this.duration = setSize(time);
    }

    @Override
    public Size setSize(int time) {
        if (time <= 30) {
            return Size.SMALL;
        } else if (time <= 60) {
            return Size.MEDIUM;
        } else {
            return Size.BIG;
        }
    }
}
