package lab06.prob01;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle() {
        super();
    }

    public Rectangle(double width, double length) {
        this();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return "This is a " + getColor() + " rectangle, the area is " + getArea()
                + ", the perimeter is " + getPerimeter() + ". Is it filled? " + isFilled();
    }
}
