package Test;


public class Test05 {
	public static void main(String[] args) {
		String s = "Hello12345World";

		// ��������ͳ�Ʊ���
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;

		// �����ַ�����
		for (int x = 0; x < s.length(); x++) {
			char ch = s.charAt(x);
			
			
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


