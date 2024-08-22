import controller.Shape;
import controller.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shapeObject = shapeFactory.getShape("SQUARE");
        shapeObject.draw();
    }
}