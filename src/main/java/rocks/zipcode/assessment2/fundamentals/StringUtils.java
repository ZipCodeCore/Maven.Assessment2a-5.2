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
        if(stringToBePadded.length() > amountOfPadding)
            return stringToBePadded;
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < amountOfPadding - stringToBePadded.length(); i++){
            result.append(" ");
        }
        result.append(stringToBePadded);
        return result.toString();
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        if(stringToBePadded.length() > amountOfPadding)
            return stringToBePadded;
        StringBuilder result = new StringBuilder();
        result.append(stringToBePadded);
        for(int i = 0; i < amountOfPadding - stringToBePadded.length(); i++){
            result.append(" ");
        }
        return result.toString();
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < numberOfTimeToRepeat; i++){
            result.append(stringToBeRepeated);
        }
        return result.toString();
    }



    public static Boolean between(Character middle, Character first, Character second) {
        return first <= middle && middle <= second;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        string = string.replace(" ", "");
        for(int i = 0; i < string.length(); i++) {
            if (!between(string.charAt(i), 'A', 'Z') && !between(string.charAt(i), 'a', 'z'))
                return false;
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        for(int i = 0; i < string.length(); i++) {
            if(!between(string.charAt(i), '0', '9'))
                return false;
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        for(int i = 0; i < string.length(); i++) {
            if(between(string.charAt(i), '0', '9') || between(string.charAt(i), 'A', 'Z') || between(string.charAt(i), 'a', 'z'))
                return false;
        }
        return true;
    }
}
