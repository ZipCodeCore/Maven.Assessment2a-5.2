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
        if(startingIndex < 0 || startingIndex > endingIndex) {
            throw new IllegalArgumentException();
        } else if (endingIndex >= arrayToBeSpliced.length) {
            throw new IndexOutOfBoundsException();
        }

        String[] resized = new String[endingIndex - startingIndex];
        for (int i = 0; i < resized.length; i++) {
            resized[i] = arrayToBeSpliced[i + startingIndex];
        }
        return resized;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        if (startingIndex < 0) {
            throw new IndexOutOfBoundsException();
        } else if (startingIndex > arrayToBeSpliced.length) {
            throw new IllegalArgumentException();
        }

        String[] resized = new String[arrayToBeSpliced.length - startingIndex];
        for (int i = 0; i < resized.length; i++) {
           resized[i] = arrayToBeSpliced[i + startingIndex];
        }
        return resized;
    }
}
