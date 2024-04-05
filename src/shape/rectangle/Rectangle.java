package shape.rectangle;

import shape.Shape;

public class Rectangle<T extends Number> extends Shape {
    private T length;
    private T width;

    public Rectangle(T length, T width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length.doubleValue() * width.doubleValue();
    }

    @Override
    public String getType() {
        return "Rectangle";
    }
}
