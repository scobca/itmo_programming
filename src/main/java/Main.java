import entities.Human;
import entities.Item;
import entities.Ship;
import exceptions.NotValidPropertiesException;
import stats.*;

import static utils.RandomGenerator.generateNumber;
import static utils.RandomGenerator.generateSize;

public class Main {
    public static void main(String[] args) throws NotValidPropertiesException {
        final String sizeError = "The size of the item cannot be zero";
        final String countError = "The count of the item cannot be zero";


        Human Alex = new Human("Alex", Sex.MALE, generateNumber() + 100);

        Item storm = new Item("Буря", generateSize());
        Item sail = new Item("Парус", generateNumber("length", sizeError), generateNumber("count", countError));
        Item rope = new Item("Канат", generateNumber("length", sizeError), generateNumber("count", countError));

        Ship ship = new Ship("Черная жемчужина", generateNumber("length", "The length of the ship cannot be zero."));

//        System.out.println("" + Unions.BIG_BUT + Unions.NOW + Alex.getName() + " " + Alex.think() + "о том, как бы " + Alex.pickUp() + "с " + ship.getName() + " " + Unions.ALL + Other.COMMA + "что там оставалось и могло пригодиться, прежде всего" + Other.COLON + sail.getName() + " " + Unions.AND + rope.getName() + Other.DOT);
//        System.out.println(Unions.BIG_SO + Alex.getName() + " " + Alex.solve() + Other.COMMA + Unions.IF + "ничего не помешает " + Other.COMMA + Alex.getName() + " " + Numerals.SECOND_TIME + Alex.go(ship.getName(), Place.SHIP, true) + Other.DOT);
        System.out.println("А так как " + Alex.getName() + " " + Alex.know("при первой " + storm.getName() + " " + ship.getName() + " разобьёт в щепки") + Other.COMMA + Pronouns.HE + Alex.solve("отложить " + Unions.ALL + "другие дела"));
    }
}
