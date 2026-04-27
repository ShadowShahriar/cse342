public class StringReplaceAll {
    public static void main(String[] args) {
        String s = "Hello123 BUBT09";
        System.out.println(s);

        // s = s.replaceAll("\\d+", "#");
        s = s.replaceAll("[0-9]", "#");
        System.out.println(s);

        s = s.replaceAll("[a-z]|[A-Z]", "X");
        System.out.println(s);
    }
}
