package lab_3;

import lab_3.entities.Human;
import lab_3.entities.Ship;
import lab_3.entities.stats.Other;
import lab_3.entities.stats.Sex;
import lab_3.entities.stats.Unions;
import lab_3.exceptions.NotValidPropertiesException;

public class Main {
    public static void main(String[] args) throws NotValidPropertiesException {
        Human Alex = new Human("Alex", Sex.MALE);
        Ship ship = new Ship("Черная жемчужина");

        System.out.println("" + Unions.BIG_BUT + Unions.NOW + Alex.name + " " + Alex.think() + "о том, как бы " + Alex.pickUp() + "с " + ship.name + " " + Unions.ALL + "что там оставалось и могло пригодиться " + Alex.name + Other.DOT);
    }
}
