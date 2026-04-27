import java.io.*;

public class BasicFileWrite {
    public static void main(String[] args) {
        try{
            FileWriter w = new FileWriter("F:\\file.txt");
            w.write("Hello BUBT");
            w.close();
        } catch(IOException e){
            System.out.println(e);
        }
    }
}
