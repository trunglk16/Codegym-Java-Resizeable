package Resizeable;


public class ResizeableTest {
    public static void main(String[] args) {
        Circle circle = new Circle(25.9);
        double percent = Math.random() * 100 + 1;
        System.out.println(percent);
        System.out.println(circle);
        circle.resize(percent);

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(25.9);
        shapes[1] = new Rectangle(16.11, 25.9);
        shapes[2] = new Square(25.9);




        System.out.println("Pre-resized:");
        for (Shape shape : shapes
        ) {
            System.out.println(shape);
        }

        System.out.println("After-resized:");
        for (Shape shape : shapes
        ) {
            shape.resize(percent);
        }
    }
}
