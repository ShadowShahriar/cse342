class M implements Runnable {
	public void run() {
		System.out.println("Thread is running");
	}
}

public class RunnableInterface {
	public static void main(String[] args) {
		M m1 = new M();
		Thread t1 = new Thread(m1);
		t1.start();
	}
}
