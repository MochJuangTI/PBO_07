import shape.Shape;
import shape.circle.Circle;
import shape.rectangle.Rectangle;
import shape.rectangle.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        Rectangle<Integer> rectangle = new Rectangle<>(5, 4);
        shapes.add(rectangle);

        Square<Double> square = new Square<>(3.0);
        shapes.add(square);

        Circle<Float> circle = new Circle<>(2.5f);
        shapes.add(circle);

        double totalArea = calculateTotalArea(shapes);
        System.out.println("Total area of all shapes: " + totalArea);
    }

    // Generic method to calculate total area of all shapes
    public static double calculateTotalArea(List<? extends Shape> shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            System.out.println("shape " + shape.getType() + ", with area : " + shape.area());
            totalArea += shape.area();
        }

        return totalArea;
    }
}