package com.kpi.lab1;

import java.io.IOException;

public class App {

    public final static String FILE_NAME = "square.json";

    public static void main( String[] args ) throws IOException, NegativeValueException {

        MSquare square = new MSquare();
        SquareView view = new SquareView();
        SquareController controller = new SquareController(square, view);

        controller.putJSONToObject(FILE_NAME);
        controller.calculateMinimalSide();
        controller.calculateSideFromArea();

        controller.updateView();

    }
}
