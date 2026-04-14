class MTG<T1, T2>{
    T1 a;
    T2 b;

    MTG(T1 a, T2 b){
        this.a = a;
        this.b = b;
    }

    void show(){
        System.out.println(a);
        System.out.println(b);
    }
}

public class MultiTypeGeneric {
    public static void main(String[] args) {
        MTG<String, Character> test = new MTG<>("Cricket", 'C');
        test.show();
    }
}
