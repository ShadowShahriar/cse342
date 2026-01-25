import java.lang.Math;

class Shape {
    double value;

    Shape(double value) {
        this.value = value;
    }

    double getPerimeter(){
        return 1.0;
    }

    double getArea(){
        return 1.0;
    }
}

class Circle extends Shape {
    Circle(double radius) {
        super(radius);
    }

    double getPerimeter(){
        return 2 * Math.PI * value;
    }

    double getArea(){
        return Math.PI * (Math.pow(value, 2));
    }
}

public class ShapeClass {
    public static void main(String[] args) {
        Circle c = new Circle(4);
        System.out.println(
                "Area: " + c.getArea() +
                        "\nPerimeter: " + c.getPerimeter()
        );
    }
}
