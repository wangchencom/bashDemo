package cn.test;


public class DaemonDemoTest {
	public static void main(String[] args) {
		DaemonDemo dd = new DaemonDemo();

		Thread t1 = new Thread(dd);
		Thread t2 = new Thread(dd);

		t1.setDaemon(true);
		t2.setDaemon(true);

		t1.start();
		t2.start();

		for (int x = 0; x < 5; x++) {
			System.out.println(Thread.currentThread().getName() + "Ϊ" + x);
		}
	}

}