package com.kpi.lab1;

/**
 * Created by vlad on 26.02.17.
 */
public class MSquare {

    private double squareArea;
    private double sideLength;
    private double outterSideLength;

    public MSquare(double squareArea) {
        this.squareArea = squareArea;
    }

    public MSquare() {

    }

    public double getOutterSideLength() {
        return outterSideLength;
    }

    public void setOutterSideLength(double outterSideLength) {
        this.outterSideLength = outterSideLength;
    }

    public double getSquareArea() {
        return squareArea;
    }

    public void setSquareArea(double squareArea) {
        this.squareArea = squareArea;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
}
