package cn.sanyuandemo;

import java.util.Scanner;

/***
 * �����������(��Ԫ�����) (�������ʽ)?���ʽ1�����ʽ2��
 * 
 * ע�⣺�������ʽ˵�����ｫ��ֻ���ǽ��Ϊtrue����false�ı��ʽ��
 * 
 * ִ��˳�� ����������ʽΪtrue���Ͱѱ��ʽ1��Ϊ����� ����������ʽΪfalse���Ͱѱ��ʽ2��Ϊ�����
 * 
 * 
 * @author � ����¼�� Scanner���� ʹ�ò��� A:���� import java.util.Scanner; B:�������� Scanner
 *         sc = new Scanner(System.in);
 * 
 *         System.in:�Ǳ�׼����������Ӧ�ż���¼�롣 C:���÷�����ȡint�������� int number = sc.nextInt();
 */
public class SanYuan_ScannerDemo {
	public static void main(String[] args) {
		int x = 100;
		int y = (x > 50) ? 100 : 200;
		// ���ӵ�
		int z = (x > 200) ? ((y < 40) ? 100 : 200) : ((y > 100) ? 300 : 200);
		System.out.println(z);
		// ��װ����¼������
		Scanner sc = new Scanner(System.in);
		// ����һ����������
		int num = sc.nextInt();
		System.out.println(num);

		// ������һ :
		// ʹ����ߵ�Ч��д�������԰����ʽ��.
		// 2*8 -- 2<<3

		// �������
		// ����������ݽ�����
		// ������
		// int a = 10;
		// int b = 20;
		// �����
		// a = 20;
		// b = 10;
		//
		// ����ʹ�õ�������������ʽ��
		// ����ʹ��λ^�������
		// ���䣺���������a,b
		// ��ߣ�a,b,a
		// �ұߣ�a^b
		int a = 10;
		int b = 20;

		// ����1��������ʱ����(������)
		/*
		 * int temp = a; a = b; b = temp; System.out.println(a+"***"+b);
		 */

		// ����2��ʹ��λ^�����
		// �ص㣺һ�����ݶ�ͬһ������λ^�������Σ����ݲ��䡣
		// System.out.println(a ^ b);
		// System.out.println(a ^ b ^ b);

		a = a ^ b;
		b = a ^ b; // a ^ b ^ b = a
		a = a ^ b; // a ^ b ^ a = b
		System.out.println(a + "***" + b);
		/*
		 * a = a ^ b
		 * b = a^ b
		 * a = a^ b
		 */
	}
}
