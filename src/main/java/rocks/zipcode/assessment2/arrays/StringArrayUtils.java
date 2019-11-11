package rocks.zipcode.assessment2.arrays;

import java.util.ArrayList;
import java.util.List;

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
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
//        String[] slice = new String[startingIndex - endingIndex];
//        for (int i = 0; i < slice.length; i++) {
//            slice[i] = arrayToBeSpliced[startingIndex + i];
//        }
//        return slice;
        return null;
    }

    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex    - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        List<String> list = new ArrayList<>();
        for (int i = startingIndex; i < arrayToBeSpliced.length; i++) {
            list.add(String.valueOf(arrayToBeSpliced[i]));
        }
        return list.toArray(new String[list.size()]);
    }

}

