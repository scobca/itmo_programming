package lab_2;
import lab_2.pokemons.Sigilyph;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
//        Battle b = new Battle();
        Pokemon p1 = new Sigilyph("NEW_POKE", 1);
        Pokemon p2 = new Pokemon("Хищник", 1);
//        b.addAlly(p1);
//        b.addFoe(p2);
//        b.go();

        typesGet(p1);
    }

    public static void typesGet(Pokemon pokemon) {
        for (int i = 0; i < pokemon.getTypes().length; i++) {
            System.out.println(pokemon.getTypes()[i]);
        }
    }
}
