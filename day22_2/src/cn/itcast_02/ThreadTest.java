package cn.itcast_02;

/***
 * 
 *�����̵߳ĵ�2�ַ�ʽʵ���̣߳�
 *���������̷ֱ߳���������Ϊ�й����ձ���Ȼ�����������̡߳�
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
