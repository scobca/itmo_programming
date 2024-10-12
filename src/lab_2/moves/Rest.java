package lab_2.moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0,0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect Rest = new Effect().condition(Status.SLEEP).turns(2);
        pokemon.setMod(Stat.HP, (int)(pokemon.getStat(Stat.HP) - pokemon.getHP()));
        pokemon.setCondition(Rest);
    }

    @Override
    protected String describe() {
        return "Using a rest!";
    }
}
