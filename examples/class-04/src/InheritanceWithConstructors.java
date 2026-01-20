class Area {
    int height, width;

    Area() {
        height = width = 2;
    }

    Area(int height, int width){
        this.height = height;
        this.width = width;
    }

    Area(Area ob){
        height = ob.height;
        width = ob.width;
    }

    void show(){
        System.out.println(height * width);
    }
}

class Rectangle extends Area {
    Rectangle() {
        super();
    }

    Rectangle(int height, int width){
        super(height, width);
    }

    Rectangle(Rectangle ob) {
        super(ob);
    }
}

public class InheritanceWithConstructors {
    public static void main(String[] args) {
        Rectangle ob1 = new Rectangle();
        ob1.show();

        Rectangle ob2 = new Rectangle(4, 2);
        ob2.show();

        Rectangle ob3 = new Rectangle(ob2);
        ob3.show();
    }
}
