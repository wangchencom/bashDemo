

import java.util.Scanner;

public class LoginTest {
	public static void main(String[] args) {
		//�û���������
		String username = "admin";
		String userpw = "admin";
		//�Ӽ��������û���������
		for (int i = 0; i <3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("�������û�����");
			String name = sc.nextLine();
			System.out.print("���������룺");
			String pw = sc.nextLine();
			//
			if (name==username && pw == userpw) {
				System.out.println("��ϲ����½�ɹ���");
				break;
			}else{
				if (2-i==0) {
					System.out.println("�������3���˺ű����������ڹ�����ǰ���������Ϻ���������˺�");
				}else {
						System.out.println("�˺�����������󣬵�¼ʧ�ܡ��㻹��"+(2-i)+"�λ��ᡣ");					
				}
			}
		}
	}
}
