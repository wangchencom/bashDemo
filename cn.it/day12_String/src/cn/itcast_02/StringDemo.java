package cn.itcast_02;

/*
 * �ַ������ɶ���ַ����һ�����ݡ�
 * String s = "hello";
 * 
 * ���췽����
 * String()
 * String(byte[] bytes) 
 * String(byte[] bytes, int index, int length) 
 * String(char[] value) 
 * String(char[] value, int index, int length) 
 * String(String str) 
 * ֱ�Ӹ��ַ�������ֵ��
 * 
 * ��Ա������
 * 		public int length()����ȡ�ַ����ĳ���
 */
public class StringDemo {
	public static void main(String[] args) {
		// ��ʽ1 String()
		String s1 = new String();
		// s1 = "abcde";
		System.out.println("s1:" + s1);
		System.out.println("s1.length():" + s1.length());
		System.out.println("--------------------------");

		// ��ʽ2 String(byte[] bytes)
		byte[] bys = { 97, 98, 99, 100, 101 };
		String s2 = new String(bys);
		System.out.println("s2:" + s2);
		System.out.println("s2.length()" + s2.length());
		System.out.println("--------------------------");

		// ��ʽ3 String(byte[] bytes, int index, int length)
		String s3 = new String(bys, 2, 3);
		// StringIndexOutOfBoundsException �ַ�������Խ���쳣
		// String s3 = new String(bys, 2, 32);
		System.out.println("s3:" + s3);
		System.out.println("s3.length():" + s3.length());
		System.out.println("--------------------------");

		// ��ʽ4 String(char[] value)
		char[] chs = { 'a', 'b', 'c', 'd', 'e' };
		String s4 = new String(chs);
		System.out.println("s4:" + s4);
		System.out.println("s4.length():" + s4.length());
		System.out.println("--------------------------");

		// ��ʽ5 String(char[] value, int index, int length)
		String s5 = new String(chs, 1, 3);
		System.out.println("s5:" + s5);
		System.out.println("s5.length():" + s5.length());
		System.out.println("--------------------------");

		// ��ʽ6 String(String str)
		String s6 = new String("abcde");
		System.out.println("s6:" + s6);
		System.out.println("s6.length():" + s6.length());
		System.out.println("--------------------------");

		// ��ʽ7
		String s7 = "abcde";
		System.out.println("s7:" + s7);
		System.out.println("s7.length():" + s7.length());
		System.out.println("--------------------------");
	}
}
