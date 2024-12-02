package stats;

public enum Numerals {
    FIRST("первый "), BIG_FIRST("Первый "),
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
