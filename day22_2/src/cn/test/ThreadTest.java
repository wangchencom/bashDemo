package cn.test;

/*
 * ���̳߳���ĳ�����
 * 		��������Ʊ
 * 
 * ��һ�˻𳵣�k261(������-ʮ��)��Ʊ�����ˣ���ʣ200�š���4��������Ʊ��
 * ʹ�ö��̣߳�ģ�ⴰ����Ʊ��
 * 		
 * ���ַ�ʽʵ�֣�
 * ��ʽ1���̳�Thread��
 * ��ʽ2��ʵ��Runnable�ӿ�
 */
public class ThreadTest {
	
	public static void main(String[] args) {
		TicketThread tt1 = new TicketThread();
		TicketThread tt2 = new TicketThread();
		TicketThread tt3 = new TicketThread();
		TicketThread tt4 = new TicketThread();

		tt1.setName("����1");
		tt2.setName("����2");
		tt3.setName("����3");
		tt4.setName("����4");

		tt1.start();
		tt2.start();
		tt3.start();
		tt4.start();
	}
}
