package lab_2.pokemons;

import lab_2.moves.RockTomb;

public class Hydreigon extends Zweilous {
    public Hydreigon(String name, int level) {
        super(name, level);
        this.addMove(new RockTomb());
        this.setStats(92, 105, 90, 125, 90, 98);
    }
}
