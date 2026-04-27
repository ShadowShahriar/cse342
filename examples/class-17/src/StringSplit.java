public class StringSplit {
    public static void main(String[] args) {
        String s = "Hello BUBT";
        String[] words = s.split(" ");
        for (String i : words) {
            System.out.println(i);
        }
    }
}
