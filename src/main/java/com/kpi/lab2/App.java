package com.kpi.lab2;

import java.util.ArrayList;

/**
 * This application implemetns search for all local minimas in array.
 *
 * @author Vlad Gudikov
 * @version 1.0
 * @since 2017-03-08
 */
public class App {

    /**
     * This is the main function to run this applicaton and find all local minimas
     * in array
     * @param args
     */
    public static void main(String[] args) {

        int[] input = {4, 5, 4, 76, 2, 6, 1, 8};

        ArrayUtils utils = new ArrayUtils();

        ArrayList<MResult> output = new ArrayList<MResult>(utils.getLocalMinimum(input));

        utils.outputResult(output);

    }
}
