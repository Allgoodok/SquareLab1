package com.kpi.labs;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import static java.lang.Math.sqrt;

/**
 * Created by vlad on 26.02.17.
 */
public class SquareController {

    private MSquare square;
    private SquareView view;

    public SquareController(MSquare square, SquareView view) {
        this.square = square;
        this.view = view;
    }

    public MSquare getSquare() {
        return square;
    }

    public void putJSONToObject(String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        square = mapper.readValue(getResource(fileName), MSquare.class);

    }

    public void calculateSideFromArea() throws NegativeValueException, NullPointerException {
        if (square.getSquareArea() <= 0) {
            throw new NegativeValueException("Value must not be negative or zero");
        } else {
            square.setSideLength(sqrt(square.getSquareArea()));
        }

    }

    public void calculateMinimalSide() throws NegativeValueException, NullPointerException {
        if (square.getSquareArea() <= 0) {
            throw new NegativeValueException("Value must not be negative");
        } else {
            square.setOutterSideLength(sqrt(square.getSquareArea() / 2.0) * 2);
        }
    }

    public void updateView() {
        view.printSideOfSquare(square.getSideLength());
        view.printSideOfOutterSquare(square.getOutterSideLength());
    }

    private static File getResource(String resourceName) {
        File newFile = null;
        try {
            URL resource = Thread.currentThread().getContextClassLoader()
                    .getResource(resourceName);
            newFile = new File(resource.toURI());
        } catch (Exception e) {
            System.err.println("Error loading resource file: " + newFile.getAbsolutePath());
        }

        return newFile;
    }

}
