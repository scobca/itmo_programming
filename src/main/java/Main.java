import entities.Human;
import entities.Item;
import entities.Ship;
import exceptions.NotValidPropertiesException;
import stats.*;

import static utils.RandomGenerator.generateNumber;

public class Main {
    public static void main(String[] args) throws NotValidPropertiesException {
        Human Alex = new Human("Alex", Sex.MALE, generateNumber() + 100);

        Item sail = new Item("Парус",
                generateNumber("length", "The size of the item cannot be zero"),
                generateNumber("count", "The count of the items cannot be zero"));

        Item rope = new Item("Канат",
                generateNumber("length", "The size of the item cannot be zero"),
                generateNumber("count", "The count of the items cannot be zero"));

        Ship ship = new Ship("Черная жемчужина", generateNumber("length", "The length of the ship cannot be zero."));

        System.out.println("" + Unions.BIG_BUT + Unions.NOW + Alex.getName() + " " + Alex.think() + "о том, как бы " + Alex.pickUp() + "с " + ship.getName() + " " + Unions.ALL + "что там оставалось и могло пригодиться " + Alex.getName() + Other.DOT);
        System.out.println("Прежде всего: " + sail.getName() + Unions.AND + rope.getName() + Other.DOT);
        System.out.println(Unions.BIG_SO + Alex.getName() + Alex.solve() + Unions.IF + "ничего не помешает " + Alex.getName() + Alex.go(ship.getName(), Place.SHIP, true) + Other.DOT);
        System.out.println("А так как " + Alex.getName() + Alex.know("при первой буре " + ship.getName() + "разобьёт в щепки") + Other.COMMA + Pronouns.HE + Alex.solve("отложить другие дела"));
    }
}
