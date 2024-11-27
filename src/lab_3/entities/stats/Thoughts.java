package lab_3.entities.stats;

public enum Thoughts {
    PICK_UP("Хочет что-то забрать");

    private final String thought;

    Thoughts(String thought) {
        this.thought = thought;
    }

    @Override
    public String toString() {
        return this.thought;
    }
}
