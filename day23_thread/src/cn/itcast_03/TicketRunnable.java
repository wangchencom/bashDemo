package cn.itcast_03;

/**
 * ��ô��?(���̳߳�������ж�����) A:����û�й������� B:���Թ������ݵĲ����ǲ��Ƕ������ C:���ǲ����ڶ��̳߳�����
 * 
 * �ҵ��󣬾Ͱ�ͬʱ���������������Ĵ������������
 * 
 * ��ô��? java�ṩ��һ�������Ʒ�ʽ�� synchronized(������) { ��Ҫ�����Ĵ���; }
 * ������:��ô����?������֪�������ԣ����Ǿ���Object���ʵ����
 * 
 * ע�⣺����̱߳���ʹ��ͬһ������
 * 
 * @author �
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
							+ "���ڳ��۵�" + (tickets--) + "��Ʊ");
				}
			}
		}
	}
}
