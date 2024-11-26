package lab_3.entities;

import lab_3.Entity;
import lab_3.entities.moves.UniversalMoves;
import lab_3.entities.stats.Place;
import lab_3.entities.stats.Sex;
import lab_3.entities.stats.Size;
import lab_3.entities.stats.Status;

import java.util.ArrayList;

public class Human extends Entity implements UniversalMoves {
    Size size;
    Sex sex;
    Status status;
    Place place;
    ArrayList<Item> inventory;

    public Human(String name, Sex sex) {
        super(name);

        this.size = setSize(generateNumber());
        this.sex = sex;
        this.status = Status.BASIC;
        this.place = Place.BEACH;
        this.inventory = new ArrayList<>();
    }

    @Override
    public Size setSize(int tall) {
        if (tall < 160) {
            return Size.SMALL;
        } else if (tall < 180) {
            return Size.MEDIUM;
        } else {
            return Size.BIG;
        }
    }

    @Override
    public int generateNumber() {
        return (int) (Math.random() * 100) + 100;
    }

    // Universal moves
    @Override
    public String getInventory(ArrayList<Item> items) {
        return this.inventory.toString();
    }
}
