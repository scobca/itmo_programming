package entities;

import intefaces.Universal;
import lombok.Getter;
import stats.Place;
import stats.Size;

import java.util.ArrayList;

@Getter
public class Ship extends Entity implements Universal, intefaces.Ship {
    private final Size size;
    private final int length;
    private Place place;
    private ArrayList<Item> inventory;

    public Ship(String name, int length) {
        super(name);

        this.size = setSize(length);
        this.length = length;
        this.inventory = new ArrayList<>();
        this.place = Place.BEACH;
    }

    // Setters
    @Override
    public Size setSize(int length) {
        if (length < 20) {
            return Size.SMALL;
        } else if (length < 50) {
            return Size.MEDIUM;
        } else {
            return Size.BIG;
        }
    }

    @Override
    public String toString() {
        return "Ship{" +
                "length=" + length +
                ", size=" + size +
                ", place=" + place +
                ", inventory=" + inventory +
                ", name='" + super.getName() + '\'' +
                '}';
    }

    // Universal moves
    @Override
    public String getInventory(ArrayList<Item> inventory) {
        return inventory.toString();
    }
}