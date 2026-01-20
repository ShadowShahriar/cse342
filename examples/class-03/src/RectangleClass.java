class Rectangle {
    double area;

    Rectangle(double area){
        this.area = area;
    }

    Rectangle get(Rectangle r1, Rectangle r2){
        Rectangle temp = new Rectangle(1);
        temp.area = r1.area * r2.area;
        return temp;
    }
}

public class RectangleClass {
    public static void main(String[] args) {
        Rectangle rX = new Rectangle(1);
        Rectangle r1 = new Rectangle(15);
        Rectangle r2 = new Rectangle(2);
        Rectangle r3 = rX.get(r1, r2);
        System.out.println(r3.area);
    }
}
