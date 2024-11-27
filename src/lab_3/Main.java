package lab_3;

import lab_3.entities.Human;
import lab_3.entities.Item;
import lab_3.entities.Ship;
import lab_3.entities.stats.Other;
import lab_3.entities.stats.Place;
import lab_3.entities.stats.Sex;
import lab_3.entities.stats.Unions;
import lab_3.exceptions.NotValidPropertiesException;

public class Main {
    public static void main(String[] args) throws NotValidPropertiesException {
        Human Alex = new Human("Alex", Sex.MALE);

        Item sail = new Item("Sail");   // паруса
        Item rope = new Item("Rope");   // канаты

        Ship ship = new Ship("Черная жемчужина");

        System.out.println("" + Unions.BIG_BUT + Unions.NOW + Alex.getName() + " " + Alex.think() + "о том, как бы " + Alex.pickUp() + "с " + ship.name + " " + Unions.ALL + "что там оставалось и могло пригодиться " + Alex.getName() + Other.DOT);
        System.out.println("Прежде всего: " + sail.getName() + Unions.AND + rope.getName() + Other.DOT);
        System.out.println(Unions.BIG_SO + Alex.getName() + Alex.solve() + Unions.IF + "ничего не помешает" + Alex.getName() + Alex.go(Place.SHIP, true));
    }
}
