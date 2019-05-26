package cn.itcast_02;

/***
 * 
 *需求：线程的第2种方式实现线程，
 *并给两个线程分别设置名字为中国，日本，然后运行两个线程。
 */
public class ThreadTest {
	public static void main(String[] args) {
		MyRunneable my = new MyRunnable();
		Thread t1 = new Thread(my);
		Thread t2 = new Thread(my);
		t1.setName("111");
		t2.setName("222");
		t1.start();
		t2.start();
		
	}
}
