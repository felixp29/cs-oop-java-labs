package lab06.prob01;

public class Circle extends Shape {

    private double radius;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "This is a " + getColor() + " circle, the area is " + getArea()
                + ", the perimeter is " + getPerimeter() + ". Is it filled? " + isFilled();
    }
}
