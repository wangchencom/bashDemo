
/*
 * �����̵߳����ȼ����⣺
 * 		�߳�Ĭ�����ȼ���5����Χ��1-10��
 * 
 * public final int getPriority():��ȡ�߳����ȼ�
 * public final void setPriority(int newPriority):�����̵߳����ȼ���
 * 
 * ע�⣺���ȼ�������һ���ĳ̶��ϣ����̻߳�϶��ִ�л��ᡣ
 */
public class PriorityDemoTest {
	public static void main(String[] args) {
		PriorityDemo pd = new PriorityDemo();

		Thread t1 = new Thread(pd);
		Thread t2 = new Thread(pd);
		Thread t3 = new Thread(pd);

		t1.setName("��ƽ֮");
		t2.setName("����Ⱥ");
		t3.setName("��������");

		// IllegalArgumentException
		// �׳����쳣�����򷽷�������һ�����Ϸ�����ȷ�Ĳ�����
		// t1.setPriority(10000);

		// ��ȡ�߳����ȼ�
		// t3.setPriority(10);
		// t1.setPriority(1);
		// t2.setPriority(1);
		// System.out.println(t1.getPriority());
		// System.out.println(t2.getPriority());
		// System.out.println(t3.getPriority());

		//��ͣ�߳� yield()����
		
		t1.start();
		t2.start();
		t3.start();
	}
}
