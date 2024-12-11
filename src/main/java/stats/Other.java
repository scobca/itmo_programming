package stats;

public enum Other {
    DOT(". "), COMMA(", "), DASH("- "), EXCLAMATION_MARK("! "), QUESTION_MARK("? "), COLON(": "), SEMICOLON("; ");

    private final String symbol;

    Other(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
