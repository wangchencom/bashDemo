package cn.itcast_01;

import java.util.Scanner;

/*
 * int -- int			����
 * String -- String		����
 * String -- int		����	
 * int -- String		������
 * 
 * ��ν���������ȷ�������
 * A:���´���һ��Scanner����
 * B:�����ַ������գ�Ȼ���һ���ַ���ת����int���͡�
 */
public class ScannerDemo2 {
	public static void main(String[] args) {
		// ��������
		Scanner sc = new Scanner(System.in);

		// ��ȡ����int��������
		int a = sc.nextInt();
		// int b = sc.nextInt();

		//��sc�������¸�ֵ
		sc = new Scanner(System.in);
		// ��ȡ�����ַ�������
		// String a = sc.nextLine();
		String b = sc.nextLine();
		// int b = sc.nextInt();
		System.out.println(a + "***" + b);
		char c = 97;
	}
}
