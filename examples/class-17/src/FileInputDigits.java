import java.util.*;
import java.io.*;

public class FileInputDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            FileWriter w = new FileWriter("F:\\digits.txt");
            for(int i = 0; i < 10; i++){
                w.write(sc.nextInt() + "\n");
            }
            w.close();
        } catch(IOException e){
            System.out.println(e);
        }
    }
}
