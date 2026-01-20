class Sum {
    int add(int a, int b){
        return a + b;
    }

    double add(double a, double b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }
}

public class SumClass {
    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println(
                s.add(1,2) +
                s.add(2.5,1.5) +
                s.add(1,2, 3)
        );
    }
}
