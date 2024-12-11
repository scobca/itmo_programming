package entities;

import exceptions.ObjectNotExistException;
import intefaces.Universal;
import lombok.Getter;
import lombok.Setter;
import stats.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Human extends Entity implements Universal, intefaces.Human {
    private final Sex sex;
    private final Size size;
    private Status status;
    private Thoughts thought;
    private Place place;
    private Place futurePlace;
    private final ArrayList<Item> inventory;

    public Human(String name, Sex sex, int tall) {
        super(name);

        this.size = setSize(tall);
        this.sex = sex;
        this.status = Status.BASIC;
        this.thought = Thoughts.PICK_UP;
        this.place = Place.HOUSE;
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

    @Override
    public int hashCode() {
        int result = this.getPlace().hashCode() + this.getSex().hashCode();

        result = 52 * result + this.getSize().hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;
        return this.getName() == human.getName();
    }

    //Setters
    public void addItemsToInventory(Item... items) {
        this.inventory.addAll(List.of(items));
    }

    // Universal moves, getters
    @Override
    public ArrayList<Item> getInventory() {
        return this.inventory;
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
        return ("Предмет " + item.getName() + " подобран. " + "Инвентарь " + this.getName() +  ": " + this.getInventory());
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

            if (this.place == this.futurePlace) {
                this.futurePlace = Place.NONE;
            }

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

    @Override
    public String carry(Unions union, Place place) {
        return "отвезти " + union + place;
    }

    @Override
    public String carry(Unions union, Place place, Raft raft) {
        this.inventory.addAll(raft.getInventory().items());
        return "отвез " + union + place;
    }

    @Override
    public String became() {
        return "стал ";
    }

    @Override
    public String hold() {
        return "держать ";
    }

    @Override
    public String hold(Item item) {
        try {
            if (this.inventory.contains(item)) {
                return "держать " + item.getName() + " ";
            } else {
                throw new ObjectNotExistException("Object in inventory not exist: " + item.getName());
            }
        } catch (ObjectNotExistException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return "держвать " + item.getName() + " ";
    }

    @Override
    public String bring(String context, Entity entity) {
        this.thought = Thoughts.BRING;
        return "взять " + context + entity.getName() + " ";
    }

    @Override
    public String bring(String context, Place place) {
        this.place = place;

        if (this.futurePlace == place) {
            this.futurePlace = Place.NONE;
        }

        return "взял " + context + place;
    }

    @Override
    public String wait(String message, Event event) {
        this.status = Status.WAITING;
        return (message + event.getName());
    }

    @Override
    public String undress() {
        return "разделся ";
    }

    @Override
    public String undress(Item... items) {
        try {
            for (Item item : items) {
               if (!this.inventory.contains(item)) {
                   throw new ObjectNotExistException("Object in inventory not exist: " + item.getName());
               }
            }
        } catch (ObjectNotExistException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return "разделся ";
    }

    @Override
    public String climb(Place place) {
        this.place = place;

        if (this.futurePlace == place) {
            this.futurePlace = Place.NONE;
        }

        return "взобрался на " + place;
    }

    @Override
    public String build (Raft raft) {
        return "построил " + raft.getName();
    }

    @Override
    public String make(String message, Raft raft, RaftStats... raftStats) {
        raft.setRaftStats(raftStats);
        return message + " " + raft.getName();
    }

    @Override
    public String upload(Ship ship, Raft raft, Item... items) {
        ArrayList<Item> shipInventory = ship.getInventory();
        List<Item> newRaftInventory = new ArrayList<>();

        try {
            for (Item item : items) {
                if (shipInventory.contains(item)) {
                    newRaftInventory.add(item);
                } else {
                    throw new ObjectNotExistException("Object in inventory not exist: " + item.getName());
                }
            }
        } catch (ObjectNotExistException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (Item item : newRaftInventory) {
            raft.setRaftInventory(item);
            ship.removeItemFromInventory(item);
        }

        return "нагрузил " + raft.getName();
    }

    @Override
    public String upload(Raft raft, Place place) {
        this.status = Status.WORKING;
        this.futurePlace = place;
        return "погрузил на " + raft.getName();
    }

    @Override
    public String notEnoughStrength() {
        this.status = Status.WEAKEN;
        this.thought = Thoughts.UPSET;
        return "не хватило сил ";
    }

    @Override
    public String pullDown() {
        return "спустить ";
    }

    @Override
    public String found() {
        return "нашел ";
    }
}
