package cn.itcast_03;

public class RunnableDemo {
	public static void main(String[] args) {
		TicketRunnable tr = new TicketRunnable();

		Thread t1 = new Thread(tr);
		Thread t2 = new Thread(tr);
		Thread t3 = new Thread(tr);
		Thread t4 = new Thread(tr);

		t1.setName("����1");
		t2.setName("����2");
		t3.setName("����3");
		t4.setName("����4");

		t2.start();
		t3.start();
		t4.start();
		t1.start();
	}
}
