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
       return String.format("%1$"+ amountOfPadding+ "s", stringToBePadded);


    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {

        return String.format("%-" + amountOfPadding + "s" ,stringToBePadded);
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        return String.format("%0" + numberOfTimeToRepeat+"d", 0).replace("0", stringToBeRepeated);


    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        char []charArray=string.toCharArray();
        for(int i=0;i<charArray.length;i++){
            if(Character.isLetter(charArray[i])) {

                return true;

            }
break;
            }
        return false ;

    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        char []charArray=string.toCharArray();
        for(int i=0;i<charArray.length;i++){
            if(Character.isDigit(charArray[i])){
                return true;
            }
         break;


        }
        return false ;


    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        char []charArray=string.toCharArray();
        for(int i=0;i<charArray.length;i++){
            /*if((Character.isDigit(charArray[i])&&Character.isSpaceChar(charArray[i]))
                    ||(Character.isLetter(charArray[i])&&Character.isSpaceChar(charArray[i]))
                    ||Character.isSpaceChar(charArray[i]))*/

            if(Character.isSpaceChar(charArray[i]))
            {
              return true;
            }
            break;
        }
        return false;
    }
}
