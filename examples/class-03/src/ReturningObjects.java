class Addi {
    int a, b;

    Addi(int a, int b) {
        this.a = a;
        this.b = b;
    }

    boolean get(Addi Ob) {
        if(Ob.a == a && Ob.b == b)
            return true;
        return false;
    }

    Addi back(Addi Ob){
        Addi temp = new Addi(3, 4);
        temp.a = a + Ob.a;
        temp.b = b + Ob.b;
        return temp;
    }
}

public class ReturningObjects {
    public static void main(String[] args) {
        Addi Ob2 = new Addi(10, 100);
        Addi Ob3 = Ob2.back(Ob2);
        System.out.println(Ob3.a + " " + Ob3.b);
    }
}
