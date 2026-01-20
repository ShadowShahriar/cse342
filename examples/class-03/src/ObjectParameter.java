class Add {
    int a, b;

    Add(int a, int b) {
        this.a = a;
        this.b = b;
    }

    boolean get(Add Ob) {
        if(Ob.a == a && Ob.b == b)
            return true;
        return false;
    }
}

public class ObjectParameter {
    public static void main(String[] args) {
        Add Ob1 = new Add(5, 6);
        Add Ob2 = new Add(10, 100);
        // Add Ob3 = new Add();

        System.out.println(Ob1.get(Ob2));
    }
}
