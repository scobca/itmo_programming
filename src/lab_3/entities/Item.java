package lab_3.entities;

import lab_3.Entity;
import lab_3.entities.stats.Size;

public class Item extends Entity {
    Size size;
    double count;

    public Item(String name, int length, double count) {
        super(name);
        this.size = setSize(length);
        this.count = count;
    }

    @Override
    public Size setSize(int length) {
        if (length < 10) {
            return Size.SMALL;
        } else if (length < 30) {
            return Size.MEDIUM;
        } else {
            return Size.BIG;
        }
    }

    @Override
    public String toString() {
        return "Item {" +
                "name: '" + name + '\'' +
                ", count: " + count +
                ", size: " + size +
                '}';
    }
}
