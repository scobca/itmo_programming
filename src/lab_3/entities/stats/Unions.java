package lab_3.entities.stats;

public enum Unions {
    BUT("но "), BIG_BUT("Но "),
    NOW("теперь "), BIG_NOW("Теперь "),
    ALL("всё "), BIG_ALL("Всё ");


    private final String name;

    Unions(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
