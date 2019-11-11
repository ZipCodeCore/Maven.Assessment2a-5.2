package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding  - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        int pad = amountOfPadding - stringToBePadded.length();

        StringBuilder spaces = new StringBuilder();
        for (int i = 0; i < pad; i++) {
            spaces.append(" ");
        }
        return spaces + stringToBePadded;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding  - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        int pad = amountOfPadding - stringToBePadded.length();

        StringBuilder spaces = new StringBuilder();
        for (int i = 0; i < pad; i++) {
            spaces.append(" ");
        }
        return stringToBePadded + spaces;
    }

    /**
     * @param stringToBeRepeated   - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder repeat = new StringBuilder();
        for (int i = 0; i < numberOfTimeToRepeat; i++) {
            repeat.append(stringToBeRepeated);
        }
        return String.valueOf(repeat);
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        for (int i = 0; i < string.length(); i++) {
            if ((string.charAt(0) >= 'a' && string.charAt(0) <= 'z') || (string.charAt(0) >= 'A' && string.charAt(0) <= 'Z')) {
                return true;
            }
        }
        return false;
//        if (!isNumericString(string) && !isSpecialCharacterString(string)){
//            return true;
//        }return false;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
       return string.matches("-?\\d+(\\.\\d+)?");
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        return string.matches("[^A-Za-z0-9]");
    }
}
