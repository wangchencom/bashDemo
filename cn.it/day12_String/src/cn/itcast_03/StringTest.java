package cn.itcast_03;

import java.util.Scanner;

/*
 * ģ���¼,�����λ���,����ʾ���м���
 * 
 * ˼·��
 * 		A:Ӧ���Ѿ��������û��������롣��String��ʾ�Ϳ��ԡ�
 * 		B:����¼�����ݣ��û��������롣
 * 		C:�����ݽ��бȽϡ�
 * 			ƥ�䣺�ɹ�
 * 			��ƥ�䣺ʧ�ܡ�
 *		D:�����λ��ᣬ˵����ѭ�����ơ��������������Ρ���forѭ����
 *		E:��ʾ���м��Ρ���ʵ�ܼ򵥡�
 */
public class StringTest {
	public static void main(String[] args) {
		// Ӧ���Ѿ��������û��������롣��String��ʾ�Ϳ��ԡ�
		String username = "admin";
		String password = "admin";

		// ���λ���
		for (int x = 0; x < 3; x++) {
			// x 0,1,2
			// ����¼�����ݣ��û��������롣
			Scanner sc = new Scanner(System.in);
			System.out.println("�������û�����");
			String name = sc.nextLine();
			System.out.println("���������룺");
			String pwd = sc.nextLine();
			// �����ݽ��бȽϡ�
			if (username.equals(name) && password.equals(pwd)) {
				System.out.println("��ϲ��,��¼�ɹ�");
				// ���������Ĳ�����С��Ϸ��
				break;
			} else {
				if ((2 - x) == 0) {
					System.out.println("�˺ű�����,��������ϼ��ϵ");
				} else {
					// 2,1,0
					System.out.println("��¼ʧ��,�㻹��" + (2 - x) + "�λ���");
				}
			}
		}
	}
}
