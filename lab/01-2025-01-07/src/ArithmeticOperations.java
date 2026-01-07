import java.util.*;

public class ArithmeticOperations {
    public static void sum(int a, int b){
        System.out.println("Sum is: " + (a + b ));
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
        sum(a,b);
    }
}
