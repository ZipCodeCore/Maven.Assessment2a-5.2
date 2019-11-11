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
        String result = "";
        for(int i = 0; i < amountOfPadding - stringToBePadded.length(); i++){
            result += " ";
        }
        return result + stringToBePadded;

    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        String result = "";
        for(int i = 0; i < amountOfPadding - stringToBePadded.length(); i++){
            result += " ";
        }
        return stringToBePadded + result;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String result = "";
        for(int i = 0; i < numberOfTimeToRepeat; i++){
            result += stringToBeRepeated;
        }
        return result;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        string = string.replace(" ", "");
        for(int i = 0; i < string.length();i++){
            char next = string.charAt(i);
            if(!((next > 64 && next < 91) || (next > 96 && next < 123))){
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
        string = string.replace(" ", "");
        for(int i = 0; i < string.length();i++){
            char next = string.charAt(i);
            if(!(next > 47 && next < 58)){
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
        string = string.replace(" ", "");
        for(int i = 0; i < string.length();i++){
            char next = string.charAt(i);
            if(!((next > 32 && next < 48)||
               (next > 57 && next < 65)||
               (next > 90 && next < 97)||
               (next > 122 && next < 127))){
                return false;
            }
        }
        return true;
    }
}
