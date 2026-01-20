class Z {
    int i, j;
    void show1() {
        System.out.println("i: " + i + ", j: " + j);
    }
}

class W extends Z {
    int k;
    void set(int i, int j, int k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }
    void show(){
        System.out.println(i * j * k);
    }
}

public class InheritanceWithMethods {
    public static void main(String[] args) {
        W ob = new W();
        ob.set(10, 20, 30);
        ob.show();
        ob.show1();
    }
}
