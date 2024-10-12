package lab_2.pokemons;

import lab_2.moves.Pound;

public class Salazzle extends Salandit {

    public Salazzle(String name, int level) {
        super(name, level);
        this.addMove(new Pound());
        this.setStats(68, 64,60, 111,60, 117);
    }
}
