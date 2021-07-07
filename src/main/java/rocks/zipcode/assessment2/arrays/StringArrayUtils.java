package rocks.zipcode.assessment2.arrays;

import java.lang.reflect.Array;
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
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex)  {
        ArrayList<String> result = new ArrayList<>();

        if(startingIndex < 0){
            throw new IllegalArgumentException("no good");
        }else if(endingIndex > arrayToBeSpliced.length){
            throw new ArrayIndexOutOfBoundsException("bad input");
        }


        for(int i = 0 ; i < arrayToBeSpliced.length; i++){
            if(i >= startingIndex && i < endingIndex)
                result.add(arrayToBeSpliced[i]);
        }

        String[] finalResult = new String[result.size()];

        for(int i = 0; i < result.size(); i++){
            finalResult[i] = result.get(i);
            System.out.println(finalResult[i]);
        }
        return finalResult;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        ArrayList<String> result = new ArrayList<>();

        if(startingIndex < 0){
            throw new IndexOutOfBoundsException("no good");
        }else if(startingIndex > arrayToBeSpliced.length){
            throw new IllegalArgumentException("bad input");
        }

        for(int i = 0; i < arrayToBeSpliced.length; i++){
            if(i >= startingIndex)
                result.add(arrayToBeSpliced[i]);
        }
        String[] finalResult = new String[result.size()];

        for(int i = 0; i < finalResult.length; i++){
            finalResult[i] = result.get(i);
        }

        return finalResult;
    }
}
