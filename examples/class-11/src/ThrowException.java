public class ThrowException {
	static void check(int a) throws ArithmeticException {
		if (a < 0)
			throw new ArithmeticException("Negative Number");
		else
			System.out.println(a * a);
	}

	public static void main(String[] args) {
		try{
			check(10);
			check(-2);
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		}
	}
}
