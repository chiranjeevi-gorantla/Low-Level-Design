package controller;

import model.Circle;
import model.Rectangle;
import model.Square;

public class ShapeFactory {
    public Shape getShape(String shape) {
        switch (shape) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}
