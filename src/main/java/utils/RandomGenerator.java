package utils;

import exceptions.NotValidPropertiesException;
import stats.Size;

public class RandomGenerator {
    private RandomGenerator() {}

    public static int generateNumber(String errorField, String errorMessage) throws NotValidPropertiesException {
        int number = (int) (Math.random() * 100);

        if (number == 0) {
            throw new NotValidPropertiesException(errorField, errorMessage);
        }

        return number;
    }

    public static int generateNumber() {
        return (int) (Math.random() * 100);
    }

    public static Size generateSize() {
        int defineSize = generateNumber();

        if (defineSize <= 33) {
            return Size.SMALL;
        } else if (defineSize <= 66) {
            return Size.MEDIUM;
        } else {
        return Size.BIG;
        }
    }
}
