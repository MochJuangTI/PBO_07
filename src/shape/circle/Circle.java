package shape.circle;

import shape.Shape;

public class Circle<T extends Number> extends Shape {
    private T radius;

    public Circle(T radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius.doubleValue() * radius.doubleValue();
    }
    @Override
    public String getType() {
        return "Circle";
    }
}
