package entities;

import stats.Size;

public class Item extends Entity implements intefaces.Item {
    private final int count;
    private final int length;
    private final Size size;

    public Item(String name, int length, int count) {
        super(name);
        this.length = length;
        this.count = count;
        this.size = setSize(length);
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
}
