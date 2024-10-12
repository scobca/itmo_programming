package lab_2.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Pound extends PhysicalMove {
    public Pound() {
        super(Type.NORMAL, 40, 100);
    }

    @Override
    protected String describe() {
        return "Using Pound move!";
    }
}
