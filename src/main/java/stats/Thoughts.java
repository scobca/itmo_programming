package stats;

public enum Thoughts {
    PICK_UP("Хочет что-то забрать"),
    BRING("Хочет что-то взять с собой"),
    UPSET("Растроенный из-за чего-то"),
    TUNED("Настроился на какое-то действие");

    private final String thought;

    Thoughts(String thought) {
        this.thought = thought;
    }

    @Override
    public String toString() {
        return this.thought;
    }
}
