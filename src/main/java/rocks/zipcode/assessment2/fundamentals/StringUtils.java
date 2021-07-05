package rocks.zipcode.assessment2.fundamentals;

//import com.sun.org.apache.xpath.internal.operations.String;

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
        StringBuilder builder = new StringBuilder();
        for (int j = 0; j < amountOfPadding - stringToBePadded.length(); j++) {
            builder.append(" ");
        }
        return builder.append(stringToBePadded).toString();
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding  - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < amountOfPadding - stringToBePadded.length(); i++) {
            builder.append(" ");
        }
        return stringToBePadded + builder.toString();
    }

    /**
     * @param stringToBeRepeated   - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numberOfTimeToRepeat; i++) {
            builder.append(stringToBeRepeated);
        }
        return builder.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        return string.matches("[a-z A-Z]+");
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        return string.matches("[0-9]+");
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        return string.matches("[" + "-/@#!*$%^&.'_+={}()"+ "]+");
    }
}
