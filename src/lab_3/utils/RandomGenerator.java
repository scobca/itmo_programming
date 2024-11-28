package lab_3.utils;

import lab_3.exceptions.NotValidPropertiesException;

public class RandomGenerator {
    private RandomGenerator() {}

    public static int generateNumber(String errorField, String errorMessage) throws NotValidPropertiesException {
        int number = (int) (Math.random() * 100);

        if (number == 0) {
            throw new NotValidPropertiesException(errorField, errorMessage);
        }

        return number;
    }

    public static int generateNumber() throws NotValidPropertiesException {
        return (int) (Math.random() * 100);
    }
}
