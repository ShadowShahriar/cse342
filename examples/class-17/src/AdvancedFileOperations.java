import java.util.*;
import java.io.*;

public class AdvancedFileOperations {
    public static void main(String[] args) throws IOException {
        // === prepare output file ===
        FileWriter w = new FileWriter("F:\\names_upper.txt");

        // === read input file ===
        File r = new File("F:\\names.txt");
        Scanner sc = new Scanner(r);
        while (sc.hasNextLine()) {
            w.write(sc.nextLine().toUpperCase() + "\n");
        }
        sc.close();
        w.close();
    }
}
