package lab_3;

import lab_3.entities.stats.Size;

public abstract class Entity {
    public final String name;

    public Entity(String name) {
        this.name = name;
    }

    public abstract Size setSize(int countableParam);

    public String  getName() {
        return (this.name + " ");
    }
}
