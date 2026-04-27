import java.util.*;
import java.io.*;

public class FileReadingDigits {
    public static void main(String[] args) throws FileNotFoundException {
        File r = new File("F:\\digits.txt");
        Scanner sc = new Scanner(r);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            System.out.println(a);
        }
        sc.close();
    }
}
