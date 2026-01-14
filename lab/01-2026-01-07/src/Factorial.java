import java.util.*;
public class Factorial{
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double result = 1;
        while(true){
            if(n <= 0)
                break;
            else{
                result *= n;
                n--;
            }
        }

        System.out.print(result);
     }
}
