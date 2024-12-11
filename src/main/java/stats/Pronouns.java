package stats;

public enum Pronouns {
    HE("он "), OUR("наш "), HIM("его ");

    private final String pronoun;

    Pronouns(String pronoun) {
        this.pronoun = pronoun;
    }

    @Override
    public String toString() {
        return pronoun;
    }
}
