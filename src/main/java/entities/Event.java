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
    public int hashCode() {
        int result = getName().hashCode() + getPlace().hashCode();
        result = 13 * result + getDuration().hashCode();

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Event event = (Event) o;
        return this.getName() == event.getName();
    }

    @Override
    public String toString() {
        return "Event{" +
                "place=" + place +
                ", duration=" + duration +
                '}';
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
