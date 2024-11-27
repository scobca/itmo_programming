package lab_3.entities;

import lab_3.Entity;
import lab_3.entities.stats.Size;
import lab_3.exceptions.NotValidPropertiesException;

public class Item extends Entity implements lab_3.entities.moves.Item {
    private final int count;
    private final int length;
    private final Size size;

    public Item(String name, int length, int count) throws NotValidPropertiesException {
        super(name);

        this.length = length;
        this.count = count;
        checkResult(length, "length", "The size of the item cannot be zero");

        this.size = setSize(length);

        checkResult(count, "count", "The count of the items cannot be zero");
    }

    // Setters
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

    // Self methods, getters
    public int getCount() {
        return count;
    }

    public int getLength() {
        return length;
    }

    public Size getSize() {
        return size;
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
