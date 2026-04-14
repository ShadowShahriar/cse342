public class StringConstruction {
	public static void main(String[] args) {
		String s1 = new String();

		char[] c1 = { 'a', 'b', 'c','d','e','f' };
		String s2 = new String(c1);
		String s3 = new String(c1, 2, 3);

		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s2);
		System.out.println(s3);

		String s4 = "four" + 2 + 2;
		System.out.println(s4);

		String s5 = "four" + (2 + 2);
		System.out.println(s5);
	}
}
