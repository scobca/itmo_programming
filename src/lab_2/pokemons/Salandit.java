package lab_2.pokemons;

import lab_2.moves.Overheat;
import lab_2.moves.Rest;
import lab_2.moves.SweetScent;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Salandit extends Pokemon {
    public Salandit(String name, int level) {
        super(name, level);
        this.setType(Type.POISON, Type.FIRE);
        this.setMove(new Rest(), new SweetScent(), new Overheat());
        this.setStats(48, 44, 40, 71, 40, 77);
    }
}
