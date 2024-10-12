package lab_2.moves;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {
    public IceBeam() {
        super(Type.ICE, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (!pokemon.hasType(Type.ICE)) {
            Effect iceBeam = new Effect().chance(0.1).condition(Status.FREEZE);
            pokemon.addEffect(iceBeam);
        }
    }

    @Override
    protected String describe() {
        return "Using Ice beam move!";
    }
}
