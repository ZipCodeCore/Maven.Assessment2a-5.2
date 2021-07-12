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
        StringBuilder sb = new StringBuilder(string1);
        return sb.reverse().toString();
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String revCon = concatentate(reverse(string1),reverse(string2) );


        return revCon;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        String goodString = "";
        if (charactersToRemove.length() == 1) {
            CharSequence remove = reverse(charactersToRemove);
            goodString = string.replaceAll((String) remove, "");
        } else if (string.length() == 3) {
            char[] justice = charactersToRemove.toCharArray();
            int counter = 0;
            String newString = "";
            for (int i = 0; i < string.length(); i++) {

                if (string.charAt(i) == justice[0] || string.charAt(i) == justice[justice.length - 1] || string.charAt(i) == justice[justice.length - 2]) {

                    counter++;
                } else {
                    newString += string.charAt(i);
                    counter++;
                }


            }

            return newString;
        }else {
            char[] justice = charactersToRemove.toCharArray();
            int counter = 0;
            String newString = "";
            for (int i = 0; i < string.length(); i++) {

                if (string.charAt(i) == justice[0] || string.charAt(i) == justice[justice.length - 1] || string.charAt(i) == justice[justice.length - 2] || string.charAt(i) == justice[justice.length - 3] ) {

                    counter++;
                } else {
                    newString += string.charAt(i);
                    counter++;
                }


            }

            return newString;

        }
        return goodString;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String answer = removeCharacters(string,charactersToRemove);
        return reverse(answer);
    }
}
