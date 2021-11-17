package rocks.zipcode.assessment2.arrays;

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
        if (startingIndex < 0 || endingIndex < 0) {throw new IllegalArgumentException();}
        if (startingIndex > arrayToBeSpliced.length || endingIndex > arrayToBeSpliced.length){throw new IndexOutOfBoundsException();}
        String[] newStringArray = new String[endingIndex - startingIndex];
        for (int i = 0; i < newStringArray.length; i++) {
            newStringArray[i] = arrayToBeSpliced[startingIndex + i];
        }
        return newStringArray;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        //these exceptions are backwards, but write to the test
        if (startingIndex > arrayToBeSpliced.length){throw new IllegalArgumentException();}
        if (startingIndex < 0){throw new IndexOutOfBoundsException();}
        return getSubArray(arrayToBeSpliced,startingIndex,arrayToBeSpliced.length);
    }
}
