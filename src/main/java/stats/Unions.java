package stats;

public enum Unions {
    BUT("но "), BIG_BUT("Но "),
    AND("и "), BIG_AND("И "),
    NOW("теперь "), BIG_NOW("Теперь "),
    ALL("всe "), BIG_ALL("Всe "),
    SO("поэтому "), BIG_SO("Поэтому "),
    WHILE("пока "), BIG_WHILE("Пока "),
    NOT("не "), BIG_NOT("Не "),
    IF("если "), BIG_IF("Если "),
    WHAT("что "), BIG_WHAT("Что "),
    ON("на "), BIG_ON("На "),
    IN("в "), BIG_IN("В "),
    THIS("это "), BIG_THIS("Это "),
    HOW("как "), BIG_HOW("Как "),
    BY("по "), BIG_BY("По "),
    AFTER("потом "), BIG_AFTER("Потом "),
    WAS("был "), BIG_WAS("Был "),
    OR("или "), BIG_OR("Или "),
    SOME("немного "), BIG_SOME("Немного "),
    LAST("последний "), BIG_LAST("Послений "),
    ONLY("только "), BIG_ONLY("Только ");


    private final String name;

    Unions(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
