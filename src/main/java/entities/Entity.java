package entities;

import lombok.Getter;
import stats.Size;

@Getter
public abstract class Entity {
    private final String name;

    public Entity(String name) {
        this.name = name;
    }

    public abstract Size setSize(int countableParam);
}
