package cn.itcast_01;

/*
 * Ϊ�˿���ÿ��ȷʵ�ڱ仯������Ҫ���ܹ�֪���̶߳���������ж����?
 * ��Thread�����ṩ��һ��������
 * 		public final String getName():��ȡ�̶߳�������ơ�Ĭ������£����ֵ���� Thread-���(��Ŵ�0��ʼ)
 * 		public final void setName(String name):�����߳����ơ�
 * 
 * �߳��ࣺThread
 * 
 * ͨ���鿴API�����ǵ������̵߳ķ�ʽ��2�֡�
 * ��ʽ1���̳�Thread�ࡣ
 * 		A:����һ����̳�Thread�ࡣ
 * 		B:����Ҫ��дThread���run()������
 * 		C:���߳�������ִ�С�
 * 			ע�⣺�����̲߳�ִ�У��ǲ���ʹ��run()�����ġ����ʱ�򣬱���ʹ�������һ��������
 * 			            �����������start()�����������ʵ�����������飬��һ�����߳��������ڶ����Զ�����run()������
 * 
 */
public class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName()+i);
		}
	}
}
