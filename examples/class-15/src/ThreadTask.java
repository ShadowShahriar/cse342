class oddThread extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i += 2) {
			System.out.println("i: " + i);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

class evenThread implements Runnable {
	public void run() {
		for (int i = 0; i <= 10; i += 2) {
			System.out.println("i: " + i);

			try{
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class ThreadTask {
	public static void main(String[] args) {
		oddThread ot = new oddThread();
		ot.start();

		try{
			ot.join();
		} catch (Exception e) {
			System.out.println(e);
		}

		evenThread et = new evenThread();
		Thread et_wrapper = new Thread(et);
		et_wrapper.start();
	}
}
