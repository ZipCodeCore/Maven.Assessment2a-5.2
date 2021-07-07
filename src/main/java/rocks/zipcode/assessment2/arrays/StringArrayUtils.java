package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {

    public static String[] result;

    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {

        if(startingIndex < 0 || endingIndex < 0){

            throw new IllegalArgumentException();

        }else if(startingIndex > arrayToBeSpliced.length || endingIndex > arrayToBeSpliced.length) {

            throw new IndexOutOfBoundsException();

        }else {
            result = new String[endingIndex - startingIndex];
            int x = 0;

            for (int i = startingIndex; i < endingIndex; i++) {
                result[x] = arrayToBeSpliced[i];
                x++;
            }
        }

            return result;
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

        } else {
            result = new String[arrayToBeSpliced.length - startingIndex];
            int x = 0;

            for (int i = startingIndex; i < arrayToBeSpliced.length; i++) {
                result[x] = arrayToBeSpliced[i];
                x++;
            }
        }
        return result;
    }
}
