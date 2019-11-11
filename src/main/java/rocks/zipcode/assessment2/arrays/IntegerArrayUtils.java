package rocks.zipcode.assessment2.arrays;

import java.util.ArrayList;
import java.util.Arrays;
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
        Integer arraylength =  integerArray.length;
        Integer[] newArray = new Integer[arraylength+1];
        int i=0;
        for (Integer intValue : newArray)
        {

            if (i> arraylength+1)
            {
                newArray[i] = valueToBeAdded;
                i++;
            }
            else
            {
                newArray[i] = intValue;
                i++;
            }
        }


        newArray[arraylength] = valueToBeAdded;
        return newArray;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
       /* List<Integer> list = Arrays.asList(integerArray);
        list.add(indexToInsertAt,valueToBeInserted);

        Integer arraylength =  integerArray.length;
        Integer[] newArray = new Integer[arraylength+1]; */

        integerArray[indexToInsertAt] = valueToBeInserted;

        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        return integerArray[indexToFetch];
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        Integer arraylength =  integerArray.length;
        Integer[] newArray = new Integer[arraylength];

        int i=0;
        for (Integer intValue: integerArray) {
            if(intValue%2 == 0)
            {
                newArray[i] = intValue+1;
                i++;
            }
            else
            {
                newArray[i] = intValue-1;
                i++;
            }
        }

        return newArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        Integer arraylength =  integerArray.length;
        Integer[] newArray = new Integer[arraylength];

        int i=0;
        for (Integer intValue: integerArray) {
            if(intValue%2 == 0)
            {
                newArray[i] = intValue+1;
                i++;
            }

        }

        return newArray;

    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        Integer arraylength =  input.length;
        Integer[] newArray = new Integer[arraylength];

        int i=0;
        for (Integer intValue: input) {
            if(intValue%2 != 0)

            {
                newArray[i] = intValue-1;
                i++;
            }
        }

        return newArray;
    }


    //added by usha
    public static Integer[] castingMethodtoInteger(ArrayList al)
    {
        Integer[] c = new Integer[al.size()];
        for(int i = 0; i < al.size(); i++)
        {
            c[i] = (Integer) al.get(i);
        }
        return c;

    }
}
