public class ThreadJoin {
	public static void main(String[] args) {
		th t1 = new th();
		th t2 = new th();

		t1.start();
		try{
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		t2.start();
	}
}
