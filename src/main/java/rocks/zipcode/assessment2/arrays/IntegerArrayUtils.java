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

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < integerArray.length; i++){
           result.add(integerArray[i]);
        }
        result.add(valueToBeAdded);
        Integer[] finalResult = result.toArray(new Integer[result.size()]);


        return finalResult;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    //not done
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {

        List<Integer> intList = new ArrayList<>(integerArray.length);
        for (int i : integerArray)
        {
            intList.add(i);
        }

        intList.set(indexToInsertAt,valueToBeInserted);

        Integer[] result = intList.toArray(new Integer[integerArray.length]);

        return result;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < integerArray.length; i++){
            result.add(integerArray[i]);
        }



        return result.get(indexToFetch);
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {


        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < integerArray.length; i++){
            if(integerArray[i] % 2 == 0){
                result.add(integerArray[i]);
                Integer value = result.get(i);
                value = value + 1;
                result.set(i, value);
            }
            else{
                result.add(integerArray[i]);
                Integer value = result.get(i);
                value = value - 1;
                result.set(i, value);
            }
        }
        Integer[] finalResult = result.toArray(new Integer[result.size()]);

        return finalResult;
    }


    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {

        ArrayList<Integer> result = new ArrayList<>();


        for(int i = 0; i < integerArray.length; i++){
            if(integerArray[i] % 2 == 0){
                result.add(integerArray[i]);
                Integer value = result.get(i);
                value = value + 1;
                result.set(i, value);
            }
            else{
                result.add(integerArray[i]);
            }
        }
        Integer[] finalResult = result.toArray(new Integer[result.size()]);

        return finalResult;
    }


    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {

        ArrayList<Integer> result = new ArrayList<>();


        for(int i = 0; i < input.length; i++){
            if(input[i] % 2 != 0){
                result.add(input[i]);
                Integer value = result.get(i);
                value = value - 1;
                result.set(i, value);
            }
            else{
                result.add(input[i]);
            }
        }
        Integer[] finalResult = result.toArray(new Integer[result.size()]);

        return finalResult;
    }
    }

