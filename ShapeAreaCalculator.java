//Shape area calculator 
abstract class ShapeArea {
    abstract void caculateArea(); 
}
class Circle extends ShapeArea {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    void caculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle : " + area);
    }
}
class Rectangle extends ShapeArea {
    double length;
    double breadth;
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    void caculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle : " + area);
    }
}
class Triangle extends ShapeArea {
    double base;
    double height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    void caculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle : " + area);
    }
}
public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.caculateArea();
        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.caculateArea();
        Triangle triangle = new Triangle(3, 8);
        triangle.caculateArea();
    }
}