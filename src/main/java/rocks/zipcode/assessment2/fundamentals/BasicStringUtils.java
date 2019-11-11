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
        char[] arr = string1.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string1.length(); i++) {
            sb.append(arr[i]);
        }
        return sb.reverse().toString();
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String str1Rev = reverse(string1);
        String str2Rev = reverse(string2);
        return concatentate(str1Rev, str2Rev);
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */

    static final int NUMBEROFCHARS = 256;

    static int[] getCharCountArray(String str) {
        int count[] = new int[NUMBEROFCHARS];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        return count;
    }
    public static String removeCharacters(String string, String charactersToRemove) {
        int count[]  = getCharCountArray(charactersToRemove);
        int inputIndex  = 0, resultIndex = 0;
        char arr[] = string.toCharArray();

        while (inputIndex != arr.length) {
            char temp = arr[inputIndex];
            if(count[temp] == 0) {
                arr[resultIndex] = arr[inputIndex];
                resultIndex ++;
            }
            inputIndex++;
        }
        string = new String(arr);
        return string.substring(0, resultIndex);
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String removed = removeCharacters(string, charactersToRemove);
        String result = reverse(removed);
        return result;
    }
}
