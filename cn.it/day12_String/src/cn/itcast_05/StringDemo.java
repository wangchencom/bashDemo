package cn.itcast_05;

/*
 * byte[] getBytes():���ַ���ת�����ֽ����顣
 * char[] toCharArray()�����ַ���ת�����ַ����顣
 * static String copyValueOf(char[] chs):���ַ�����ת�����ַ�����
 * static String valueOf(char[] chs):���ַ�����ת�����ַ�����
 * static String valueOf(int i)�������ͣ���int���������ͣ�ת�����ַ�����
 * String toLowerCase()�����ַ������Сд
 * String toUpperCase():���ַ�����ɴ�д
 * String concat(String str):ƴ���ַ�����
 */
public class StringDemo {
	public static void main(String[] args) {
		// �����ַ�������
		String s = "HelloWorld";

		// byte[] getBytes():���ַ���ת�����ֽ����顣
		byte[] bys = s.getBytes();
		for (int x = 0; x < bys.length; x++) {
			System.out.println(bys[x]);
		}
		System.out.println("-----------------");

		// char[] toCharArray()�����ַ���ת�����ַ����顣
		char[] chs = s.toCharArray();
		for (int x = 0; x < chs.length; x++) {
			System.out.println(chs[x]);
		}
		System.out.println("-----------------");

		// static String copyValueOf(char[] chs):���ַ�����ת�����ַ�����
		char[] chs2 = { 'a', 'b', 'c', '��', '��' };
		String s2 = String.copyValueOf(chs2);
		System.out.println(s2);
		System.out.println("-----------------");

		// static String valueOf(char[] chs):���ַ�����ת�����ַ�����
		String s3 = String.valueOf(chs2);
		System.out.println(s3);
		System.out.println("-----------------");

		// static String valueOf(int i)
		int i = 100;
		String s4 = String.valueOf(i);
		System.out.println(s4);
		System.out.println("-----------------");

		// String toLowerCase()�����ַ������Сд
		System.out.println(s.toLowerCase());
		// String toUpperCase():���ַ�����ɴ�д
		System.out.println(s.toUpperCase());
		System.out.println("-----------------");

		// String concat(String str):ƴ���ַ�����
		String s5 = "hello";
		String s6 = s5 + "world";
		String s7 = s5.concat("world");
		System.out.println(s6);
		System.out.println(s7);
	}
}
