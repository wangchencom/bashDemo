package cn.itcast_03;

import java.util.Scanner;

/*
 * �û���¼��
 * 		����϶���һ���û����ڡ������û������滹Ӧ����һ�������������ж��û���¼�Ƿ�ɹ���
 */
public class StringTest2 {
	public static void main(String[] args) {
		// ����һ���û�
		User user = new User();
		user.setUsername("admin");
		user.setPassword("admin");

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

			if (user.isLogin(name, pwd)) {
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
