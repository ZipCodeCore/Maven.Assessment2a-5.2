package rocks.zipcode.assessment2.fundamentals;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {

        return string1 + string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        StringBuilder sb = new StringBuilder();
        sb.append(string1);
        sb.reverse();
        return sb.toString();
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String s1 = reverse(string1);
        String s2 = reverse(string2);
        return s1 + s2;

//        Original solution
//        StringBuilder sb1 = new StringBuilder();
//        StringBuilder sb2 = new StringBuilder();
//        sb1.append(string1);
//        sb1.reverse();
//        sb2.append(string2);
//        sb2.reverse();
//        String result = sb1.toString() + sb2.toString();
//        return result;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        for(int i = 0; i < charactersToRemove.length() ; i++){
            Character temp = charactersToRemove.charAt(i);
            string = string.replace(temp.toString(), "");
        }
        return  string;

//        String strNew = string.replace(charactersToRemove, "");
//        return strNew;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        string = reverse(string);
        string = removeCharacters(string,charactersToRemove);
        return string;
    }

}
