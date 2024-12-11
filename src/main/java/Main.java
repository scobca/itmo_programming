import entities.*;
import exceptions.NotValidPropertiesException;
import stats.*;

import static utils.RandomGenerator.generateNumber;
import static utils.RandomGenerator.generateSize;

public class Main {
    public static void main(String[] args) throws NotValidPropertiesException {
        final String sizeError = "The size of the item cannot be zero";
        final String countError = "The count of the item cannot be zero";
        final String timeError = "The time of the event duration cannot be zero";


        Human Alex = new Human("Alex", Sex.MALE, generateNumber() + 100);
        Human Jack = new Human("Плотник Джек", Sex.MALE, generateNumber() + 100);
        Human Pitt = new Human("Кононир Пит", Sex.MALE, generateNumber() + 100);

        Item boilerplateItem = new Item("", generateSize());

        Event lowTide = new Event("Отлив", Place.BEACH, generateNumber("time", timeError) + 100);

        Item shirt = new Item("Клетчатая рубашка", generateSize());
        Item pants = new Item("Полотняные кальсоны", generateSize());
        Item shoes = new Item("Туфли", generateSize());

        Item storm = new Item("Буря", generateSize());
        Item string = new Item("Веревка", generateNumber("length", sizeError), generateNumber("count", sizeError));
        Item sail = new Item("Парус", generateNumber("length", sizeError), generateNumber("count", countError));
        Item rope = new Item("Канат", generateNumber("length", sizeError), generateNumber("count", countError));
        Item homeRaft = new Item("Домашний плот", generateSize());
        Item stocks = new Item("Запасы", generateSize());

        Item bagOfNails = new Item("Мешок с гвоздями", generateSize());
        Item screwdriver = new Item("Отвертка", generateSize());
        Item axe = new Item("Топор", generateSize());
        Item whetstone = new Item("Точило", generateSize());
        Item scrap = new Item("Железный лом", generateNumber("count", countError));
        Item barrelOfBullets = new Item("Боченок с пулями", generateSize());
        Item musket = new Item("Мушкет", generateSize());
        Item huntingRiffle = new Item("Охотничье ружье", generateSize());
        Item gunpowder = new Item("Порох", generateNumber("count", countError));
        Item bagOfFraction = new Item("Мешок с дробью", generateSize());
        Item plumbum = new Item("Сверток листового свинца", generateNumber(), Size.BIG);
        Item dress = new Item("Платье", generateSize());
        Item extraSail = new Item("Запасной парус", generateSize());
        Item hammock = new Item("Гамак", generateSize());
        Item mattress = new Item("Тюфяк", generateSize());
        Item pillow = new Item("Подушка", generateSize());


        Ship ship = new Ship("Черная жемчужина", generateNumber("length", "The length of the ship cannot be zero."));
        Raft raft = new Raft("Raft");

        ship.setShipInventory(bagOfNails,screwdriver, axe, whetstone, scrap, barrelOfBullets, musket, huntingRiffle, gunpowder, bagOfFraction, plumbum, dress, extraSail, hammock, mattress, pillow);

        Alex.addItemsToInventory(shirt, pants, shoes);

        System.out.println("" + Unions.BIG_BUT + Unions.NOW + Alex.getName() + " " + Alex.think() + "о том, как бы " + Alex.pickUp() + "с " + ship.getName() + " " + Unions.ALL + Other.COMMA + "что там оставалось и могло пригодиться, прежде всего" + Other.COLON + sail.getName() + " " + Unions.AND + rope.getName() + Other.DOT);
        System.out.println(Unions.BIG_SO + Alex.getName() + " " + Alex.solve() + Other.COMMA + Unions.IF + "ничего не помешает " + Other.COMMA + Alex.getName() + " " + Numerals.SECOND_TIME + Alex.go(ship.getName(), Place.SHIP, true) + Other.DOT);
        System.out.println("А так как " + Alex.getName() + " " + Alex.know("при первой " + storm.getName() + " " + ship.getName() + " разобьёт в щепки") + Other.COMMA + Pronouns.HE + Alex.solve("отложить " + Unions.ALL + "другие дела") + Other.COMMA + Unions.WHILE + Unions.NOT + Alex.carry(Unions.ON, Place.BEACH) + Unions.ALL + Other.COMMA + Unions.WHAT + "может " + Alex.pickUp() + Other.DOT);
        System.out.println(Alex.getName() + " " + Alex.hold() + "совет (с самим собой)" + Other.COMMA + Alex.bring("ли с собой ", homeRaft) + Other.DOT);
        System.out.println(Unions.BIG_THIS + "показалось " + Alex.getName() + "непрактичным " + Other.COMMA + Unions.AND + Other.COMMA + Alex.getName() + " " + Alex.wait("дождавшись ", lowTide) + Other.COMMA + Alex.getName() + Alex.go("пляжу", Place.BEACH, false) + Other.COMMA + Unions.HOW + Unions.IN + Numerals.FIRST_TIME + Other.DOT);
        System.out.println("" + Unions.BIG_ONLY + Unions.ON + "этот раз " + Alex.getName() + " " + Alex.undress() + Unions.IN + Place.HOUSE + Other.COMMA + "оставшись" + Unions.IN + Numerals.ONE + shirt.getName() + Other.COMMA + Unions.IN + pants.getName() + Unions.AND + Unions.IN + shoes.getName() + Unions.ON + "босу ногу" + Other.DOT);


        System.out.println("" + Unions.BIG_HOW + Unions.AND + Unions.IN + Numerals.FIRST_TIME + Alex.getName() + " " + Alex.climb(Place.SHIP) + Unions.BY + string.getName() + Other.SEMICOLON + Unions.AFTER + Alex.build(raft));
        System.out.println("" + Unions.BIG_BUT + Other.COMMA + "умудренный опытом " + Other.COMMA + Alex.getName() + " " + Alex.make("сделал", raft, RaftStats.AGILE, RaftStats.POWERFUL) + "более " + RaftStats.AGILE + Unions.AND + RaftStats.POWERFUL + Other.COMMA + Unions.NOT + Unions.HOW + Numerals.FIRST + Other.COMMA + Unions.AND + Unions.NOT + "так тяжело " + Alex.upload(ship, raft, bagOfNails, screwdriver, axe, whetstone, scrap, barrelOfBullets, musket, huntingRiffle, gunpowder, bagOfFraction, dress, extraSail, hammock, mattress, pillow) + Other.DOT);
        System.out.println(Alex.getName() + " " + "всё таки " + Alex.carry(Unions.IN, Place.HOUSE, raft) + Unions.ON + raft.getName() + " " + "много полезных вещей" + Other.COLON + Numerals.FIRSTLY + Other.COMMA + Unions.ALL + Other.COMMA + Unions.WHAT + boilerplateItem.wasFound() + Unions.IN + stocks.getName() + " " + Jack.getName() + Other.COMMA + "а именно" + Other.COLON + Numerals.TWO + Unions.OR + Numerals.THREE + bagOfNails.getName() + " " + "(большими и мелкими)" + Other.COMMA + screwdriver.getName() + Other.COMMA + "десятка " + Numerals.TWO + axe.getName() + Other.COMMA + "а главное " + Other.COMMA + "такую полезную вещь" + Other.COMMA + Unions.HOW + whetstone.getName() + Other.DOT);
        System.out.println(Unions.BIG_AFTER + Alex.getName() + " " + Alex.bring("несколько вещей из ", Place.WAREHOUSE) + Pronouns.OUR + Pitt.getName() + Other.COMMA + Unions.IN + "том числе " + Numerals.THREE + scrap.getName() + Other.COMMA + Numerals.TWO + bagOfFraction.getName() + Other.COMMA + Numerals.SEVEN + musket.getName() + " еще " + Numerals.ONE + huntingRiffle.getName() + Unions.AND + Unions.SOME + gunpowder.getName() + Other.COMMA + Unions.AFTER + Size.BIG + bagOfFraction.getName() + " " + Unions.AND + plumbum.getName() + Other.DOT);
        System.out.println("Впрочем " + Other.COMMA + Unions.LAST + "оказался так тяжел " + Unions.WHAT + "у " + Alex.getName() + " " + Alex.notEnoughStrength() + Alex.pickUp() + Unions.AND + Alex.pullDown() + Pronouns.HIM + Unions.ON + raft.getName() + Other.DOT);
        System.out.println("Кроме перечисленных вещей" + Other.COMMA + Alex.getName() + " " + Alex.bring("с ", Place.SHIP) + Unions.ALL + dress.getName() + Other.COMMA + "какое " + Alex.found() + Other.COMMA + Unions.AND + Alex.bring("еще ", extraSail) + Other.COMMA + hammock.getName() + " " + Unions.AND + Unions.SOME + mattress.getName() + " " + Unions.AND + pillow.getName() + Other.DOT);
        System.out.println("" + Unions.ALL + Unions.THIS + Alex.getName() + " " + Alex.upload(raft, Place.BEACH) + " " + Unions.AND + Other.COMMA + "к великому моему удовольствию" + Other.COMMA + Alex.bring("на ", Place.BEACH) + Unions.IN + "целости" + Other.DOT);

        System.out.println(ship.getInventory());
    }
}