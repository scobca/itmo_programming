package lab_3.entities.stats;

public enum Unions {
    BUT("но "), BIG_BUT("Но "),
    AND("и "), BIG_AND("И "),
    NOW("теперь "), BIG_NOW("Теперь "),
    ALL("всё "), BIG_ALL("Всё "),
    SO("поэтому "), BIG_SO("Поэтому "),
    IF("если "), BIG_IF("Если ");


    private final String name;

    Unions(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
