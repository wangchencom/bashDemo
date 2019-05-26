package cn.itcast_04;

/*
 * �ַ����Ļ�ȡ���ܣ�
 * int length():��ȡ�ַ����ĳ���
 * char charAt(int index):�����ַ����и������������ַ�
 * int indexOf(int ch):����ָ���ַ��ڴ��ַ����е�һ�γ��ֵ�����
 * int indexOf(String str):����ָ���ַ����ڴ��ַ����е�һ�γ��ֵ�����
 * int indexOf(int ch,int fromIndex):�����ڴ��ַ����е�һ�γ���ָ���ַ�����������ָ����������ʼ������
 * int indexOf(String str,int fromIndex):�����ڴ��ַ����е�һ�γ���ָ���ַ�������������ָ����������ʼ������
 * String substring(int start):��ȡ�ַ��������ش�ָ��λ�ÿ�ʼ��ȡ����ַ�����
 * String substring(int start,int end)��ȡ�ַ��������ش�ָ��λ�ÿ�ʼ��ָ��λ�ý�����ȡ����ַ�����
 */
public class StringDemo {
	public static void main(String[] args) {
		// �����ַ�������
		String s = "helloworld";

		// int length():��ȡ�ַ����ĳ���
		System.out.println(s.length());
		System.out.println("--------");

		// char charAt(int index):�����ַ����и������������ַ�
		System.out.println(s.charAt(2));
		System.out.println("--------");

		// �����ַ�����
		for (int x = 0; x < s.length(); x++) {
			char ch = s.charAt(x);
			System.out.println(ch);
		}
		System.out.println("--------");

		// int indexOf(int ch):����ָ���ַ��ڴ��ַ����е�һ�γ��ֵ�����
		System.out.println(s.indexOf('l'));
		// int indexOf(int ch,int fromIndex):�����ڴ��ַ����е�һ�γ���ָ���ַ�����������ָ����������ʼ������
		System.out.println(s.indexOf('l', 4));
		System.out.println("--------");

		// �����ķ��������󲻰��ҡ�
		// String substring(int start):��ȡ�ַ��������ش�ָ��λ�ÿ�ʼ��ȡ����ַ�����
		System.out.println(s.substring(4));
		// String substring(int start,int end)��ȡ�ַ��������ش�ָ��λ�ÿ�ʼ��ָ��λ�ý�����ȡ����ַ�����
		System.out.println(s.substring(4, 8));
		
		//��ȡ�Ĵ�Ҫ����ǰһ����
		System.out.println(s.substring(0));
		System.out.println(s.substring(0,s.length()));
		
		System.out.println(s);
	}
}
