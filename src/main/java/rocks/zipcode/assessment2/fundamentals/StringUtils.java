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
        StringBuilder rightJustifiedString = new StringBuilder(stringToBePadded);
        for(int i = 0; i < amountOfPadding - stringToBePadded.length(); i++){
            rightJustifiedString.insert(0," ");
        }
        return rightJustifiedString.toString();
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        StringBuilder rightJustifiedString = new StringBuilder(stringToBePadded);
        for(int i = 0; i < amountOfPadding - stringToBePadded.length(); i++){
            rightJustifiedString.append(" ");
        }
        return rightJustifiedString.toString();    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder repeatedString = new StringBuilder();
        for (int i = 0; i < numberOfTimeToRepeat; i++){
            repeatedString.append(stringToBeRepeated);
        }
        return repeatedString.toString();
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
        try {
            Double.parseDouble(string);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
//        if (isAlphaString(string)){return false;}
//        else if (isNumericString(string)){return false;}
//        return true;
        for (char c : string.toCharArray()){
            if(isNumericString(Character.toString(c))){return false;}
            else if (isAlphaString(Character.toString(c))){return false;}
        }
        return true;
    }
}
