package lab_3.entities;

import lab_3.Entity;
import lab_3.entities.moves.UniversalMoves;
import lab_3.entities.stats.Place;
import lab_3.entities.stats.Size;
import lab_3.exceptions.NotValidPropertiesException;

import java.util.ArrayList;

public class Ship extends Entity implements UniversalMoves {
    int length;
    Place place;
    Size size;
    ArrayList<Item> inventory;

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

    // Universal moves
    @Override
    public String getInventory(ArrayList<Item> inventory) {
        return inventory.toString();
    }
}