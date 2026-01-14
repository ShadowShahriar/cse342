import java.util.*;
public class PrimeOrNot{
    public static boolean isPrime(long d){
        if(d == 1)
            return false;
        if(d == 2 || d == 3 || d == 5)
            return true;
        for(long i = 2; i < d; i++){
            if(d % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.print("is prime? " + isPrime(n));
    }
}
