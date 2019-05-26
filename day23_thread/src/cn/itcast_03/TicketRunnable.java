package cn.itcast_03;

/**
 * 怎么找?(多线程出问题的判断条件) A:看有没有共享数据 B:看对共享数据的操作是不是多条语句 C:看是不是在多线程程序中
 * 
 * 找到后，就把同时满足这三个条件的代码给锁起来。
 * 
 * 怎么锁? java提供了一种锁机制方式： synchronized(锁对象) { 需要被锁的代码; }
 * 锁对象:怎么做呢?反正不知道，所以，我们就用Object类的实例。
 * 
 * 注意：多个线程必须使用同一把锁。
 * 
 * @author 琛
 * 
 */
public class TicketRunnable implements Runnable {
	private int tickets = 100;
	private Object obj = new Object();

	public void run() {
		while (true) {
			synchronized (obj) {
				if (tickets > 0) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()
							+ "正在出售第" + (tickets--) + "张票");
				}
			}
		}
	}
}
