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
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex)  {
        if ( startingIndex < 0) {
            throw new IllegalArgumentException();  //TODO got wrong. review.
        } if (startingIndex >= arrayToBeSpliced.length) {
            throw new IndexOutOfBoundsException();
        }
        int arrayLength = 0;

        for (int i = startingIndex; i < endingIndex; i++) {
            arrayLength++;
        }

        String[] tempArr = new String[arrayLength];
        int counter = 0;
        for (int i = startingIndex; i < endingIndex; i++) {
            tempArr[counter] = arrayToBeSpliced[i];
            counter++;
        }   arrayToBeSpliced = tempArr;

        return arrayToBeSpliced;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        if ( startingIndex < 0) {
            throw new IndexOutOfBoundsException();  //TODO got wrong. review.
        } if (startingIndex >= arrayToBeSpliced.length) {
            throw new IllegalArgumentException();

        }
        String[] tempArr = new String[arrayToBeSpliced.length - startingIndex];
        int counter = 0;
        for (int i = startingIndex; i < arrayToBeSpliced.length; i++) {
            tempArr[counter] = arrayToBeSpliced[i];
            counter++;
        }   arrayToBeSpliced = tempArr;


        return arrayToBeSpliced;
    }
}
