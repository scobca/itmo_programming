package exceptions;

public class NotValidPropertiesException extends Exception {
    private final String property;

    public NotValidPropertiesException(String property, String message) {
        super(message);
        this.property = property;
    }

    @Override
    public String getMessage() {
        return "Error in property " + this.property + ": " + super.getMessage();
    }
}
