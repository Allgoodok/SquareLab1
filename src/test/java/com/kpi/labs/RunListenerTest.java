package com.kpi.labs;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kpi.labs.listener.TestRunner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

@RunWith(TestRunner.class)
public class RunListenerTest {


    public static ArrayList<MSquare> inputObjectsPos = new ArrayList<MSquare>();
    public ArrayList<MSquare> inputObjectsNeg = new ArrayList<MSquare>();
    public double[] expectedResult = {64.0, 0.0, -189.234, 45.213414312, -45.213414312};
    public static double[] inputDataPos = {64.0, 9.0, 14.67, 8.2345, 3.12324};
    public static double[] outputDataSidePos = {8.0, 3.0, 3.83014360044, 2.86958185107, 1.76726907968};
    public static double[] outputDataSideOuterPos = {11.313708499, 4.24264068712, 5.41664102558, 4.05820157213, 2.49929590085};

    @BeforeClass
    public static void initializeTest() {
        for (double i : inputDataPos) {
            inputObjectsPos.add(new MSquare(i));
        }
    }

    @Test
    public void testJSONToObject() throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        for (int i = 0; i < 5; i++) {
            int fileNum = i+1;
            MSquare testSquare = new MSquare();
            SquareView testView = new SquareView();
            SquareController testController = new SquareController(testSquare, testView);
            testController.putJSONToObject("testSet" + fileNum + ".json");
            Assert.assertEquals(expectedResult[i], testController.getSquare().getSquareArea(), 0.0);
        }
    }

    @Test
    public void testSideFromAreaPos() throws NegativeValueException {
        int pos = 0;
        for (MSquare i : inputObjectsPos) {
            SquareView testView = new SquareView();
            SquareController testController = new SquareController(i, testView);
            testController.calculateSideFromArea();
            Assert.assertEquals(outputDataSidePos[pos], testController.getSquare().getSideLength(), 0.00001);
            pos++;
        }
    }

    @Test
    public void testMinimalSidePos() throws NegativeValueException {
        int pos = 0;
        for (MSquare i : inputObjectsPos) {
            SquareView testView = new SquareView();
            SquareController testController = new SquareController(i, testView);
            testController.calculateMinimalSide();
            Assert.assertEquals(outputDataSideOuterPos[pos], testController.getSquare().getOutterSideLength(), 0.00001);
            pos++;
        }
    }

}
