public class NestedTry {
	public static void main(String[] args) {
		String s = "";
		int a = 2;
		int b = 0;

		try{
			System.out.println(s.length());
			try {
				int c = a / b;
				System.out.println(c);
			}
			catch (ArithmeticException e) {
				System.out.println(e);
			}
		} catch (NullPointerException e) {
			System.out.println(e);
		}
	} 
}
