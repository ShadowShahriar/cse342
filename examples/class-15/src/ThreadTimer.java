class th extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try{
			Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class ThreadTimer {
	public static void main(String[] args) {
		th t1 = new th();
		t1.start();
	}
}
