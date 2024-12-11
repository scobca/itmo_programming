package stats;

public enum Size {
    SMALL("маленький "), MEDIUM("средний "), BIG("больошй ");

    private final String size;

    Size(String size) {
        this.size = size;
    }

    public String toString() {
        return size;
    }
}
