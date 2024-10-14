package lab_2.moves;

import ru.ifmo.se.pokemon.*;

public class DragonRush extends PhysicalMove {
    public DragonRush() {
        super(Type.DRAGON, 100, 75);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect dragonRush = new Effect().chance(0.2);

        if (dragonRush.success()) {
            Effect.flinch(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "Using Dragon rush move!";
    }
}
