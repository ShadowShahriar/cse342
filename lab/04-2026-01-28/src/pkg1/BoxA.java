package pkg1;

public class BoxA {
    int height, width, depth;

    public BoxA(int h, int w, int d){
        height = h;
        width = w;
        depth = d;
    }

    public void show(){
        System.out.println(height * width * depth);
    }
}

class BoxB{
    BoxB(){
        BoxA b_A = new BoxA(2,4,5);
        b_A.show();
    }
}