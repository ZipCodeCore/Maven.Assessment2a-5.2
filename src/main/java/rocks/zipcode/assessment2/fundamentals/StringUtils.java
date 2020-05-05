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
        String newString = "";
        for (int i = 0; i < amountOfPadding-stringToBePadded.length(); i++) {
            newString+=" ";

        }
        return newString.concat(stringToBePadded);

    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        for (int i = stringToBePadded.length(); i < amountOfPadding; i++) {
            stringToBePadded+=" ";
        }
        return stringToBePadded;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String newString = "";
        for (int i = 0; i < numberOfTimeToRepeat; i++) {
            newString+=stringToBeRepeated;
        }
        return newString;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        Boolean isAlpha = true;
        char[]checker = string.replace(" ","").toCharArray();
        for (int i = 0; i < checker.length; i++) {
            if (Character.isAlphabetic(checker[i])==false){
                isAlpha = false;
            }

        }
        return isAlpha;
    }


    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        Boolean isNum = true;
        char[]checker = string.toCharArray();
        for (int i = 0; i < checker.length; i++) {
            if (Character.isDigit(checker[i])==false){
                isNum = false;
            }

        }
        return isNum;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        Boolean isSpecial = true;
        for (int i = 0; i < string.length(); i++) {
            if (!String.valueOf(string.charAt(i)).matches("[^a-zA-Z0-9]")){
                isSpecial = false;
            }
        }
        return isSpecial;
    }
}
