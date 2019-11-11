package rocks.zipcode.assessment2.arrays;

import java.util.ArrayList;

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
    //not done// one test failing
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) throws IllegalArgumentException, IndexOutOfBoundsException {

        String[] result = new String[endingIndex - startingIndex];

        int count = 0;
        int i = startingIndex;

            do {
                result[count] = arrayToBeSpliced[i];
                count++;
                i++;

                if(startingIndex < 0){
                    System.out.println("no");
                    throw new IndexOutOfBoundsException();
                }
                if(startingIndex > arrayToBeSpliced.length){
                    System.out.println("no");
                    throw new IllegalArgumentException();

                }

            }

            while (arrayToBeSpliced[i] != arrayToBeSpliced[endingIndex]);

            return result;
        }





    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    //need to pass one more test
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) throws IllegalArgumentException, IndexOutOfBoundsException{

        ArrayList<String> result = new ArrayList<>();

            for (int i = startingIndex; i < arrayToBeSpliced.length; i++) {
                result.add(arrayToBeSpliced[i]);
            }

        if(startingIndex < 0){
            System.out.println("no");
            throw new IndexOutOfBoundsException();
        }
        if(startingIndex > arrayToBeSpliced.length){
            System.out.println("no");
            throw new IllegalArgumentException();

        }

        String[] finalResult = result.toArray(new String[result.size()]);
        return finalResult;

    }
    }

