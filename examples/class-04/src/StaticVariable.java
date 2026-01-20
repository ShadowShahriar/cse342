class A{
    static int a = 10;
    static int b = 20;
    int c = 30;

    static void show(){
        System.out.println("a: " + a + "\nb: " + b);
    }

    static {
        System.out.println("Hello.");
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        final int x = 20;
        A.show();
        System.out.println(x);
    }
}
