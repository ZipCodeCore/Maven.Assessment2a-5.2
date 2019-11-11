package rocks.zipcode.assessment2.arrays;

import java.util.Arrays;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        Integer [] newArray = Arrays.copyOf(integerArray,integerArray.length+1);
        for (int i = 0; i < integerArray.length; i++){
            newArray[i] = integerArray[i];
        }
        newArray[integerArray.length] = valueToBeAdded;
        return newArray;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        return null;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        return null;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        return null;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {

        Integer[] newArray = new Integer[integerArray.length];
        int counter =0;
        for (Integer value : integerArray){
            if ((value % 2 == 0)) {
                newArray[counter] = integerArray[counter] + 1;
            } else {
                newArray[counter] = integerArray[counter];
            }
            counter++;
        }
        return newArray;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        Integer[] newArray = new Integer[input.length];
        int counter =0;
        for (Integer value : input){
            if ((value % 2 == 0)) {
                newArray[counter] = input[counter];
            } else {
                newArray[counter] = input[counter] - 1;
            }
            counter++;
        }
        return newArray;
    }
}
