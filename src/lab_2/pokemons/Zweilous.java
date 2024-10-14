package lab_2.pokemons;

import lab_2.moves.DoubleHit;

public class Zweilous extends Deino {
    public Zweilous(String name, int level) {
        super(name, level);
        this.addMove(new DoubleHit());
        this.setStats(72, 85, 70, 65, 70, 58);
    }
}
