package pkg2;
import pkg1.BoxA;

class BoxB extends BoxA {
    BoxB(int h, int w, int d){
        super(h,w,d);
    }
}

public class Main {
    public static void main(String[] args) {
        BoxB b1 = new BoxB(5,10,15);
        b1.show();
    }
}
