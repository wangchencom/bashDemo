package cn.test;

public class DaemonDemo implements Runnable {

	@Override
	public void run() {
		for (int x = 0; x < 1000; x++) {
			System.out.println(Thread.currentThread().getName() + "Ϊ" + x);
		}
	}

}