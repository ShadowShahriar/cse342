class Box {
    private double height, width, depth;

    Box() {
        height = width = depth = 3;
    }

    Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    Box(Box ob) {
        height = ob.height;
        width = ob.width;
        depth = ob.depth;
    }

    void volume() {
        System.out.println("Volume: " + (height * width * depth));
    }
}

class Box1 extends Box {
    private double weight;

    Box1(double weight){
        super();
        this.weight = weight;
    }

    Box1(double height, double width, double depth, double weight){
        super(height, width, depth);
        this.weight = weight;
    }

    Box1(Box1 ob){
        super(ob);
        this.weight = ob.weight;
    }

    void show() {
        System.out.println(weight);
    }
}

public class BoxClass {
    public static void main(String[] args) {
        Box1 ob1 = new Box1(4);
        ob1.volume();

        Box1 ob2 = new Box1(5, 10, 15, 20);
        ob2.volume();

        Box1 ob3 = new Box1(ob2);
        ob3.volume();
        ob3.show();
    }
}
