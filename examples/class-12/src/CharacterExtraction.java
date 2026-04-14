public class CharacterExtraction {
	public static void main(String[] args) {
		char s = "abc".charAt(1);
		System.out.println(s);

		String t = "This is a demo of the get chars methods.";

		int start = 10;
		int end = 14;
		char buf[] = new char[end - start];
		t.getChars(start, end, buf, 0);
		System.out.println(buf);
	}
}