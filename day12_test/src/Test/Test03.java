/**
 * �жϹ��ܣ�
 *һ boolean equals(Object obj)���ж��ַ����������Ƿ���ͬ,���ִ�Сд��
 * ��boolean equalsIgnoreCase(String str):�ж��ַ����������Ƿ���ͬ,�����ִ�Сд��
 * ��boolean contains(String str):�ж��ַ��������Ƿ�����������ַ�����
 * ��boolean startsWith(String str):�ж��ַ��������Ƿ��Ը������ַ�����ʼ��
 * ��boolean endsWith(String str):�ж��ַ��������Ƿ��Ը������ַ���������
 * ��boolean isEmpty():�ж��ַ��������Ƿ�Ϊ�ա������Ƿ�Ϊ�ա�
 */
package Test;

public class Test03 {
	public static void main(String[] args) {
		//�����ַ�������
		String s = "HelloWorld";
		//����һ:�ж��ַ����������Ƿ���ͬ,���ִ�Сд��
		System.out.println(s.equals("helloworld"));
		System.out.println(s.equals("HelloWorld"));
		System.out.println("*****************");
		//���Զ�:�ж��ַ����������Ƿ���ͬ,�����ִ�Сд��
		System.out.println(s.equalsIgnoreCase("helloworld"));
		System.out.println(s.equalsIgnoreCase("hellOWorld"));
		System.out.println("*****************");
		//���������ж��ַ��������Ƿ�����������ַ�����
		System.out.println(s.contains("he"));
		System.out.println(s.contains("or"));
		System.out.println("*****************");
		//������:�ж��ַ��������Ƿ��Ը������ַ�����ʼ��
		System.out.println(s.startsWith("w"));
		System.out.println(s.startsWith("H"));
		System.out.println("*****************");
		//�����壺�ж��ַ��������Ƿ��Ը������ַ���������
		System.out.println(s.endsWith("l"));
		System.out.println(s.endsWith("d"));
		System.out.println("*****************");
		//������;�ж��ַ��������Ƿ�Ϊ�ա������Ƿ�Ϊ�ա�
		System.out.println(s.isEmpty());
		//���		String s = "";
		//��			 String s = null;
		//������
		String s2 ="";
		//String s3 = null;
		
		System.out.println(s2.isEmpty());
		//System.out.println(s3.isEmpty());  NullPointerException��ָ���쳣

	}

}
