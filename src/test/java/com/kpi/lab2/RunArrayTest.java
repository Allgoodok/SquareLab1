package com.kpi.lab2;

import com.kpi.listener.TestRunner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;

/**
 * Created by vlad on 09.03.17.
 */

@RunWith(TestRunner.class)
public class RunArrayTest {

    public static int[] input = {2, 4, 5, 3, 8, -9, 12, -8, 54, -32, 4, -654, -56, -54, 0, 0, 0, 3};

    public static int[] outputIndex = {3, 5, 7, 9, 11};
    public static int[] outputValue = {3, -9, -8, -32, -654};

    public static ArrayUtils utils;

    @BeforeClass
    public static void initializeClass() {
        utils = new ArrayUtils();
    }


    @Test
    public void testLocalMinimum() {

        ArrayList<MResult> result;
        int indexCheck = 0;

        result = new ArrayList<MResult>(utils.getLocalMinimum(input));

        for (MResult i : result) {
            Assert.assertEquals(i.getLocalMinimumIndex(), outputIndex[indexCheck]);
            Assert.assertEquals(i.getLocalMinimumValue(), outputValue[indexCheck]);
            indexCheck++;
        }

    }

}
