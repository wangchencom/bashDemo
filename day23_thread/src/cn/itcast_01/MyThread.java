package cn.itcast_01;

/*
 * 为了看到每次确实在变化，我们要是能够知道线程对象的名字有多好呢?
 * 在Thread类中提供了一个方法：
 * 		public final String getName():获取线程对象的名称。默认情况下，名字的组成 Thread-编号(编号从0开始)
 * 		public final void setName(String name):设置线程名称。
 * 
 * 线程类：Thread
 * 
 * 通过查看API，我们到创建线程的方式有2种。
 * 方式1：继承Thread类。
 * 		A:定义一个类继承Thread类。
 * 		B:子类要重写Thread类的run()方法。
 * 		C:让线程启动并执行。
 * 			注意：启动线程并执行，是不能使用run()方法的。这个时候，必须使用另外的一个方法。
 * 			            这个方法名是start()。这个方法其实做了两件事情，第一，让线程启动。第二，自动调用run()方法。
 * 
 */
public class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName()+i);
		}
	}
}
