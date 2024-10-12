package lab_2.pokemons;

import lab_2.moves.Facade;
import lab_2.moves.FlashCannon;
import lab_2.moves.IceBeam;
import lab_2.moves.Psychic;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Sigilyph extends Pokemon {
    public Sigilyph(String name, int level) {
        super(name, level);
        this.setType(Type.FLYING, Type.PSYCHIC);
        this.setMove(new Psychic(), new Facade(), new IceBeam(), new FlashCannon());
        this.setStats(72, 58, 80, 103, 80, 97);
    }
}
