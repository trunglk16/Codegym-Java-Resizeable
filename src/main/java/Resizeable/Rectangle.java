package Resizeable;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width = "
                + getWidth()
                + " and length = "
                + getLength()
                + " has area = "
                + getArea()
                + " has perimeter = "
                + getPerimeter()
                + " ,which is subclas of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        double newWidth = getWidth() * percent / 100;
        double newLength = getLength() * percent / 100;
        System.out.print("New width of Rectangle = " + newWidth + " and new length = " + newLength);
    }
}
