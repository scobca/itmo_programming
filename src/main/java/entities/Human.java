package entities;

import intefaces.Universal;
import lombok.Getter;
import stats.Sex;
import stats.Status;
import stats.Thoughts;
import stats.Place;
import stats.Size;

import java.util.ArrayList;

@Getter
public class Human extends Entity implements Universal, intefaces.Human {
    private final Sex sex;
    private final Size size;
    private Status status;
    private Thoughts thought;
    private Place place;
    @Getter
    private Place futurePlace;
    private ArrayList<Item> inventory;

    public Human(String name, Sex sex, int tall) {
        super(name);

        this.size = setSize(tall);
        this.sex = sex;
        this.status = Status.BASIC;
        this.thought = Thoughts.PICK_UP;
        this.place = Place.BEACH;
        this.futurePlace = Place.NONE;
        this.inventory = new ArrayList<>();
    }

    // Self methods
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

    // Universal moves, getters
    @Override
    public String getInventory(ArrayList<Item> items) {
        return this.inventory.toString();
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + super.getName() + '\'' +
                ", inventory=" + inventory +
                ", futurePlace=" + futurePlace +
                ", place=" + place +
                ", thought=" + thought +
                ", status=" + status +
                ", sex=" + sex +
                '}';
    }

    // Human moves
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
        return ("Предмет " + item.getName() + " подобран. " + "Инвентарь " + this.getName() +  ": " + this.getInventory(inventory));
    }

    @Override
    public String solve() {
        this.status = Status.TUNED;
        this.thought = Thoughts.TUNED;
        return ("решил ");
    }

    @Override
    public String solve(String solution) {
        this.status = Status.TUNED;
        this.thought = Thoughts.TUNED;
        return ("решил " + solution);
    }

    @Override
    public String go(String message, Place place, boolean future) {
        if (future) {
            this.futurePlace = place;
            this.status = Status.TUNED;
            this.thought = Thoughts.TUNED;
            return ("пойдет к " + message);
        } else {
            this.place = place;
            this.status = Status.GOING;
            return ("пошел к " + message);
        }
    }

    @Override
    public String know() {
        return "знал ";
    }

    @Override
    public String know(String thought) {
        return "знал, что: " + thought;
    }
}
