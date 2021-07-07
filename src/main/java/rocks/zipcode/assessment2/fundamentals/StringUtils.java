package rocks.zipcode.assessment2.fundamentals;

//import com.sun.org.apache.xpath.internal.operations.String;

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
        StringBuilder sb = new StringBuilder(stringToBePadded);
        int numberOfSpaces = amountOfPadding - stringToBePadded.length();
        for (int i = 0; i < numberOfSpaces; i++) {
             sb.insert(0," ");
        }
        String result = sb.toString();
        return result;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        StringBuilder sb = new StringBuilder(stringToBePadded);
        int numberOfSpaces = amountOfPadding - stringToBePadded.length();
        for (int i = 0; i < numberOfSpaces; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder sb = new StringBuilder(stringToBeRepeated);
        for (int i = 0; i < numberOfTimeToRepeat - 1; i++) {
             sb.append(stringToBeRepeated);
        }
        return sb.toString();
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
        return string.matches("[^A-Z a-z0-9]+");

    }
}
