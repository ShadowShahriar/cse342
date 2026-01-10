class Box{
    private double height, width, depth;

    void set(double height, double width, double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    void volume(){
        System.out.println("Volume: " + (height * width * depth));
    }
}

public class BoxClass {
    public static void main(String[] args){
        Box B1 = new Box();
        Box B2 = new Box();
        B1.set(10,20,30);
        B1.volume();
        B2.set(40,50,60);
        B2.volume();
    }
}
