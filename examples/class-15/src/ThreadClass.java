class Multi extends Thread {
	public void run() {
		System.out.println("Thread running.");
	}
}

public class ThreadClass {
	public static void main(String[] args) {
		Multi m1 = new Multi();
		m1.start();
	}
}
