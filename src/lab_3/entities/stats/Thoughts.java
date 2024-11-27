package lab_3.entities.stats;

public enum Thoughts {
    PICK_UP("Хочет что-то забрать"),
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
