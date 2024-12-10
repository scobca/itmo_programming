package exceptions;

public class ObjectNotExistException extends RuntimeException {
    public ObjectNotExistException(String message) {
        super(message);
    }

    public ObjectNotExistException(String message, Throwable cause) {
        super(message, cause);
    }
}
