import java.util.*;
import java.io.*;

class NumChecker{
    static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    static boolean isPrime(long d){
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
}

public class AdvancedFileDigits {
    public static void main(String[] args) throws IOException {
        FileWriter outOdd = new FileWriter("F:\\digits_odd.txt");
        FileWriter outEven = new FileWriter("F:\\digits_even.txt");
        FileWriter outPrime = new FileWriter("F:\\digits_prime.txt");

        File input = new File("F:\\digits.txt");
        Scanner sc = new Scanner(input);
        while(sc.hasNextInt()) {
            int num = sc.nextInt();

            if(NumChecker.isEven((num)))
                outEven.write(num + "\n");
            else if(NumChecker.isOdd((num)))
                outOdd.write(num + "\n");

            if(NumChecker.isPrime((num)))
                outPrime.write(num + "\n");
        }

        outOdd.close();
        outEven.close();
        outPrime.close();
    }
}
