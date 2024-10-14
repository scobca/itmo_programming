package lab_2.pokemons;

import lab_2.moves.DragonRush;
import lab_2.moves.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Deino extends Pokemon {
    public Deino(String name, int level) {
        super(name, level);
        this.setType(Type.DARK, Type.DRAGON);
        this.setMove(new DragonRush(), new Rest());
        this.setStats(52, 65, 50, 45, 50, 38);
    }
}
