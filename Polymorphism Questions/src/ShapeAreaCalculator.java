class Shape {

    void calculateArea(int side) {
        System.out.println("Area of Square = " + (side * side));
    }

    void calculateArea(int length, int breadth) {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    void calculateArea(double radius) {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }

    void calculateArea(double base, double height) {
        System.out.println("Area of Triangle = " + (0.5 * base * height));
    }
}

public class ShapeAreaCalculator {

    public static void main(String[] args) {

        Shape s = new Shape();

        s.calculateArea(5);          // Square
        s.calculateArea(10, 20);     // Rectangle
        s.calculateArea(7.0);        // Circle
        s.calculateArea(8.0, 6.0);   // Triangle
    }
}