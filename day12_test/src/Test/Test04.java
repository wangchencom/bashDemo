/**
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

package Test;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		// Ӧ���Ѿ��������û��������롣��String��ʾ�Ϳ��ԡ�
		String username = "admin";
		String password = "admin";
		//���λ��ᡡ
		for (int i = 0; i < 3; i++) {
			//����¼���˻��������룮
			Scanner sc = new Scanner(System.in);
			System.out.println("�������û�����");
			String name = sc.nextLine();
			System.out.println("���������룺");
			String pwd =sc.nextLine();
			//�����ݽ��бȽ�
			if (username.equals(name) && password.equals(pwd)) {
				System.out.println("��ϲ���¼�ɹ�");
				break;
			}
		
		}
	}

}
