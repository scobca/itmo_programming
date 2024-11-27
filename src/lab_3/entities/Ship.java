package lab_3.entities;

import lab_3.Entity;
import lab_3.entities.moves.Universal;
import lab_3.entities.stats.Place;
import lab_3.entities.stats.Size;
import lab_3.exceptions.NotValidPropertiesException;

import java.util.ArrayList;

public class Ship extends Entity implements Universal, lab_3.entities.moves.Ship {
    private final int length;
    private final Size size;
    private Place place;
    private ArrayList<Item> inventory;

    public Ship(String name) throws NotValidPropertiesException {
        super(name);

        this.length = super.generateNumber();

        if (length == 0) {
            throw new NotValidPropertiesException("length", "The length of the ship cannot be zero.");
        }

        this.size = setSize(super.generateNumber());
        this.inventory = new ArrayList<>();
        this.place = Place.BEACH;
    }

    // Setters
    @Override
    public Size setSize(int countOfItems) {
        if (length < 20) {
            return Size.SMALL;
        } else if (length < 50) {
            return Size.MEDIUM;
        } else {
            return Size.BIG;
        }
    }

    // Self methods, getters
    public int getLength() {
        return length;
    }

    public Size getSize() {
        return size;
    }

    public Place getPlace() {
        return place;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "length=" + length +
                ", size=" + size +
                ", place=" + place +
                ", inventory=" + inventory +
                ", name='" + name + '\'' +
                '}';
    }

    // Universal moves
    @Override
    public String getInventory(ArrayList<Item> inventory) {
        return inventory.toString();
    }
}