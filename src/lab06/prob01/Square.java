package lab06.prob01;

public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        this.setWidth(side);
    }

    @Override
    public String toString() {
        return "This is a " + getColor() + " square, the area is " + getArea()
                + ", the perimeter is " + getPerimeter() + ". Is it filled? " + isFilled();
    }
}
