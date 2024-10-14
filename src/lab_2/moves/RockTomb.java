package lab_2.moves;

import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove {
    public RockTomb() {
        super(Type.ROCK, 60, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect RockTomb = new Effect().stat(Stat.SPEED, -1);
    }
}
