public class UnionException {
	public static void main(String[] args) {
		String t = null;
		try {
			System.out.println(t.length());
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println(e);
		}
	}
}
