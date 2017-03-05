package com.kpi.labs;

import java.io.IOException;

public class App {

    public static void main( String[] args ) throws IOException, NegativeValueException {

        MSquare square = new MSquare();
        SquareView view = new SquareView();
        SquareController controller = new SquareController(square, view);

        String fileName = "square.json";

        controller.putJSONToObject(fileName);
        controller.calculateMinimalSide();
        controller.calculateSideFromArea();

        controller.updateView();

    }
}
