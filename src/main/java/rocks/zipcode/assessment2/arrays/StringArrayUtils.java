package rocks.zipcode.assessment2.arrays;

import java.util.Map;

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
        startingIndex = Math.abs(startingIndex);
        endingIndex = Math.abs(endingIndex);
        String [] result = new String[endingIndex-startingIndex];
        int x = startingIndex;
        for (int i = 0; i < result.length; i++){
            result[i] = arrayToBeSpliced[x];
            x++;
        }
        return result;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {

        if (startingIndex < 0 || startingIndex > arrayToBeSpliced.length){
            String[] result = new String[arrayToBeSpliced.length];
            return result;
        } else {
            int x = startingIndex;
            String[] result = new String[arrayToBeSpliced.length - startingIndex];
            for (int i = 0; i < result.length; i++) {
                result[i] = arrayToBeSpliced[x];
                x++;
            }
            return result;
        }
    }
}
