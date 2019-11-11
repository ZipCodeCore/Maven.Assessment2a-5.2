package rocks.zipcode.assessment2.arrays;

import java.util.ArrayList;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex    - starting index of array to be spliced
     * @param endingIndex      - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) throws IndexOutOfBoundsException, IllegalArgumentException {
        String[] shortArr = new String[endingIndex - startingIndex-1];
        return null;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex    - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) throws IllegalArgumentException {
        ArrayList<String> endingArr = new ArrayList<>();
        for (int i = startingIndex ; i < arrayToBeSpliced.length ;  i ++){
            endingArr.add(startingIndex, arrayToBeSpliced[i]);
        }
        return (String[]) endingArr.toArray();
    }
}
