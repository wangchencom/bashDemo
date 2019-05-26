package cn.test;

/*
 * 多线程程序的场景：
 * 		窗口卖火车票
 * 
 * 有一趟火车：k261(北京西-十堰)，票不多了，还剩200张。有4个窗口卖票。
 * 使用多线程，模拟窗口卖票。
 * 		
 * 两种方式实现：
 * 方式1：继承Thread类
 * 方式2：实现Runnable接口
 */
public class ThreadTest {
	
	public static void main(String[] args) {
		TicketThread tt1 = new TicketThread();
		TicketThread tt2 = new TicketThread();
		TicketThread tt3 = new TicketThread();
		TicketThread tt4 = new TicketThread();

		tt1.setName("窗口1");
		tt2.setName("窗口2");
		tt3.setName("窗口3");
		tt4.setName("窗口4");

		tt1.start();
		tt2.start();
		tt3.start();
		tt4.start();
	}
}
