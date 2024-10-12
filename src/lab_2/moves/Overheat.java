package lab_2.moves;

import ru.ifmo.se.pokemon.*;

public class Overheat extends SpecialMove {
    public Overheat() {
        super(Type.FIRE, 130, 90);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect overheat = new Effect().stat(Stat.SPECIAL_ATTACK, -2);
        pokemon.addEffect(overheat);
    }

    @Override
    protected String describe() {
        return "Using Overhead move!";
    }
}
