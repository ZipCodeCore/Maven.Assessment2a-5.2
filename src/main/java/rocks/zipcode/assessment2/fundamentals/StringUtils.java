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
        return String.format("%" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding  - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return String.format("%-" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBeRepeated   - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String repeated = new String(new char[numberOfTimeToRepeat]).replace("\0", stringToBeRepeated);
        return repeated;
        //https://www.edureka.co/community/17178/what-is-a-simple-way-to-repeat-a-string-in-java
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        if (string.matches("[a-zA-Z]")) {
            return true;
        } else {
            return false;
        }
    }

            /**
             * @param string - string to be evaluated
             * @return - true if string only contains numeric characters
             */
    public static Boolean isNumericString(String string) {
        boolean numeric = true;
        if(string.matches("-?\\d+(\\.\\d+)?")) {
            return true;
        }else {
            return false;
        }
    }
//        boolean containsNumbers = false;
//
//        if (string != null && !string.isEmpty()) {
//            for (char c : string.toCharArray()) {
//                if (containsNumbers = Character.isDigit(c)) {
//                    break;
//                }
//            }
//        }
//
//        return containsNumbers;
//    }
    //https://stackoverflow.com/questions/18590901/check-if-a-string-contains-numbers-java

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        String specialCharacters = "[" + "-/@#!*$%^&.'_+={}()"+ "]+" ;

        if ( string.matches(specialCharacters)) {
            return true;
        }else{
            return false;
        }
    }
}
