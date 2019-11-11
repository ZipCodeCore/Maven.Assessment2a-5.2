package rocks.zipcode.assessment2.arrays;

import java.util.Arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        Integer newLen = 0;
        if (indexInRange(arrayToBeSpliced, startingIndex, endingIndex)) {
            newLen = endingIndex - startingIndex;
        }
        String[] newArray = new String[newLen];
        Integer index = 0;
        if (indicesWithinBounds(arrayToBeSpliced, startingIndex, endingIndex)) {
            for (int i = startingIndex; i < endingIndex; i++) {
                newArray[index] = arrayToBeSpliced[i];
                index++;
            }
        }
        return newArray;
    }

    public static Boolean indicesWithinBounds(String[] array, Integer start, Integer end) {
        if (end > array.length || start > array.length) {
            throw new IndexOutOfBoundsException();
        } else return true;
    }

    public static Boolean indexInRange(String[] array, Integer start, Integer end) {
        if (start < 0 || end < 0) {
            throw new IllegalArgumentException();
        }
        else return true;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        Integer newLen = 0;
        if (startingIndex > arrayToBeSpliced.length) {
            throw new IllegalArgumentException();
        } else if (startingIndex < 0) {
            throw new IndexOutOfBoundsException();
        } else newLen = arrayToBeSpliced.length - startingIndex;
        String[] output = new String[newLen];
        for (int i = 0; i < newLen; i++) {
            output[i] = arrayToBeSpliced[i + startingIndex];
        }
        return output;
    }
}
