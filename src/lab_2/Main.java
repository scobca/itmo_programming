package lab_2;
import lab_2.pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon p1 = new Sigilyph("Летучка", 43);
        Pokemon p2 = new Salandit("Ящерка", 37);
        Pokemon p3 = new Salazzle("Токсинфея", 58);
        Pokemon p4 = new Deino("Бульдозер", 32);
        Pokemon p5 = new Zweilous("Двухглавик", 65);
        Pokemon p6 = new Hydreigon("Горыныч", 37);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}
