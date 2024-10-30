package lab_3.etities;

import lab_3.etities.moves.Moves;
import lab_3.etities.moves.EntityMoves;
import lab_3.etities.moves.PhysicalMoves;
import lab_3.etities.stats.Sex;
import lab_3.etities.stats.Size;

public class Human implements Moves, EntityMoves, PhysicalMoves {
    String name;
    Size size;
    Sex sex;

    public Human(String name, Size size, Sex sex) {
        this.name = name;
        this.size = size;
        this.sex = sex;
    }
}
