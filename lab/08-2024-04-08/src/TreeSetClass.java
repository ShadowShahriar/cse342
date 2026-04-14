import java.util.*;

public class TreeSetClass {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(100);
        set.add(20);
        set.add(50);
        set.add(50);

        System.out.println(set);
    }
}
