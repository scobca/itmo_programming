package lab_2.moves;

import ru.ifmo.se.pokemon.*;

public class SweetScent extends SpecialMove {
    public SweetScent() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect sweetScent = new Effect().stat(Stat.EVASION, -1);
        pokemon.addEffect(sweetScent);
    }

    @Override
    protected String describe() {
        return "Using Sweet scent move!";
    }
}
