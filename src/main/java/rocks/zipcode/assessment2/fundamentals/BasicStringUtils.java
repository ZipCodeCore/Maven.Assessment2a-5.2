package rocks.zipcode.assessment2.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

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
        sb.reverse();
        return sb.toString();
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String reversed = reverse(string1) +  reverse(string2);
        return reversed;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {




        //int length = charactersToRemove.length();
        String[] charactersArray = charactersToRemove.split("");
        String blank = "";
       String[] stringArray = string.split("");
       for (int i=0; i < charactersToRemove.length() - 1; i++)
       {
           string.replaceAll(charactersArray[i], "");
       }
        return string;

//       for (int i = 0; i< string.length(); i++) {
//           for (int j = 0; j < charactersArray.length; j++)
//                if (!stringArray[i].equals(charactersArray[j])) {
//                blank += stringArray[i];
//            }
//        }
//        return blank;


//
//        StringBuilder sb = new StringBuilder(string);
//       String[] charactersArray = new String[charactersToRemove.length()];
//       String [] stringArray = string.split("");
//       ArrayList<String> stringList = new ArrayList<>(Arrays.asList(stringArray));
//        for (int i = 0; i < stringList.size(); i++) {
//            if (!stringList.get(i).equals(charactersArray[i])){
//                stringList.add(stringList.get(i));
//            }
//        }
//       return stringList

       //return string.replaceAll(charactersToRemove, "");
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String charsRemoved = removeCharacters(string, charactersToRemove);
        return reverse(charsRemoved);
    }
}
