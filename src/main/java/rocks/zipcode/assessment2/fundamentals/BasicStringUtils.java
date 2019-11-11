package rocks.zipcode.assessment2.fundamentals;

import java.util.ArrayList;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        String newString;
        newString = string1 + string2;
        return newString;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        StringBuilder sb = new StringBuilder(string1).reverse();
        String result = sb.toString();
        return result;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        StringBuilder sb1 = new StringBuilder(string1).reverse();
        String new1 = sb1.toString();
        StringBuilder sb2 = new StringBuilder(string2).reverse();
        String new2 = sb2.toString();
        return new1 + new2;
    }

    /**
     * @param string             - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        ArrayList<String> result = new ArrayList<>();
        String[] str = string.split("");
        String[] charsToGo = charactersToRemove.split("");

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < charsToGo.length; j++) {
                if (charsToGo[j] == str[i]) {
                    continue;
                } else {
                    result.add(str[i]);
                }
            }
        }
        return result.toString();
    }

    /**
     * @param string             - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String[] charsToRemove = string.split(charactersToRemove);
        String strNew = string.replaceAll(charactersToRemove, "");
        StringBuilder sb2 = new StringBuilder(strNew).reverse();
        String newStr = sb2.toString();
        return newStr;
    }
}

