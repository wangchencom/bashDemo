package cn.itcast_03;

/*
 * �жϹ��ܣ�
 * boolean equals(Object obj)���ж��ַ����������Ƿ���ͬ,���ִ�Сд��
 * boolean equalsIgnoreCase(String str):�ж��ַ����������Ƿ���ͬ,�����ִ�Сд��
 * boolean contains(String str):�ж��ַ��������Ƿ�����������ַ�����
 * boolean startsWith(String str):�ж��ַ��������Ƿ��Ը������ַ�����ʼ��
 * boolean endsWith(String str):�ж��ַ��������Ƿ��Ը������ַ���������
 * boolean isEmpty():�ж��ַ��������Ƿ�Ϊ�ա������Ƿ�Ϊ�ա�
 */
public class StringDemo {
	public static void main(String[] args) {
		// �����ַ�������
		String s = "HelloWorld";

		// boolean equals(Object obj)���ж��ַ����������Ƿ���ͬ,���ִ�Сд��
		System.out.println(s.equals("HelloWorld"));
		System.out.println(s.equals("helloworld"));
		System.out.println("--------------------");

		// boolean equalsIgnoreCase(String str):�ж��ַ����������Ƿ���ͬ,�����ִ�Сд��
		System.out.println(s.equalsIgnoreCase("HelloWorld"));
		System.out.println(s.equalsIgnoreCase("helloworld"));
		System.out.println("--------------------");

		// boolean contains(String str):�ж��ַ��������Ƿ�����������ַ�����
		System.out.println(s.contains("or"));
		System.out.println(s.contains("ak"));
		System.out.println("--------------------");

		// boolean startsWith(String str):�ж��ַ��������Ƿ��Ը������ַ�����ʼ��
		System.out.println(s.startsWith("Hel"));
		System.out.println(s.startsWith("hello"));
		System.out.println("--------------------");

		// boolean endsWith(String str):�ж��ַ��������Ƿ��Ը������ַ���������ʡ�Բ�����

		// boolean isEmpty():�ж��ַ��������Ƿ�Ϊ�ա������Ƿ�Ϊ�ա�
		System.out.println(s.isEmpty());
		String s2 = "";
		System.out.println(s2.isEmpty());
		// String s3 = null;
		// NullPointerException ��ָ���쳣
		// System.out.println(s3.isEmpty());
	}
}
