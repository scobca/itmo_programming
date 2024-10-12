package lab_2.pokemons;

import lab_2.moves.Facade;
import lab_2.moves.Psychic;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Sigilyph extends Pokemon {
    public Sigilyph(String name, int level) {
        super(name, level);
        this.setType(Type.FLYING, Type.PSYCHIC);
        this.addMove(new Psychic());
        this.addMove(new Facade());
        this.setStats(72, 58, 80, 103, 80, 97);
    }
}
