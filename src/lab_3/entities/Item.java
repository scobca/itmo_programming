package lab_3.entities;

import lab_3.Entity;
import lab_3.entities.stats.Size;
import lab_3.exceptions.NotValidPropertiesException;

public class Item extends Entity {
    int count;
    Size size;

    public Item(String name) throws NotValidPropertiesException {
        super(name);

        int length = super.generateNumber();
        checkResult(length, "length", "The size of the item cannot be zero");

        this.size = setSize(length);

        this.count = super.generateNumber();
        checkResult(count, "count", "The count of the items cannot be zero");
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

    private static void checkResult(int field, String propertyName, String message) throws NotValidPropertiesException {
        if (field == 0) {
            throw new NotValidPropertiesException(propertyName, message);
        }
    }
}
