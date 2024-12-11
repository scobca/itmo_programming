package entities;

import lombok.Getter;
import stats.Size;
import utils.RandomGenerator;

@Getter
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

    public Item(String name, Size size) {
        super(name);
        this.count = 1;
        this.length = 1;
        this.size = size;
    }

    public Item(String name, int count) {
        super(name);
        this.count = count;
        this.length = 0;
        this.size = setSize(count);
    }

    public Item(String name, int count, Size size) {
        super(name);
        this.count = count;
        this.length = RandomGenerator.generateNumber() + 1;
        this.size = size;
    }

    // Setters
    @Override
    public Size setSize(int countableParam) {
        if (countableParam < 10) {
            return Size.SMALL;
        } else if (countableParam < 30) {
            return Size.MEDIUM;
        } else {
            return Size.BIG;
        }
    }

    //self methods
    @Override
    public String toString() {
        return "Item {" +
                "name: '" + super.getName() + '\'' +
                ", count: " + count +
                ", size: " + size +
                '}';
    }

    // Item interface
    @Override
    public String wasFound(Item item) {
        return "был найден " + item.getName();
    }

    @Override
    public String wasFound() {
        return "найден ";
    }
}
