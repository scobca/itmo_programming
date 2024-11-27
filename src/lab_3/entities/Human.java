package lab_3.entities;

import lab_3.Entity;
import lab_3.entities.moves.HumanMoves;
import lab_3.entities.moves.UniversalMoves;
import lab_3.entities.stats.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Human extends Entity implements UniversalMoves, HumanMoves {
    Size size;
    Sex sex;
    Status status;
    Thoughts thought;
    Place place;
    Place futurePlace;
    ArrayList<Item> inventory;

    public Human(String name, Sex sex) {
        super(name);

        this.size = setSize(generateNumber());
        this.sex = sex;
        this.status = Status.BASIC;
        this.thought = Thoughts.PICK_UP;
        this.place = Place.BEACH;
        this.futurePlace = Place.NONE;
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

    // Human moves
    @Override
    public void getCondition() {
        Map<String, String> condition = new HashMap<>();

        condition.put("name", this.name);
        condition.put("size", this.size.toString());
        condition.put("sex", this.sex.toString());
        condition.put("status", this.status.toString());
        condition.put("thought", this.thought.toString());
        condition.put("place", this.place.toString());
        condition.put("futurePlace", this.futurePlace.toString());
        condition.put("inventory", this.inventory.toString());

        System.out.println(this.name + " " + "condition: " + condition);
    }

    @Override
    public String think() {
       this.status = Status.THINKING;
        return ("думал ");
    }

    @Override
    public String think(String thought) {
        this.status = Status.THINKING;
        return ("думал: " + "'" + thought + "'" + " ");
    }

    @Override
    public String pickUp() {
        return "забрать ";
    }

    @Override
    public String pickUp(Item item) {
        this.inventory.add(item);
        return ("Предмет " + item.name + " подобран. " + "Инвентарь " + this.name +  ": " + this.getInventory(inventory));
    }

    @Override
    public String solve() {
        this.status = Status.TUNED;
        this.thought = Thoughts.TUNED;
        return ("решил ");
    }

    @Override
    public String go(Place place, boolean future) {
        if (future) {
            this.futurePlace = place;
            this.status = Status.TUNED;
            this.thought = Thoughts.TUNED;
            return ("пойдет к " + place);
        } else {
            this.place = place;
            this.status = Status.GOING;
            return ("пошел к " + place);
        }
    }
}
