package lab_3.entities.stats;

public enum Other {
    DOT("."), COMMA(","), DASH("-"), EXCLAMATION_MARK("!"), QUESTION_MARK("?");

    private final String symbol;

    Other(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
