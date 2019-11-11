package rocks.zipcode.assessment2.fundamentals;

import javax.print.attribute.standard.PresentationDirection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        String result = "";

        result = String.format("%" + amountOfPadding + "s",stringToBePadded);
        return result;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {

        String result = "";

        result = String.format("%-" + amountOfPadding + "s",stringToBePadded);
        return result;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String result = "";

        for (int i = 0; i < numberOfTimeToRepeat; i++){
            result = result.concat(stringToBeRepeated);
        }
        return result;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        boolean result = false;
        char [] chars = string.toCharArray();
        for (char value : chars){
            if (Character.isDigit(value)){
                break;
            }
             result = Character.isLetter(value);
        }
        return result;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        boolean result = false;
        char [] chars = string.toCharArray();

        for (char value : chars){
            if (Character.isLetter(value)){
                break;
            }
            result = Character.isDigit(value);
        }

        return result;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {

        return (!isAlphaString(string) && !isNumericString(string));
    }
}
