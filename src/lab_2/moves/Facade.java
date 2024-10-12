package lab_2.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        switch (pokemon.getCondition()) {
            case BURN, POISON, PARALYZE -> {
                this.power = 140;
            }
            default -> this.power = 70;
        }
    }

    @Override
    protected String describe() {
        return "Using Facade move";
    }
}
