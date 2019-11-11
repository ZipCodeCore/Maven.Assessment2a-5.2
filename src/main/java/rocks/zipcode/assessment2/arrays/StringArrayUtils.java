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
//        String[] shortArr = new String[endingIndex - startingIndex-1];
        ArrayList<String> subArr = new ArrayList<>();

        return null;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex    - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) throws IllegalArgumentException {

        ArrayList<String> lastHalf = new ArrayList<>();
        for (int j = startingIndex; j < arrayToBeSpliced.length ; j++) {
                lastHalf.add(arrayToBeSpliced[startingIndex+j]);
        }
        if (startingIndex > arrayToBeSpliced.length){
            throw new IllegalArgumentException();
        }
        return lastHalf.toArray(new String[0]);
    }
}