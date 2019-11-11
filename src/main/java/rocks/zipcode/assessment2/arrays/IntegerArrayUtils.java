package rocks.zipcode.assessment2.arrays;

import java.util.ArrayList;
import java.util.List;

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
        List<Integer> myArray = new ArrayList<>();
        for(int currentIndex = 0;currentIndex < integerArray.length; currentIndex++){
            myArray.add(integerArray[currentIndex]);
        }
        myArray.add(valueToBeAdded);
        return myArray.toArray(new Integer[myArray.size()]);
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        integerArray[indexToInsertAt] = valueToBeInserted;
        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        Integer result = 0;
        for (int currentIndex = 0; currentIndex < integerArray.length; currentIndex++) {
            Integer currentElement = integerArray[indexToFetch];
            result = currentElement;
        }
        return result;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        List<Integer> myArray = new ArrayList<>();
        for (int currentIndex = 0; currentIndex < integerArray.length; currentIndex++) {
            Integer currentElement = integerArray[currentIndex];
            if(currentElement % 2 == 0){
                currentElement++;
            }else
                currentElement--;
            myArray.add(currentElement);
        }
        return myArray.toArray(new Integer[0]);
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        List<Integer> myArray = new ArrayList<>();
        for (int currentIndex = 0; currentIndex < integerArray.length; currentIndex++) {
            Integer currentElement = integerArray[currentIndex];
            if(currentElement % 2 == 0){
                currentElement++;
            }
            myArray.add(currentElement);

        }
        return myArray.toArray(new Integer[0]);
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input){
        List<Integer> myArray = new ArrayList<>();
        for (int currentIndex = 0; currentIndex < input.length; currentIndex++) {
            Integer currentElement = input[currentIndex];
            if(currentElement % 2 != 0){
                currentElement--;
            }
            myArray.add(currentElement);
        }
        return myArray.toArray(new Integer[0]);
    }
}
