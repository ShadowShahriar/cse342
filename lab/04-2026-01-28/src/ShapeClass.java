import java.lang.Math;

abstract class Shape{
    double d1, d2;
    Shape(double d1, double d2){
        this.d1 = d1;
        this.d2 = d2;
    }

    abstract void calcArea();

    abstract void calcPerimeter();
}

class Circle extends Shape {
    Circle(double d1){
        super(d1,0);
    }

    void calcArea(){
        System.out.println("Area: " + (Math.PI * Math.pow(d1, 2)));
    }

    void calcPerimeter(){
        System.out.println("Perimeter: " + (2 * Math.PI * d1));
    }
}

class Rectangle extends Shape {
    Rectangle(double d1, double d2){
        super(d1,d2);
    }

    void calcArea(){
        System.out.println("Area: " + (d1 * d2));
    }

    void calcPerimeter(){
        System.out.println("Perimeter: " + (2 * (d1 + d2)));
    }
}

public class ShapeClass {
    public static void main(String[] args) {
        Shape c = new Circle(4);
        c.calcArea();
        c.calcPerimeter();

        Shape rect = new Rectangle(10, 20);
        rect.calcArea();
        rect.calcPerimeter();
    }
}
