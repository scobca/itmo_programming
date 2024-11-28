package stats;

public enum Pronouns {
    HE("он ");

    private final String pronoun;

    Pronouns(String pronoun) {
        this.pronoun = pronoun;
    }

    @Override
    public String toString() {
        return pronoun;
    }
}
