package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        StringBuilder stringToBePaddedBuilder = new StringBuilder(stringToBePadded);
        for (int i = 0; i < amountOfPadding - stringToBePadded.length(); i++) {
            stringToBePaddedBuilder.insert(0, " ");
        }
        stringToBePadded = stringToBePaddedBuilder.toString();
        return stringToBePadded;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        StringBuilder stringToBePaddedBuilder = new StringBuilder(stringToBePadded);
        for (int i = 0; i < amountOfPadding - stringToBePadded.length(); i++) {
            stringToBePaddedBuilder.append(" ");
        }
        stringToBePadded = stringToBePaddedBuilder.toString();
        return stringToBePadded;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder stringToBeRepeatedBuilder = new StringBuilder(stringToBeRepeated);
        for (int i = 0; i < numberOfTimeToRepeat - 1; i++) {
            stringToBeRepeatedBuilder.append(stringToBeRepeated);
        }
        stringToBeRepeated = stringToBeRepeatedBuilder.toString();
        return stringToBeRepeated;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        for (char c : string.toCharArray()) {
            if (!Character.isLetter(c) && !Character.isSpaceChar(c)) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        for (char c : string.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        for (char c : string.toCharArray()) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
}
