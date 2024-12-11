package stats;

public enum Numerals {
    ONE("один "), BIG_ONE("Один "),
    TWO("два "), BIG_TWO("Два "),
    THREE("три "), BIG_THREE("Три "),
    SEVEN("семь "), BIG_SEVEN("Семь "),
    FIRST("первый "), BIG_FIRST("Первый "), FIRST_TIME("первый раз "), FIRSTLY("во-первых "),
    SECOND("второй "), BIG_SECOND("Второй "), SECOND_TIME("второй раз "),
    THIRD("третий "), BIG_THIRD("Третий ");

    private final String symbol;

    Numerals(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return this.symbol;
    }
}
