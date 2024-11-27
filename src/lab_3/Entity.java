package lab_3;

import lab_3.entities.stats.Size;

public abstract class Entity {
    public String name;

    public Entity(String name) {
        this.name = name;
    }

    public abstract Size setSize(int countableParam);

    public int generateNumber() {
        return (int) (Math.random() * 100);
    }
}
