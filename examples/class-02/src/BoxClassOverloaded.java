class BoxO{
    private double height, width, depth;

    BoxO(){
        this.height = 10;
        this.width =20;
        this.depth = 30;
    }

    BoxO(double height, double width, double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    void volume(){
        System.out.println("Volume: " + (height * width * depth));
    }
}

public class BoxClassOverloaded {
    public static void main(String[] args){
        BoxO B1 = new BoxO(40,50,60);
        B1.volume();

        BoxO B2 = new BoxO();
        B2.volume();
    }
}