package com.kpi.lab2;

import java.util.ArrayList;

/**
 * The ArrayUtils class implements the search engine for local minima in array.
 */
public class ArrayUtils {

    private ArrayList<MResult> result;


    public ArrayUtils() {
        result = new ArrayList<MResult>();
    }

    /**
     * This method is used to find all local minimas in array and write them down
     * in ArrayList as a result set of indexes and values.
     * @param input
     * @return ArrayList
     */

    public ArrayList<MResult> getLocalMinimum(int[] input) {

        ArrayList<MResult> output = new ArrayList<MResult>();

        for (int i = 1; i <  input.length; i++) {
            if ((input[i] < input[i - 1]) && (input[i] < input[i + 1])) {
                MResult item = new MResult();
                item.setLocalMinimumValue(input[i]);
                item.setLocalMinimumIndex(i);
                output.add(item);
            }
        }

        return output;

    }

    /**
     * This method is used to output the result as index and value of the element
     * represented   in array.
     * @param output
     */
    public void outputResult(ArrayList<MResult> output) {
        for (MResult i : output) {
            System.out.println("Index of local minimum: " + i.getLocalMinimumIndex());
            System.out.println("Value of local minimum: " + i.getLocalMinimumValue());
            System.out.println();
        }
    }

}
