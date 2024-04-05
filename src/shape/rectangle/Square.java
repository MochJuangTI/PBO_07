package shape.rectangle;

public class Square<T extends Number> extends Rectangle<T> {
    public Square(T side) {
        super(side, side);
    }

    @Override
    public String getType() {
        return "Square";
    }

}
