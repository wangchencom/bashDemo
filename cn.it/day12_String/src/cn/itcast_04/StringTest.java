package cn.itcast_04;

/*
 * ͳ�ƴ�дСд�ַ��ĸ���
 * 
 * ������
 * 		Hello12345World
 * 
 * 		��д��2
 * 		Сд��8
 * 		���֣�5
 * 
 * ˼·��
 * 		A:��������ͳ�Ʊ���
 * 		B:��ȡ��ÿһ���ַ��������ַ�����
 * 		C:�ж����������ַ�Χ��
 * 			��д��65-90
 * 			Сд��97-122
 * 			���֣�48-57
 *		C:����������++
 */
public class StringTest {
	public static void main(String[] args) {
		String s = "Hello12345World";

		// ��������ͳ�Ʊ���
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;

		// �����ַ�����
		for (int x = 0; x < s.length(); x++) {
			char ch = s.charAt(x);
			// �ж����������ַ�Χ��
//			if (ch >= 65 && ch <= 90) {
//				bigCount++;
//			} else if (ch >= 97 && ch <= 122) {
//				smallCount++;
//			} else if (ch >= 48 && ch <= 57) {
//				numberCount++;
//			}
			
			if (ch >= 'A' && ch <= 'Z') {
				bigCount++;
			} else if (ch >= 'a' && ch <= 'z') {
				smallCount++;
			} else if (ch >= '0' && ch <= '9') {
				numberCount++;
			}
		}

		System.out.println("��д��" + bigCount);
		System.out.println("Сд��" + smallCount);
		System.out.println("���֣�" + numberCount);
	}
}
