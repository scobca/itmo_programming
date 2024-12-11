package stats;

public enum Place {
    NONE(""),
    HOUSE("шалаш "),
    WAREHOUSE("склад "),
    BEACH("пляж "),
    SHIP("корабль ");

    private final String name;

    Place(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
