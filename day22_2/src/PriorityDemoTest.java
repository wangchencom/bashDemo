
/*
 * 测试线程的优先级问题：
 * 		线程默认优先级是5。范围是1-10。
 * 
 * public final int getPriority():获取线程优先级
 * public final void setPriority(int newPriority):更改线程的优先级。
 * 
 * 注意：优先级可以在一定的程度上，让线程获较多的执行机会。
 */
public class PriorityDemoTest {
	public static void main(String[] args) {
		PriorityDemo pd = new PriorityDemo();

		Thread t1 = new Thread(pd);
		Thread t2 = new Thread(pd);
		Thread t3 = new Thread(pd);

		t1.setName("林平之");
		t2.setName("岳不群");
		t3.setName("东方不败");

		// IllegalArgumentException
		// 抛出的异常表明向方法传递了一个不合法或不正确的参数。
		// t1.setPriority(10000);

		// 获取线程优先级
		// t3.setPriority(10);
		// t1.setPriority(1);
		// t2.setPriority(1);
		// System.out.println(t1.getPriority());
		// System.out.println(t2.getPriority());
		// System.out.println(t3.getPriority());

		//暂停线程 yield()方法
		
		t1.start();
		t2.start();
		t3.start();
	}
}
