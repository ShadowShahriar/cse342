public class MultiCatch {
	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
	}
}
