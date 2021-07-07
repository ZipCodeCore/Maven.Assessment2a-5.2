package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {

    public static Integer[] result;

    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        result = new Integer[integerArray.length + 1];

        for(int index = 0; index < integerArray.length; index++)
            result[index] = integerArray[index];

        result[result.length -1] = valueToBeAdded;

        return result;
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

        int result = integerArray[indexToFetch];

        return result;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        result = new Integer[integerArray.length];

        for(int index = 0; index < result.length; index++){
            if(integerArray[index] % 2 == 0){
                result[index] = integerArray[index] + 1;
            }else
                result[index] = integerArray[index] - 1;
        }

        return result;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        result = new Integer[integerArray.length];

        for(int index = 0; index < result.length; index++){
            if(integerArray[index] % 2 == 0) {
                result[index] = integerArray[index] + 1;

            }else
                result[index] = integerArray[index];
        }

        return result;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        result = new Integer[input.length];

        for (int index = 0; index < result.length; index++) {
            if (input[index] % 2 != 0) {
                result[index] = input[index] - 1;

            } else
                result[index] = input[index];
        }

        return result;
    }
}
