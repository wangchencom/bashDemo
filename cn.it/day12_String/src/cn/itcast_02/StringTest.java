package cn.itcast_02;

/*
 * �����⣺
 * A:�ַ���һ����ʼ���Ͳ����Ա��ı�
 * 		ע�⣺����ָ�����ַ����ڳ����������ֵ���ܷ����ı䡣������˵�ַ��������ò��ܱ䡣
 * 
 * B:String s1 = new String("abc");String s2 = "abc";��������
 * 		�С�
 * 		��һ�ַ�ʽ����ʵ���ڴ���������������ڡ�
 * 		�ڶ��ַ�ʽ�����ڴ���ֻ��һ��������ڡ�
 */
public class StringTest {
	public static void main(String[] args) {
		String s = "hello";
		s += "world";
		System.out.println(s); // helloworld
	}
}
