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
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        if (startingIndex < 0 ){throw new IllegalArgumentException();}
        String[] shortArr = new String[endingIndex - startingIndex];
        for (int i = 0 ; i < shortArr.length ; i++ ){
            shortArr[i] = arrayToBeSpliced[startingIndex+i];
            if (arrayToBeSpliced[startingIndex+i] == arrayToBeSpliced[endingIndex]){
                break;
            }
        }
        System.out.println(shortArr);
        return shortArr;

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