package rocks.zipcode.assessment2.fundamentals;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        String str1 = new StringBuilder(string1).toString();

        String str2 = new StringBuilder(string2).toString();
       String str= str1.concat(str2);


        return str;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        String str1 = new StringBuilder(string1).reverse().toString();

        return str1;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String str1=new StringBuilder(string1).reverse().toString();
        String str2=new StringBuilder(string2).reverse().toString();
        return str1.concat(str2);
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        String str1=new StringBuilder(string).toString();


return null;

    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String str =string.replaceAll(charactersToRemove,"");
                   return   new StringBuilder(str).reverse().toString();



    }
}
