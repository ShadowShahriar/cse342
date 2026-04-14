public class StringSearching {
	public static void main(String[] args) {
		boolean b = "ABC".equalsIgnoreCase("abc");
		System.out.println(b);

		String s = "Now is the time for all good men to come to the aid of their country";

		System.out.println(s.indexOf("the"));
		System.out.println(s.lastIndexOf("the"));
		System.out.println(s.indexOf("the", 10));
		System.out.println(s.lastIndexOf("the", 60));
	}
}
